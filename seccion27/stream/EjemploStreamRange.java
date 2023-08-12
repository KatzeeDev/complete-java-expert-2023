package seccion27.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {

    public static void main(String[] args) {
        // Creara un  rango entre 5 hasta el 20
        IntStream numeros = IntStream.range(5, 20).peek(System.out::println);
        // Suma total
        //int resultado = numeros.reduce(0, Integer::sum); // (a, b) -> a+b
        //int resultado = numeros.sum();

        IntSummaryStatistics stats = numeros.summaryStatistics(); // Aquí obtenemos varios valores estadisticos.
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Total: " + stats.getCount());
    }
}
