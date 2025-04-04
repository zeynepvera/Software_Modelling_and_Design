/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex4AfterSingleton;

import java.sql.Connection;


/**
 *
 * @author WINCHESTER
 */
public class Main {
    public static void main(String[] args) {
        
    
    
    GoodDatabaseConnection db1= GoodDatabaseConnection.getInstance(
     "jdbc:mysql://localhost:3306//e-commerce-website",
                "root",
                "1234");
    
    Connection con1= db1.getConnection();
    Connection con2= db1.getConnection();
        System.out.println(con1==con2);
    
    
   
    
    
    }
}
