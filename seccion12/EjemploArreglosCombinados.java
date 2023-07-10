package seccion12;

import java.util.Arrays;

public class EjemploArreglosCombinados {

    public static void main(String[] args) {

        // Combinar dos arreglos en un tercero. Clase 103

        // La idea es llenar el a y el b y poblar los datos del combinando a y b
        int[] a,b,c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < a.length ; i++) {
            a[i] = i+1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i+1)*5;

        }

        int auxiliar = 0;
        for (int i = 0; i < 10; i++) { // Aca puede ir a.lenght o b.lenght

            c[auxiliar++] = a[i];
            c[auxiliar++] = b[i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("c[i] = " + c[i]);
        }
        
    }

}
