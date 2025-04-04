/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Q1FactoryP;

/**
 *
 * @author WINCHESTER
 */
public class MySQLConnection implements DatabaseConnection{

    @Override
    public void connect() {
        System.out.println("connectet with MySQL");
    }
    
}
