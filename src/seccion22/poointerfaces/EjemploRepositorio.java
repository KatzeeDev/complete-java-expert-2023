package seccion22.poointerfaces;

import seccion22.poointerfaces.model.Cliente;
import seccion22.poointerfaces.repository.lista.ClienteListRepositorio;
import seccion22.poointerfaces.repository.Direccion;
import seccion22.poointerfaces.repository.OrdenablePaginableCrudRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Matias", "Osorio")); // 0
        repo.crear(new Cliente("Barbara", "Solis")); // 1
        repo.crear(new Cliente("Ramón", "Alvarez")); // 2
        repo.crear(new Cliente("Daniel", "Ortega")); // 3

        List<Cliente> cliente = repo.listar();
        cliente.forEach(System.out::println);

        System.out.println(" ------------- Paginable ------------- ");
        List<Cliente> paginable = repo.listar(1, 3);
        paginable.forEach(System.out::println);

        System.out.println(" ------------- Ordenar ASC ------------- ");
        // Listamos y ordenamos segun el apellido
        List<Cliente> clientesOrderAsc = repo.listar("nombre", Direccion.ASC);
        for (Cliente c : clientesOrderAsc) {
            System.out.println(c);
        }

        System.out.println(" ------------- Ordenar DESC ------------- ");
        // Listamos y ordenamos segun el apellido
        List<Cliente> clientesOrderDesc =  repo.listar("nombre", Direccion.DESC);
        for (Cliente c : clientesOrderDesc) {
            System.out.println(c);
        }

        System.out.println(" ------------- Editar ------------- ");
        Cliente vichoActualizar = new Cliente("Vicho", "De las nieves");
        vichoActualizar.setId(4);
        repo.editar(vichoActualizar);
        repo.listar().forEach(System.out::println);

        System.out.println(" ------------- Eliminar ------------- ");
        repo.eliminar(4);
        repo.listar().forEach(System.out::println);
        System.out.println(" ------------- Total ------------- ");
        System.out.println("Total de Registros: " + repo.total());

    }
}
