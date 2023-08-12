package seccion27.stream;

import seccion27.stream.models.Usuario;

import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterFlatMap {

    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                // Retorna varios elementos
                .flatMap(u -> {
                    if (u.getNombre().equalsIgnoreCase("Pepe")) {
                        return Stream.of(u);
                    } else {
                        return Stream.empty();
                    }
                })
                .peek(System.out::println);
        //nombres.forEach(System.out::println);
        System.out.println(nombres.count());
    }
}
