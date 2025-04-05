/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Q2AbstractFactorymethodparameter;

/**
 *
 * @author WINCHESTER
 */
public class PostgreSQLDatabaseFactory implements AbstractDatabaseFactory{

    @Override
    public DatabaseConnection createConnection(String connectionType) {
        
        if(connectionType.equalsIgnoreCase("Standard")){
            
            return (DatabaseConnection) new PostgreSQLStandardConnection();
        }else if(connectionType.equalsIgnoreCase("Pooled")){
            return (DatabaseConnection) new PostgreSQLPooledConnection();
            
        }else{
            
            throw new IllegalArgumentException("unknown postgresql conn type"+ connectionType
            );
        }



    }
    
}
