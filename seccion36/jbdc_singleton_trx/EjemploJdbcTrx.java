package seccion36.jbdc_singleton_trx;

import seccion36.jbdc_singleton_trx.models.Categoria;
import seccion36.jbdc_singleton_trx.models.Producto;
import seccion36.jbdc_singleton_trx.repository.ProductoRepositorioImpl;
import seccion36.jbdc_singleton_trx.repository.Repositorio;
import seccion36.jbdc_singleton_trx.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcTrx {

    public static void main(String[] args) throws SQLException {

        try (Connection conn = ConexionBaseDatos.getInstace()) {
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }

            try {
            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println(" =========== Listar =========== ");
            repositorio.listar().forEach(System.out::println);

            System.out.println(" =========== Obtener por ID =========== ");
            System.out.println(repositorio.porId(2L));

            System.out.println(" =========== Insertar nuevo producto ===========");
            Producto producto = new Producto();
            producto.setNombre("Teclado IBM Mecanico");
            producto.setPrecio(1550);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            producto.setSku("abcde12345");
            repositorio.guardar(producto);
            System.out.println("Producto guardado con éxito");

            System.out.println(" =========== Editar producto ===========");
            producto = new Producto();
            producto.setId(5L);
            producto.setNombre("Teclado Corsair k95 Mecánico");
            producto.setPrecio(1000);
            producto.setSku("abcdef1234");
            categoria = new Categoria();
            categoria.setId(2L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto actualizado con éxito");

            repositorio.listar().forEach(System.out::println);
            // De forma manual realizamos el commit, si falla uno realiza el rollback y regresa al estado anterior.
            conn.commit();
            } catch (SQLException exception) {
                conn.rollback();
                exception.printStackTrace();
            }
        }

    }
}
