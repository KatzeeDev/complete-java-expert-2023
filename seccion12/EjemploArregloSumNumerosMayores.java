package seccion12;

import java.util.Scanner;

public class EjemploArregloSumNumerosMayores {

    public static void main(String[] args) {

        // Creamos un array de 3 elementos
        int[] a = new int[3];
        int total = a.length;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese 3 numeros para el arreglo y se sumaran los mayores: ");
        for (int i = 0; i < total; i++) {
            a[i] = scanner.nextInt();
        }

        // Inicializando las variables max1 y max2 con el valor mínimo que puede tener un entero.
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            // Si el elemento actual es mayor que max1
            if (a[i] > max1) {
                // max1 se convierte en max2
                max2 = max1;
                // Y el elemento actual se convierte en el nuevo max1
                max1 = a[i];
            }
            // Si el elemento actual es menor que max1 pero mayor que max2 y no es igual a max1
            else if (a[i] > max2 && a[i] != max1) {
                // Entonces el elemento actual se convierte en el nuevo max2
                max2 = a[i];
            }
        }
        System.out.println("La suma de los 2 numeros mayores es de:  " + (max1 + max2));

    }
}
