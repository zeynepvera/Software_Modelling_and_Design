/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex4Before;

import java.sql.Connection;

/**
 *
 * @author WINCHESTER
 */
public class Main {
     public static void main(String[] args) {
         
         BadDatabaseConnection db1= new BadDatabaseConnection();
         BadDatabaseConnection db2= new BadDatabaseConnection();
         
         Connection conn1= db1.getConnection();
         Connection conn2= db2.getConnection();

     }
}
