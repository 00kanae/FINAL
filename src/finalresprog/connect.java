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
public class connect {
    private static final String JDBC_URL = "jdbc:derby://localhost:1527/ACCOUNT";
    private Connection connection;
    
    public connect() {
        try {
            // Load the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // Establish the connection
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connected to database.");
        } catch (ClassNotFoundException | SQLException ex) {
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