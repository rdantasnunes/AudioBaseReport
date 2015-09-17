package br.ufla.deg.audiobasereport.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
public class Avaliacao {
    
    private Integer id;
    
    private String titulo;
    
    private Date dataHora;
    
    private String diretorioArquivos;
    
    private String codec;
    
    private String genre;
    
    private List<ItemAvaliacao> itens;

    public Avaliacao(String titulo, Date dataHora, String genre,
            String diretorioArquivos,String codec) {
        this.titulo = titulo;
        this.dataHora = dataHora;
        this.genre = genre;
        this.codec = codec;
        this.diretorioArquivos = diretorioArquivos;
        this.itens = new ArrayList();
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the dataHora
     */
    public Date getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the itens
     */
    public List<ItemAvaliacao> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<ItemAvaliacao> itens) {
        this.itens = itens;
    }

    /**
     * @return the diretorioArquivos
     */
    public String getDiretorioArquivos() {
        return diretorioArquivos;
    }

    /**
     * @param diretorioArquivos the diretorioArquivos to set
     */
    public void setDiretorioArquivos(String diretorioArquivos) {
        this.diretorioArquivos = diretorioArquivos;
    }

    /**
     * @return the codec
     */
    public String getCodec() {
        return codec;
    }

    /**
     * @param codec the codec to set
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }
    
}
