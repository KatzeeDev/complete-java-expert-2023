package seccion12;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {

    public static void main(String[] args) {

        int[] a = new int[7];
        int numero, posicion;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("Ingrese los numeros: ");
            a[i] = scanner.nextInt();
        }
        System.out.println();

        System.out.println("Ingresa un numero a insertar: ");
        numero = scanner.nextInt();

        posicion = 0;

        while (posicion < 6 && numero > a[posicion]) {
            posicion++;
        }

        // Desplazamos los elementos
        for (int i = a.length - 2 ; i >= posicion; i--) {
            a[i+1] = a[i];
        }

        a[posicion]= numero;

        System.out.println("El nuevo arreglo ordenado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " " + a[i]);
        }
    }
}
