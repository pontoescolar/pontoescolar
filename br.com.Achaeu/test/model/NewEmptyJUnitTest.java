/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Test
    public void testeImp(){
        
        Connection conexao;
        try {
            conexao = ConnectionManager.getConexao();
        } catch (SQLException ex) {
             conexao = null;
            Logger.getLogger(NewEmptyJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        String src = "br.com.Achaeu/src/reports/Silhouette_Landscape.jasper";
        
        JasperPrint jasper = null;
        
        try {
            jasper = JasperFillManager.fillReport(src, null, conexao);
        } catch (JRException ex) {
            Logger.getLogger(NewEmptyJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        JasperViewer view = new JasperViewer(jasper);
        view.setVisible(true);
        
    }
    
}
