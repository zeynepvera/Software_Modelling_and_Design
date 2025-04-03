/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2.Ex4After;

import java.sql.Connection;

/**
 *
 * @author WINCHESTER
 */
public class Main {
     public static void main(String[] args) {
         
         GoodDatabaseConnection dbInstance= GoodDatabaseConnection.getInstance(
                 "jdbc:mysql://localhost:3306//e-commerce-website",
                "root",
                "1234"
        );
         Connection conn1= dbInstance.getConnection();
         Connection conn2= dbInstance.getConnection();
         
         System.out.println(conn1==conn2);

     }
}
