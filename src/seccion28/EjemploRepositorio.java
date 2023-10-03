package seccion28;

import seccion28.models.Computador;
import seccion28.repository.ComputadorRepositorio;
import seccion28.repository.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {

    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        repositorio.filtrar("asus rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontro"));
        /*
        Optional<Computador> pc = repositorio.filtrar("asus rog");

        if (pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontró");
        }*/

    }
}
