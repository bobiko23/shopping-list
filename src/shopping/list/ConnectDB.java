package shopping.list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    private String database_connection_string = "jdbc:postgresql://localhost:5432/shop";
//Стринг, който прави връзка към базата данни

    private String database_user_name = "BorisKotsev"; // userName

    private String database_user_password = "y9mY@Jth"; // password
     
    public Connection connect() {
//Метод, който връща връзката между базата данни и netBeans-a
        Connection conn = null;

        try {

            conn = DriverManager.getConnection(database_connection_string, database_user_name, database_user_password);
          
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
    
    public static void main(String[] args) {

       ConnectDB conn = new ConnectDB();

       conn.connect();
    }
}
