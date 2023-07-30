package seccion22.poointerfaces;

import seccion22.poointerfaces.model.Cliente;
import seccion22.poointerfaces.model.Producto;
import seccion22.poointerfaces.repository.Direccion;
import seccion22.poointerfaces.repository.OrdenablePaginableCrudRepositorio;
import seccion22.poointerfaces.repository.lista.ClienteListRepositorio;
import seccion22.poointerfaces.repository.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Mesa", 43.9)); // 0
        repo.crear(new Producto("Silla", 42)); // 1
        repo.crear(new Producto("Lampara", 19)); // 2
        repo.crear(new Producto("Notebook", 50)); // 3

        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);

        System.out.println(" ------------- Paginable ------------- ");
        List<Producto> paginable = repo.listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println(" ------------- Ordenar ASC segun Descripcion ------------- ");
        // Listamos y ordenamos segun el apellido
        List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.ASC);
        for (Producto p : productosOrdenAsc) {
            System.out.println(p);
        }

        System.out.println(" ------------- Ordenar DESC segun Precio ------------- ");
        // Listamos y ordenamos segun el apellido
        List<Producto> productosOrdenDesc =  repo.listar("precio", Direccion.DESC);
        for (Producto p : productosOrdenDesc) {
            System.out.println(p);
        }

        System.out.println(" ------------- Editar ------------- ");
        Producto lamparaActualizar = new Producto("lampara moderna", 33);
        lamparaActualizar.setId(4);
        repo.editar(lamparaActualizar);
        repo.listar().forEach(System.out::println);

        System.out.println(" ------------- Eliminar ------------- ");
        repo.eliminar(4);
        repo.listar().forEach(System.out::println);
        System.out.println(" ------------- Total ------------- ");
        System.out.println("Total de Registros: " + repo.total());

    }
}
