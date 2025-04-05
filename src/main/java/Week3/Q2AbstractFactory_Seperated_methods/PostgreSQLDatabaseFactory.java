/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Q2AbstractFactory_Seperated_methods;

/**
 *
 * @author WINCHESTER
 */
public class PostgreSQLDatabaseFactory implements AbstractDatabaseFactory {

    @Override
    public DatabaseConnection createStandardConnection() {

        return new PostgreSQLStandardConnection();

    }

    @Override
    public DatabaseConnection createPooledConnection() {
        return new PostgreSQLPooledConnection();
    }

}
