/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Q2AbstractFactorymethodparameter;

/**
 *
 * @author WINCHESTER
 */
public class Main {
    public static void main(String[] args) {
        
        //mysql factory
        AbstractDatabaseFactory mysqlfactory= new MYSQLDatabaseFactory();
        DatabaseConnection mysqlstandard= mysqlfactory.createConnection("standard");
        mysqlstandard.connect();
        
        DatabaseConnection mysqlpooled= mysqlfactory.createConnection("pooled");
        mysqlpooled.connect();
        
        
        //postgre factory
        
        AbstractDatabaseFactory postgrefactory= new PostgreSQLDatabaseFactory();
        DatabaseConnection postgrepooled= postgrefactory.createConnection("pooled");
        postgrepooled.connect();
        
        DatabaseConnection postgrestandard= postgrefactory.createConnection("standard");
        postgrestandard.connect();
                
    }
    
}
