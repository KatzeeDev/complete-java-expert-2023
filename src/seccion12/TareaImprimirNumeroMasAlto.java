package seccion12;

import java.util.Scanner;

public class TareaImprimirNumeroMasAlto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         /*

            Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
            por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.

         */

        // El tamaño del arreglo debe ser de 7 según la tarea
        int[] numeros = new int[7];

        // Usamos numeros.length en lugar de un número fijo para que funcione independientemente del tamaño del arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa numeros hasta completar el arreglo (7): N°" + (i + 1));
            numeros[i] = scanner.nextInt();

            // Si el número ingresado no está en el rango 11-99, restamos 1 de 'i' para repetir la misma posición en el siguiente ciclo
            if (numeros[i] < 11 || numeros[i] > 99) {
                System.out.println("Ingrese un numero entre 11 y 99");
                i--;
            }
        }

        int valorMax = 0;

        // También aquí usamos numeros.length para que funcione independientemente del tamaño del arreglo
        for (int i = 0; i < numeros.length; i++) {
            valorMax = Math.max(valorMax, numeros[i]);
        }

        System.out.println("El valor maximo del arreglo es: " + valorMax);
    }
}
