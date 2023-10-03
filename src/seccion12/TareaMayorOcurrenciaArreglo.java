package seccion12;

import java.util.Arrays;

public class TareaMayorOcurrenciaArreglo {

    public static void main(String[] args) {

        // Creamos el arreglo de entrada
        int[] numeros = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};

        // Inicializamos el arreglo de ocurrencias con 10 posiciones (para los números del 0 al 9)
        int[] ocurrencias = new int[10];

        // Contamos las ocurrencias de cada número
        for (int numero : numeros) {
            ocurrencias[numero]++;
        }

        // Encontramos el número con más ocurrencias
        int numeroMasRepetido = 0;
        int mayorOcurrencia = 0;
        for (int i = 1; i < ocurrencias.length; i++) {
            if (ocurrencias[i] > mayorOcurrencia) {
                mayorOcurrencia = ocurrencias[i];
                numeroMasRepetido = i;
            }
        }

        // Imprimimos el resultado
        System.out.println("El elemento que más se repite es: " + numeroMasRepetido);
        System.out.println("La mayor ocurrencia es: " + mayorOcurrencia);
    }
}
