/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalresprog;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table. DefaultTableModel;
public class connect extends javax.swing.JFrame  {
    Connection con;
    Statement stmt;
    ResultSet rs;
    DefaultTableModel LoginModel = new DefaultTableModel();
    String USERNAME, PASSWORD;
    public void DoConnect(){
        try{
            String host = "jdbc:derby://localhost:1527/USERACC [admin123 on ADMIN123]";
            String uNAME = "admin123";
            String uPASS = "adnub123";
            con = DriverManager.getConnection(host, uNAME, uPASS);
            stmt = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM ACCOUNT";
            rs = stmt.executeQuery(sql);
                    
        }catch (SQLException ex){
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }
    public void Refresh_RS_STMT() {
        try {
           stmt.close();
           rs.close();
           stmt = con.createStatement (ResultSet.TYPE_SCROLL_SENSITIVE, 
           ResultSet.CONCUR_UPDATABLE);
           String sql = "SELECT * FROM ACCOUNT";
           rs = stmt.executeQuery (sql);
        } catch (SQLException ex) {
        Logger.getLogger(connect.class.getName()).log (Level. SEVERE, null, ex);
        }
}
}

