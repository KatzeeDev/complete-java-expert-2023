package seccion36.jbdc_singleton_trx;

import seccion36.jbdc_singleton_trx.models.Categoria;
import seccion36.jbdc_singleton_trx.models.Producto;
import seccion36.jbdc_singleton_trx.repository.ProductoRepositorioImpl;
import seccion36.jbdc_singleton_trx.repository.Repositorio;
import seccion36.jbdc_singleton_trx.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbc {

    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getInstace()) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println(" =========== Listar =========== ");
            repositorio.listar().forEach(System.out::println);

            System.out.println(" =========== Obtener por ID =========== ");
            System.out.println(repositorio.porId(2L));

            System.out.println(" =========== Insertar nuevo producto ===========");
            Producto producto = new Producto();
            producto.setNombre("Teclado Razer");
            producto.setPrecio(650);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto guardado con Extio");
            repositorio.listar().forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
