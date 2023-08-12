package seccion27.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {

    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Pato", "Paco", "Pepa", "Pepe")
                .map(String::toUpperCase) // Que seria lo mismo que -> return nombre.toUpperCase()
                .peek(System.out::println) // Que seria -> e -> System.out.println(e)
                .map(String::toLowerCase); // Que seria ->   .map(e -> e.toLowerCase());

        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

    }

}
