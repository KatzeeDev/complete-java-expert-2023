package seccion12;

import java.util.Arrays;
import java.util.Scanner;

public class TareaSistemaEstadistico {


    public static void main(String[] args) {
        /*
        Tarea: Sistema estadistico de un arreglo
        Leer 7 números por teclado para llenar un arreglo y a continuación calcular
        el promedio de los números positivos, el promedio de los negativos y contar el número de ceros.

        */





        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[7];
        int totalPositivos = 0;
        int totalNegativos = 0;
        int totalCeros = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        System.out.println(" ------------- Sistema Estadistico de un Arreglo ------------- ");
        // Primer for para ingresar los numeros
        System.out.println("Ingrese 7 numeros para insertarlos en el array: ");
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > 0) {
                totalPositivos++;
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                totalNegativos++;
                sumaNegativos += numeros[i];
            } else if (numeros[i] == 0) {
                totalCeros++;
            }
        }

        double promedioPositivos = (totalPositivos > 0) ? (double) sumaPositivos / totalPositivos : 0;
        double promedioNegativos = (totalNegativos > 0) ? (double) sumaNegativos / totalNegativos : 0;

        System.out.println("numeros = " + Arrays.toString(numeros));
        System.out.println("totalPositivos = " + totalPositivos);
        System.out.println("totalNegativos = " + totalNegativos);
        System.out.println("totalCeros = " + totalCeros);
        System.out.println("promedioPositivos = " + promedioPositivos);
        System.out.println("promedioNegativos = " + promedioNegativos);






    }

}
