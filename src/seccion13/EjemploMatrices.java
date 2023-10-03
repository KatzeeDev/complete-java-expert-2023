package seccion13;

import java.util.Arrays;

public class EjemploMatrices {

    public static void main(String[] args) {

        // Declaramos el array bidimensional :
        int [][] numeros = new int[2][4];

        // Asignamos Valores
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        // Si queremos imprimir como se ve la matriz
        System.out.println("\n---------- Matrices Arreglos Bidimensionales ---------- ");
        System.out.println("Asi se ve una matriz: [2][4] ");
        for (int i = 0; i < numeros.length; i++) {    // Esto recorre las filas
            for (int j = 0; j < numeros[i].length; j++) { // Esto recorre las columnas en cada fila
                System.out.print(numeros[i][j] + " "); // Imprime cada elemento seguido de un espacio
            }
            System.out.println(); // Salta a la siguiente línea después de imprimir una fila
        }

        System.out.println("Numero de filas: " + numeros.length);

        System.out.println("Numero de columnas: " + numeros[0].length);

        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);

        System.out.println("Ultimo elemento = " + numeros[numeros.length - 1][numeros[1].length - 1]);

    }
}
