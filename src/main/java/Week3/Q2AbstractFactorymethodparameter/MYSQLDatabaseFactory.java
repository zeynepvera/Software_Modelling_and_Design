/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3.Q2AbstractFactorymethodparameter;

/**
 *
 * @author WINCHESTER
 */
public class MYSQLDatabaseFactory implements AbstractDatabaseFactory{

    @Override
    public DatabaseConnection createConnection(String connectionType) {
        
        if(connectionType.equalsIgnoreCase("Standard")){
            return (DatabaseConnection) new MYSQLStandardConnection();
            
        }else if(connectionType.equalsIgnoreCase("Pooled")){
            
            return (DatabaseConnection) new MYSQLPooledConnection();
        }else{
            
            throw new IllegalArgumentException(connectionType+ "unknown mysql commection type");
        }
    }
    
}
