package seccion12;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {

    public static void main(String[] args) {

        // Agregar un elemento en una posición indicada y mover los siguientes elementos

        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[10];
        int ultimo;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero: ");
            numeros[i] = scanner.nextInt();
            }

        System.out.println("Arreglo inicial: " + Arrays.toString(numeros));

        System.out.println();
        ultimo = numeros[numeros.length - 1];

        for (int i = numeros.length - 2; i >= 0; i--) {
            numeros[i+1] = numeros[i];
        }
        numeros[0] = ultimo;

        for (int i = 0; i < numeros.length; i++) {
        }

        System.out.println("Arreglo final: " + Arrays.toString(numeros));

    }

}
