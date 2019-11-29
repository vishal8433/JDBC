package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseconnection {
    public Connection connection=null;
    public final static String url="jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    public  final static String user="root";
    public final static String password="";
    public Connection getConnection(){
        return connection;
    }
    public boolean attemptConnection() throws SQLException {
        connection= DriverManager.getConnection(url,user,password);
        return connection !=null;
    }
    public void closeconnection() throws SQLException {
        getConnection().close();
    }
}
