package seccion34.jdbc;

import seccion34.jdbc.models.Producto;
import seccion34.jdbc.repository.Repositorio;
import seccion34.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {

    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getInstace()) {

            Repositorio<Producto> repositorio = new Producto();
            System.out.println(" =========== Listar =========== ");
            repositorio.listar().forEach(System.out::println);

            System.out.println(" =========== Obtener por ID =========== ");
            System.out.println(repositorio.porId(2L));

            System.out.println(" =========== Eliminar producto ===========");
            repositorio.eliminar(3L);
            System.out.println("Producto eliminado con exito");
            repositorio.listar().forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
