/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Q1FactoryP;

/**
 *
 * @author WINCHESTER
 */
public class Test {
    public static void main(String[] args) {
        
        DatabaseConnection db1= FactoryConnection.createConnect("Mysql");
        db1.connect();
    }
    
}
