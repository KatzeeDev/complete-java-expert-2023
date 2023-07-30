package seccion23.poointerfaces;

import seccion23.poointerfaces.model.Cliente;
import seccion23.poointerfaces.repository.Direccion;
import seccion23.poointerfaces.repository.OrdenablePaginableCrudRepositorio;
import seccion23.poointerfaces.repository.exceptions.AccesoDatoException;
import seccion23.poointerfaces.repository.exceptions.EscrituraAccesoDatoException;
import seccion23.poointerfaces.repository.exceptions.LecturaAccesoDatoException;
import seccion23.poointerfaces.repository.exceptions.RegistroDuplicadoAccesoDatoException;
import seccion23.poointerfaces.repository.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {


            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Matias", "Osorio")); // 0
            repo.crear(new Cliente("Barbara", "Solis")); // 1
            repo.crear(new Cliente("Ramón", "Alvarez")); // 2
            repo.crear(new Cliente("Daniel", "Ortega")); // 3

            Cliente andres = new Cliente("Andres", "Guzman");

            repo.crear(andres);
            repo.crear(andres);
            //repo.crear(null);

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
            List<Cliente> clientesOrderDesc = repo.listar("nombre", Direccion.DESC);
            for (Cliente c : clientesOrderDesc) {
                System.out.println(c);
            }

            System.out.println(" ------------- Editar ------------- ");
            Cliente vichoActualizar = new Cliente("Vicho", "De las nieves");
            vichoActualizar.setId(4);
            repo.editar(vichoActualizar);
            Cliente gato = repo.porId(3);
            repo.listar().forEach(System.out::println);

            System.out.println(" ------------- Eliminar ------------- ");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);
            System.out.println(" ------------- Total ------------- ");
            System.out.println("Total de Registros: " + repo.total());
        } catch (RegistroDuplicadoAccesoDatoException e) {
            System.out.println("Registro Duplicado: " + e.getMessage());
            e.printStackTrace();
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e) {
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println("Generica: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
