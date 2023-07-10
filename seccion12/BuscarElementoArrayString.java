package seccion12;

import java.util.Scanner;

public class BuscarElementoArrayString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] palabras = new String[5];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Ingrese el nombre " + (i+1) + " ") ;
            palabras[i] = scanner.next();
        }

        System.out.println("\r\nIngrese el nombre a buscar: ");
        String palabraABuscar = scanner.next();
        int i = 0;

        for (i = 0; i < palabras.length && !palabras[i].equalsIgnoreCase(palabraABuscar); i++) {}

        if (i == palabras.length) {
            System.out.println("No se ha encontrado el nombre");
        } else if (palabras[i].toLowerCase().compareTo(palabraABuscar.toLowerCase()) == 0) {
            System.out.println("Nombre encontrado en la posicion " + i);
        }

    }

}
