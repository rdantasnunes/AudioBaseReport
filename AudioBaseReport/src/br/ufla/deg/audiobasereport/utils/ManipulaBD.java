package br.ufla.deg.audiobasereport.utils;

import java.sql.*;

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

public class ManipulaBD{
    //recebem o driver e a URL como padrao, mas podem ser alterados ao instanciar o objeto
    
    protected Connection con  = null;
    protected Statement stmt = null;
    protected CallableStatement cstmt = null;
    protected ResultSet rs = null;
   
    /**
     *Construtor que apenas abre a conexao utilizando o driver e url padrao.
     * @param url
     * @param driver
     * @throws java.sql.SQLException
     */
    public ManipulaBD(String url, String driver) throws SQLException, Exception{
        conecta(url, driver);
    }
    /**
     *Construtor que apenas abre a conexao utilizando o driver e url padrao.
     *@param login Login a ser utilizado
     *@param senha Senha correspondente ao Login
     *@param url url do banco de dados
     *@param driver driver da conexao
     * @throws java.sql.SQLException
     */
    public ManipulaBD(String login,String senha, String url,String driver) throws SQLException, Exception{
        conecta(login,senha, url,driver);
    }
    
    /**
     * Encerra a conexao com o banco de dados.
     * @throws java.sql.SQLException
     */
    public void desconecta() throws SQLException, Exception{
       
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(con != null) con.close();
        if(cstmt != null) cstmt.close();
    }

    /**
     * Faz a conexao com banco de dados recebendo a URL e o driver para conexao.
     *
     * @param url
     * @param driver
     * @throws java.sql.SQLException
     * @throws java.lang.Exception
     */
    public final void conecta(String url,String driver) throws SQLException, Exception{
        Class.forName(driver);
        con = DriverManager.getConnection(url);
        stmt = con.createStatement();
    }

    /**
     * Faz a conexao com banco de dados recebendo todos os campos para conexao.
     *
     * @param login
     */
    public final void conecta(String login,String senha, String url,String driver) throws SQLException, Exception{
        Class.forName(driver);
        con = DriverManager.getConnection(url, login, senha);
        stmt = con.createStatement();            
    }
    /**
     *
     *
     */
    public void criaBase_Tabela(String sql) throws SQLException, Exception{
        stmt.executeUpdate(sql);
    }

    public void executeUpdate(String sql) throws SQLException, Exception{
        stmt.executeUpdate(sql);
    }

    public void addBatch(String sql) throws SQLException, Exception{
        stmt.addBatch(sql);            
    }
    
    public void executeBatch() throws SQLException, Exception{
        stmt.executeBatch();            
    }
    /**
     * Retorna o ResultSet
     */
    public ResultSet getRs(){
        return rs;
    }
    public Connection getConnection(){
        return this.con;
    }
    /**
     * Faz a insercao no banco de dados de acordo com os parametros
     *
     */
    public boolean insere(String tabela, String campos, String valores) throws SQLException, Exception{
        boolean b = true;
        
        String aux = "insert into "+tabela+" ("+campos+") values ("+valores+");";
        stmt.executeUpdate(aux);
        
        return b;
    }
    /**
     * Executa uma alteracao de acordo com os parametros
     *
     */
    public boolean altera(String tabela, String[] campos, String[] valores, String condicao) throws SQLException, Exception{
        boolean b = true;
        
        //recebe um array de String com os campos e valores que o usuario deseja alterar.
        for(int i = 0; i< campos.length;i++)
            stmt.executeUpdate("update "+tabela+" set "+campos[i]+" = "+valores[i]+ " "+condicao+" ;");
            
        return b;        
    }
    
    public void setAutoCommit(boolean b) throws SQLException, Exception{
        
        con.setAutoCommit(b);    		
    		
    }
    
    /**
     * TRANSACTION_NONE	     = 0;<BR>
     * TRANSACTION_READ_UNCOMMITTED = 1; //Le as linhas ainda nao comitadas<BR>
     * TRANSACTION_READ_COMMITTED   = 2; // So le as linhas "comitadas"<BR>
     * TRANSACTION_REPEATABLE_READ  = 4; <BR>
     * TRANSACTION_SERIALIZABLE     = 8; // equivalentes a transações seriais mesmo.<BR>
     *  
     * @param nivelIsolamento
     * @throws SQLException
     */
    
    public void startTransction(int nivelIsolamento) throws SQLException, Exception{
           
        if(nivelIsolamento != 0 && nivelIsolamento !=1 && nivelIsolamento != 2 && nivelIsolamento != 4 && nivelIsolamento != 8){
            throw new SQLException();
        }else{    			
            con.setTransactionIsolation(nivelIsolamento);//TODO: VERIFICAR SE E O MAIS ADEQUADO
        }	

    }
    
    public void commit() throws SQLException, Exception{
    	con.commit();
    }
   
    public void rollback() throws SQLException, Exception{
    	con.rollback();
    }
    
    /**
     * Retorna o next do ResultSet
     */
    public boolean next() throws SQLException, Exception{
        if(rs != null)
            return rs.next();
        
         return false;
    }
    
    /**
     * Executa uma consulta no banco de dados de acordo com as especificaï¿œes do usuario
     *
     */
    public void consulta(String tabela, String campos, String condicoes) throws SQLException, Exception{
        condicoes = (condicoes == null)?"":condicoes;//se condicoes igual a nulo, entao recebe vazio, senao recebe ele mesmo.
        if (!condicoes.equals("")){
            //javax.swing.JOptionPane.showMessageDialog(null,"select "+campos+" from "+tabela+" "+condicoes);
            rs = stmt.executeQuery("select "+campos+" from "+tabela+" "+condicoes);
                
        } else{
            rs = stmt.executeQuery("select "+campos+" from "+tabela);
        }
    }
    
    /**
     * Executa uma consulta no banco de dados deixando o programador a vontade para elaborar o texto que lhe convier.
     *
     */
    public ResultSet consulta(String consulta) throws SQLException, Exception{
        if (!consulta.equals("")){
            //javax.swing.JOptionPane.showMessageDialog(null,consulta);
           rs = stmt.executeQuery(consulta);   
        } 
        return rs;
    }
    
    public void executaFuncao(String procedimento, int[] idxParam, Object[] valorParam ) throws SQLException, Exception{
        
        rs = null;    		
        if( (idxParam.length == valorParam.length)){    			
                cstmt = con.prepareCall(procedimento);    			
                cstmt.clearParameters();
                for(int i = 0; i < idxParam.length;i++){   
                        if(valorParam[i] instanceof String){
                                cstmt.setString(idxParam[i], (String)valorParam[i]);
                        }else if(valorParam[i] instanceof Boolean){
                                cstmt.setBoolean(idxParam[i], (Boolean)valorParam[i]);
                        }else if(valorParam[i] instanceof Integer){
                                cstmt.setInt(idxParam[i], (Integer)valorParam[i]);
                        }else if(valorParam[i] instanceof Float){
                                cstmt.setFloat(idxParam[i], (Float)valorParam[i]);
                        }else if(valorParam[i] instanceof Byte){
                                cstmt.setByte(idxParam[i], (Byte)valorParam[i]);
                        }else if(valorParam[i] instanceof Double){
                                cstmt.setDouble(idxParam[i], (Double)valorParam[i]);
                        }else{ 
                                cstmt.setObject(idxParam[i], valorParam[i]);
                        }
                }
                rs = cstmt.executeQuery();        		
        } 
    }
}