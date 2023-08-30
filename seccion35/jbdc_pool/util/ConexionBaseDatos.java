package seccion35.jbdc_pool.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConexionBaseDatos {

    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimeZone=America/Santiago";
    private static String username = "root";
    private static String password = "sasa";
    private static BasicDataSource pool;

    public static BasicDataSource getInstace() throws SQLException {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(username);
            pool.setPassword(password);
            // Número inicial de conexiones que se crearán al iniciar el pool
            pool.setInitialSize(3);
            // Número mínimo de conexiones inactivas en el pool que se mantendrán abiertas
            pool.setMinIdle(3);
            // Número máximo de conexiones inactivas en el pool que se mantendrán abiertas
            pool.setMaxIdle(8);
            // Número máximo total de conexiones activas e inactivas que se permitirán en el pool simultáneamente
            pool.setMaxTotal(8);
        }
        return pool;
    }

    public static Connection getConnection() throws SQLException {
        return getInstace().getConnection();
    }

}
