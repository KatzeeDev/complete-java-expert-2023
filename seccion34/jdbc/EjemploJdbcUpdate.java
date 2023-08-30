package seccion34.jdbc;

import seccion34.jdbc.models.Categoria;
import seccion34.jdbc.models.Producto;
import seccion34.jdbc.repository.ProductoRepositorioImpl;
import seccion34.jdbc.repository.Repositorio;
import seccion34.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcUpdate {

    public static void main(String[] args) {

        try (Connection conn = ConexionBaseDatos.getInstace()) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println(" =========== Listar =========== ");
            repositorio.listar().forEach(System.out::println);

            System.out.println(" =========== Obtener por ID =========== ");
            System.out.println(repositorio.porId(2L));

            System.out.println(" =========== Editar producto ===========");
            Producto producto = new Producto();
            producto.setId(3L);
            producto.setNombre("Teclado Corsair k95 Mecanico");
            producto.setPrecio(700);
            Categoria categoria = new Categoria();
            categoria.setId(2L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto actualizado con exito");
            repositorio.listar().forEach(System.out::println);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
