package seccion26.tarea30;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<String, Map<String, Integer>> contarPalabras = frase -> {
            String[] palabras = frase.split("\\s+");
            Map<String, Integer> cuentaPalabras = new HashMap<>();

            String palabraMax = "";
            int max = 0;

            for (String palabra : palabras) {
                int cuentaActual = cuentaPalabras.getOrDefault(palabra, 0) + 1;
                cuentaPalabras.put(palabra, cuentaActual);

                if (cuentaActual > max) {
                    palabraMax = palabra;
                    max = cuentaActual;
                }
            }

            return Collections.singletonMap(palabraMax, max);
        };

        Map<String, Integer> resultado = contarPalabras.apply("La vida se convierte en muerte," +
                " la fuerza en debilidad, el viaje ha terminado");

        System.out.println("Palabra más repetida: " + resultado.keySet().iterator().next()
                + " - Cantidad de veces: " + resultado.values().iterator().next());
    }
}
