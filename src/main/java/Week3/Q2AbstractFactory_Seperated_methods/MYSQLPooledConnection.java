/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Q2AbstractFactory_Seperated_methods;

import Week3.Q2AbstractFactorymethodparameter.*;

/**
 *
 * @author WINCHESTER
 */
public class MYSQLPooledConnection implements DatabaseConnection{

    @Override
    public void connect() {
        System.out.println("connected to mysql pooled connection");    }
    
}
