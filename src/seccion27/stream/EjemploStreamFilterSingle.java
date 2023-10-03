package seccion27.stream;

import seccion27.stream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {

    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepeb"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.print(usuario.orElse(new Usuario("Jhon", "Doe")).getNombre());
        //System.out.print(usuario.orElseGet(() -> new Usuario("Jhon", "Doe")).getNombre());
        if (usuario.isPresent()) {
        System.out.print(usuario.orElseThrow());
        } else {
            System.out.println("No se encontro el objeto");
        }
    }
}
