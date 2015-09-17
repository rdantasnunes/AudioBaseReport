package br.ufla.deg.audiobasereport.dao;

import br.ufla.deg.audiobasereport.entidades.Avaliacao;
import br.ufla.deg.audiobasereport.entidades.ItemAvaliacao;
import br.ufla.deg.audiobasereport.gui.Analise;
import br.ufla.deg.audiobasereport.utils.ExibeRel;
import br.ufla.deg.audiobasereport.utils.ManipulaBD;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Federal University of Lavras - Lavras - MG - Brazil
 * Engineering Department
 * Post graduate program in System Engineering and Automation
 * @author Rodrigo Dantas Nunes
 *         Teacher Advisor Dsc. Demóstenes Zegarra Rodríguez
 * @since 2015
 * @version 1.0
 * Copyrigth© Rodrigo Dantas Nunes
 */
public class Dao {

    private ManipulaBD manipulaBD;

    public Dao(String login,String senha, String url,String driver) {

        try {
            manipulaBD = new ManipulaBD(login,senha,url,driver);
            //manipulaBD.insere("avaliacao", "id,nome_arquivo,pesq_mos,563_mos", "1,'teste de insercao',1.0,2.0");
            /*File dir = new File("temp_dg");
             if (!dir.exists()) {
             dir.mkdir();
             }*/
        } catch (Exception ex) {
            Logger.getLogger(Analise.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inserirAvaliacao(Avaliacao avaliacao){
        String campos = "id,titulo,data_hora,genre,codec,diretorio_arquivos"; //"id,nome_arquivo,pesq_mos,563_mos,taxa_perda, genre";
        String dataHora = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(avaliacao.getDataHora());
        String valores = "null,'"+avaliacao.getTitulo()+"', '"+
                dataHora+"', '"+avaliacao.getGenre()+"','"+avaliacao.getCodec()+"','"
                +avaliacao.getDiretorioArquivos()+"'";
        int id_avaliacao;
        try {
            manipulaBD.insere("avaliacao", campos, valores);
            ResultSet rs = manipulaBD.consulta("select id from avaliacao order by id desc limit 1");
            if(rs.next()){
                id_avaliacao = rs.getInt("id");
                
                campos = "nome_arquivo,pesq_mos,563_mos,taxa_perda,avaliacao_id";
                
                for(ItemAvaliacao item :avaliacao.getItens()){
                    manipulaBD.insere("item_avaliacao", campos, "'"+item.getNomeArquivo()+"',"+
                            item.getPesqMos().toString()+","+item.getMos563().toString()+","+
                            item.getTaxaPerda().toString()+","+
                            String.valueOf(id_avaliacao));
                }
                ExibeRel exibeRel = new ExibeRel(manipulaBD);
                String erro = exibeRel.exibeRelatorioSimples("select * from avaliacao a inner join item_avaliacao i on a.id = i.avaliacao_id "
                        + "where a.id = "+id_avaliacao
                        + " order by a.titulo, i.nome_arquivo, i.taxa_perda", "reports/listagemResultados", null);
                if(erro != null){
                    System.out.println(erro);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void close(){
        try {
            manipulaBD.desconecta();
        } catch (Exception ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
