import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection = null;

    private DBConnection() {}

    public static Connection getConnection() {
        if (connection == null) {
            try {
                String url = "jdbc:mysql://127.0.0.1:3306/logistic_db?useSSL=false&serverTimezone=UTC";
                String username = "root";
                String password = "Prashant@40";
                String driver = "com.mysql.cj.jdbc.Driver";

                System.out.println("DB URL = " + url);

                Class.forName(driver);

                connection = DriverManager.getConnection(url, username, password);

                System.out.println("[DB] Connected successfully to logistic_db");

            } catch (Exception e) {
                System.err.println("[DB ERROR] " + e.getMessage());
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("[DB] Connection closed.");
            } catch (SQLException e) {
                System.err.println("[DB] Error closing connection: " + e.getMessage());
            }
        }
    }
}