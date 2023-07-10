package seccion12;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] a = new int[7];

        System.out.println("Ingrese 7 numeros: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                descendente = true;
            } else if (a[i] < a[i + 1]) {
                ascendente = true;
            }
        }

        if (ascendente == true && descendente == true) {
            System.out.println("Arreglo desordenado");
        }
        if (ascendente == false && descendente == false) {
            System.out.println("Todos los numeros son iguales");
        }
        if (ascendente == true) {
            System.out.println("El arreglo posee un orden ascendente");
        }
        if (descendente == true) {
            System.out.println("El arreglo posee un orden descendente");
        }


    }

}
