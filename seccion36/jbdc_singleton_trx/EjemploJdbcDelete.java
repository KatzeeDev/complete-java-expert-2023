package seccion36.jbdc_singleton_trx;

import seccion36.jbdc_singleton_trx.models.Producto;
import seccion36.jbdc_singleton_trx.repository.ProductoRepositorioImpl;
import seccion36.jbdc_singleton_trx.repository.Repositorio;
import seccion36.jbdc_singleton_trx.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {

    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getInstace()) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
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
