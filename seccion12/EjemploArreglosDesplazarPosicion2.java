package seccion12;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {

    public static void main(String[] args) {

        // Agregar un elemento en una posición indicada y mover los siguientes elementos

        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[10];
        int elemento, posicion;


        for (int i = 0; i < numeros.length - 1; i++) {
            System.out.println("Ingrese el numero: ");
            numeros[i] = scanner.nextInt();
            }

        System.out.println("Arreglo inicial: " + Arrays.toString(numeros));

        System.out.println("Nuevo elemento");
        elemento = scanner.nextInt();

        System.out.println("Posicion donde agregar: ");
        posicion = scanner.nextInt();

        for (int i = numeros.length - 2; i >= posicion; i--) {
            numeros[i+1] = numeros[i];
        }

        numeros[posicion] = elemento;

        for (int i = 0; i < numeros.length; i++) {
        }

        System.out.println("Arreglo final: " + Arrays.toString(numeros));

    }

}
