/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex4BeforeSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author WINCHESTER
 */
public class BadDatabaseConnection {
    
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
  
    
    
        return null;
  
    
    
}
}

