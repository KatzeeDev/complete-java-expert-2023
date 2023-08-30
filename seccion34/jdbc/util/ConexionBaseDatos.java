package seccion34.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimeZone=America/Santiago";
    private static String username = "root";
    private static String password = "sasa";
    private static Connection connection;

    public static Connection getInstace() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
