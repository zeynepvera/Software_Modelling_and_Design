/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Q1FactoryP;

/**
 *
 * @author WINCHESTER
 */
public class FactoryConnection {
    
   public static DatabaseConnection createConnect(String type){
       
       if(type.equalsIgnoreCase("MySQL")){
           
           return new MySQLConnection();
       }
       
       if(type.equalsIgnoreCase("PostgreSQL"))
       {
           return new PostgreSQLConnection();
       }
       
       return null;
       
   }
    
    
}
