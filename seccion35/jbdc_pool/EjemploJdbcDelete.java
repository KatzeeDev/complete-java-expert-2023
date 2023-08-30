package seccion35.jbdc_pool;

import seccion35.jbdc_pool.models.Producto;
import seccion35.jbdc_pool.repository.ProductoRepositorioImpl;
import seccion35.jbdc_pool.repository.Repositorio;

public class EjemploJdbcDelete {

    public static void main(String[] args) {

        Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
        System.out.println(" =========== Listar =========== ");
        repositorio.listar().forEach(System.out::println);

        System.out.println(" =========== Obtener por ID =========== ");
        System.out.println(repositorio.porId(2L));

        System.out.println(" =========== Eliminar producto ===========");
        repositorio.eliminar(3L);
        System.out.println("Producto eliminado con exito");
        repositorio.listar().forEach(System.out::println);

    }
}
