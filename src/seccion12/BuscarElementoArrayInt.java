package seccion12;

import java.util.Scanner;

public class BuscarElementoArrayInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero " + (i+1) + " ") ;
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\r\nIngrese el numero a buscar: ");
        int numeroABuscar = scanner.nextInt();
        int i = 0;

        for (i = 0; i < numeros.length && numeros[i] != numeroABuscar; i++) {
        }

        if (i == numeros.length) {
            System.out.println("No se ha encontrado el numero");
        } else if (numeros[i]== numeroABuscar) {
            System.out.println("Numero encontrado en la posicion " + i);
        }

    }

}
