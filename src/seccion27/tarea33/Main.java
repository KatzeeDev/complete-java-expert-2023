package seccion27.tarea33;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] lenguajes = {
                {"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"},
                {}
        };

        String[] resultado = Arrays.stream(lenguajes) // Creamos un Stream de arreglos de Strings.
                .flatMap(Arrays::stream) // Aplana cada arreglo interno en el Stream.
                .distinct() // Elimina elementos repetidos.
                .toArray(String[]::new); // Convierte el Stream en un arreglo.

        System.out.println(Arrays.toString(resultado));
    }
}
