package seccion12;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArreglosDesplazarPosicionb {

    public static void main(String[] args) {

        //  Insertando un nuevo elemento e incrementando el tamaño del arreglo

        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        int elemento, posicion, ultimo;


        for (int i = 0; i < a.length - 1; i++) {
            System.out.println("Ingrese el numero: ");
            a[i] = scanner.nextInt();
            }

        System.out.println("Arreglo inicial: " + Arrays.toString(a));

        System.out.println("Numero a agregar: ");
        elemento = scanner.nextInt();

        System.out.println("Posicion donde agregar: ");
        posicion = scanner.nextInt();

        ultimo = a[a.length - 1];

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i+1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);

        a = b;
        b[posicion] = elemento;

        a[a.length - 1] = ultimo;

        System.out.println(Arrays.toString(b));

    }

}
