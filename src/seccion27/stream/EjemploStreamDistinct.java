package seccion27.stream;

import java.util.stream.Stream;

public class EjemploStreamDistinct {

    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena",
                        "Paco Gonzales", "Paco Gonzales", "Paco Gonzales", "Paco Gonzales")
                // Quitar elemntos repetidos de una lsita
                .distinct();
        nombres.forEach(System.out::println);



    }
}
