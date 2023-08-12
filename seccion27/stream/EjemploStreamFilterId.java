package seccion27.stream;

import seccion27.stream.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterId {

    public static void main(String[] args) {

        Usuario usuario = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                // Esto lo que hara recorrera el Stream hasta encontrarlo. Y luego no continua con la ejecucion
                .peek(System.out::println)
                .filter(u -> u.getId().equals(67))
                // Si existe el  67 lo imprime, sino agrega Jhon Doe
                .findFirst().orElseGet(() -> new Usuario("Jhon", "Doe"));
        System.out.println(usuario);
    }
}
