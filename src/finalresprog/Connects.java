/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalresprog;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;

/**
 *
 * @author arell
 */

public class Connects extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    DefaultTableModel LoginModel = new DefaultTableModel();
    int newID, i, temp_user, curRow, result;
    String newPASS, newUSERTYPE, user, s, n, u, temp_pass, temp_usertype, USERNAME, USERPASS;

    /**
     *
     */
    public Connects() {
        try {
            // CONNECT TO THE DATABASE
            String host = "jdbc:derby://localhost:1527/ACCOUNT";
            String username = "kathleen";
            String password = "12345678";
            con = DriverManager.getConnection(host, username, password);
            
            
            
            
            // EXECUTE SOME SQL AND LOAD THE RECORDS INTO THE RESULTSET
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM ACCOUNT";
            rs = stmt.executeQuery(sql);
            
            // Process the ResultSet here...
            
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(this, err.getMessage());
        }
    }
    
    public void refreshResultSet() {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (con != null) {
                stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                String sql = "SELECT * FROM ACCOUNT";
                rs = stmt.executeQuery(sql);
            } else {
                // Handle the case when con is null
                System.out.println("Connection is null. Cannot refresh ResultSet.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
