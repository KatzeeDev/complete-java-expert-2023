package seccion34.jbdc_close;

import seccion34.jbdc_close.models.Categoria;
import seccion34.jbdc_close.models.Producto;
import seccion34.jbdc_close.repository.Repositorio;

import java.util.Date;

public class EjemploJdbc {

    public static void main(String[] args) {

        Repositorio<Producto> repositorio = new Producto();
        System.out.println(" =========== Listar =========== ");
        repositorio.listar().forEach(System.out::println);

        System.out.println(" =========== Obtener por ID =========== ");
        System.out.println(repositorio.porId(2L));

        System.out.println(" =========== Insertar nuevo producto ===========");
        Producto producto = new Producto();
        producto.setNombre("Notebook Asus ROG");
        producto.setPrecio(2650);
        producto.setFechaRegistro(new Date());
        Categoria categoria = new Categoria();
        categoria.setId(3L);
        producto.setCategoria(categoria);
        repositorio.guardar(producto);
        System.out.println("Producto guardado con exito");
        repositorio.listar().forEach(System.out::println);

    }
}
