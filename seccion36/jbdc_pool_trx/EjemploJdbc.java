package seccion36.jbdc_pool_trx;

import seccion36.jbdc_pool_trx.models.Categoria;
import seccion36.jbdc_pool_trx.models.Producto;
import seccion36.jbdc_pool_trx.services.CatalogoServicio;
import seccion36.jbdc_pool_trx.services.Servicio;

import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbc {

    public static void main(String[] args) throws SQLException {
        Servicio servicio = new CatalogoServicio();
        System.out.println(" =========== Listar =========== ");
        servicio.listarProducto().forEach(System.out::println);

        System.out.println(" =========== Insertar Nueva Categoria =========== ");
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminación");

        System.out.println(" =========== Insertar nuevo producto ===========");
        Producto producto = new Producto();
        producto.setNombre("Lampara Led Escritorio");
        producto.setPrecio(990);
        producto.setFechaRegistro(new Date());
        producto.setSku("abcdefg12");
        servicio.guardarProductoConCategoria(producto, categoria);
        System.out.println("Producto guardado con exito: " + producto.getId());
        servicio.listarProducto().forEach(System.out::println);

    }
}
