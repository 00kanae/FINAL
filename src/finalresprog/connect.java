/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalresprog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author arell
 */
public class connect extends javax.swing.JFrame {
    private static final String JDBC_URL = "jdbc:derby://localhost:1527/ACCOUNT";
    private Connection connection;
    String USERNAME, PASSWORD;
    
    public connect() {
        try {
            String host = "jdbc:derby://localhost:1527/ACCOUNT [biguletto on BIGULETTO]";
            String username = "biguletto";
            String password = "20231148575";
            Connection con = DriverManager.getConnection(host, username, password);
        } catch (SQLException ex) {
            System.err.println("Error connecting to database.");
            ex.printStackTrace();
        }
    }
    public Connection getConnection() {
        return connection;
    }
     public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException ex) {
            System.err.println("Error closing connection.");
            ex.printStackTrace();
        }
    }
}