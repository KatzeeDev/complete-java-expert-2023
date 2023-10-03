package seccion27.stream;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {

    public static void main(String[] args) {

        Stream<Integer> numeros = Stream.of(5, 10, 15, 20)

                .distinct();
        // Comenzará en 0 y sumara lo siguiente
        int resultado = numeros.reduce(0, Integer::sum); // (a, b) -> a+b
        System.out.println(resultado);
    }
}
