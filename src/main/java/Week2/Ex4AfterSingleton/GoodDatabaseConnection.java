package Week2.Ex4AfterSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GoodDatabaseConnection {

    
    //Singleton kısmı
    private static GoodDatabaseConnection instance;

    private Connection connection;

    public static GoodDatabaseConnection getInstance(String url, String user, String password) {

        if (instance == null) {
            instance = new GoodDatabaseConnection(url, user, password);
        }

        return instance;

    }

    //dependency injection kısmı
    private String url, user, password;

    private GoodDatabaseConnection(String url, String user, String password) {

        this.url = url;
        this.user = user;
        this.password = password;

        try {
            this.connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            throw new RuntimeException("error connecting to the db", e);
        }

    }

    public Connection getConnection() {

        return connection;
    }

}
