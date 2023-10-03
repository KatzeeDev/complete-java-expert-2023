package seccion27.stream;

import seccion27.stream.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterCount {

    public static void main(String[] args) {

        long count = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                // Recorrera pero no lo encontrara. Por lo tanto imprimira hasta recorrerlo y pondra false
                .count();
        System.out.println(count);

    }
}
