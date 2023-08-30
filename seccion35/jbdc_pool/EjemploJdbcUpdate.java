package seccion35.jbdc_pool;

import seccion35.jbdc_pool.models.Categoria;
import seccion35.jbdc_pool.models.Producto;
import seccion35.jbdc_pool.repository.ProductoRepositorioImpl;
import seccion35.jbdc_pool.repository.Repositorio;

public class EjemploJdbcUpdate {

    public static void main(String[] args) {

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
    }
}
