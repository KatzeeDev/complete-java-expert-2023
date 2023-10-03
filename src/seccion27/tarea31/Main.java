package seccion27.tarea31;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        double result = IntStream.rangeClosed(1, 100)// Creamos un flujo de enteros del 1 al 100.
                .filter(i -> i % 10 != 0) // Filtra para eliminar números divisibles por 10.
                .mapToDouble(i -> (double) i) // Convierte cada número a double.
                .map(d -> d / 2) // Divide cada número por 2.
                .reduce(0, Double::sum); // Suma todos los números.
        System.out.println(result);
    }
}
