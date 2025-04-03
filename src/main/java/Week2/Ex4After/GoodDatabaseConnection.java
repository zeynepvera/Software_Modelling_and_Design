package Week2.Ex4After;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GoodDatabaseConnection {

    /*public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
  
    
    
        return null;
  
}*/
    
    private static GoodDatabaseConnection instance;
    private Connection connection;
    
    
    private String url;
    private String user;
    private String password;

    public GoodDatabaseConnection(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
        
        try {
          this.connection= DriverManager.getConnection(url, user, password);
            
        } catch (SQLException e) {
            throw new RuntimeException("error connecting to the db",e);
        }
        
        
        
        
    }
    
    public static GoodDatabaseConnection getInstance(String url, String user, String password){
        
        if (instance==null) {
            instance= new GoodDatabaseConnection(url, user, password);
            
        }
        
        return instance;
    }
    
    public Connection getConnection(){
        
        return connection;
    }
    
   

}
