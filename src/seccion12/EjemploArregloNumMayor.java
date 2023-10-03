package seccion12;

import java.util.Scanner;

public class EjemploArregloNumMayor {

    public static void main(String[] args) {

        // En este ejercicio se toman 5 numeros y se detecta el mayor de ese arreglo.

        int[] a = new int[5];
        int total = a.length;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 numeros para el arreglo: ");
        for (int i = 0; i < total; i++) {
            a[i] = scanner.nextInt();
        }

        // Esta variable guardara el numero mayor
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i]) ? max: i;
        }

        System.out.println("El numero max del arreglo es:  " + a[max]);

    }
}
