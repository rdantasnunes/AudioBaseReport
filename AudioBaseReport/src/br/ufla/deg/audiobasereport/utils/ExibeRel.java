package br.ufla.deg.audiobasereport.utils;

import java.sql.SQLException;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

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
public class ExibeRel {
    
    ManipulaBD mBD;
    
    public ExibeRel(ManipulaBD mBD){
        if(mBD == null)
            throw new IllegalArgumentException("Argument mBD cannot be null.");
        
        this.mBD = mBD;
    }
    
    public String exibeRelatorioSimples(String query, String nomeRelatorio,Map parametros) {
        JRResultSetDataSource jrRs;
        try{

            mBD.consulta(query);

            jrRs = new JRResultSetDataSource(mBD.getRs());

            JasperFillManager.fillReportToFile(nomeRelatorio+".jasper",
                        nomeRelatorio+".jrprint",parametros,jrRs);
            JasperViewer.viewReport(nomeRelatorio+".jrprint", false, false);
        }catch (JRException e) {
            return e.getMessage();
        }catch(Exception e){
        }finally{
            try {
                mBD.desconecta();
            } catch (SQLException e) {
            } catch (Exception e) {
            }
        }
        return null;
    }
}
