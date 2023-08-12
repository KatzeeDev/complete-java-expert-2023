package seccion27.tarea32;

import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 7, 23, 65, 12, 89, 34, 90, 2};

        Function<Integer, Integer> identity = n -> n;

        Integer maxNumber = Stream.of(numbers)
                .map(identity)
                .reduce((n1, n2) -> n1 > n2 ? n1 : n2)
                .orElse(null);

        System.out.println("El número mayor es: " + maxNumber);
    }
}
