/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.School_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
public class db_connection {
    
    public Statement stm;
    public ResultSet rs;
     public int rr;
    public Connection conn;

    private final String driver = "org.mysql.Driver";
    private final String path = "jdbc:mysql://127.0.0.1/my_school_database";
    private final String user = "root";
    private final String pass = "109218912";

     public void connect() {
        try {
            System.setProperty("jdbc.Driver", driver);
            conn = DriverManager.getConnection(path, user, pass);
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
     
    public void disconnect() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
public void executaSQL(String SQL) {
        try {
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(SQL);
           
            
          
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

public void insertInto(String SQL) {
        try {
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
           rr = stm.executeUpdate(SQL);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    
}
