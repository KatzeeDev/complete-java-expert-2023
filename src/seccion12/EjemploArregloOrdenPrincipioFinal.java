package seccion12;

public class EjemploArregloOrdenPrincipioFinal {

    public static void main(String[] args) {

        /*          Imprimiendo el i-ésimo número por el principio y el i-ésimo por el final
        Este programa llena un arreglo de tamaño 10 con números del 1 al 10, y luego genera un nuevo arreglo
        con los números dispuestos alternativamente desde el principio y el final del primer arreglo, es decir,
        el primer y último número, el segundo y penúltimo número, y así sucesivamente. Por ejemplo,
        si el primer arreglo es [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
        el segundo arreglo será [1, 10, 2, 9, 3, 8, 4, 7, 5, 6].
        */

        int[] numeros = new int[10];  // Creamos el primer arreglo.
        int[] a = new int[10];  // Creamos el segundo arreglo.

        int totalNumeros = numeros.length;  // Obtenemos el tamaño del arreglo numeros.

        // Llenamos el primer arreglo con números del 1 al 10.
        for (int i = 0; i < totalNumeros; i++) {
            numeros[i] = i + 1;
        }

        int aux = 0;  // Declaramos una variable auxiliar para seguir el índice del segundo arreglo.
        for (int i = 0; i < totalNumeros - i; i++) {
            // Vamos añadiendo alternativamente el número i-ésimo y el i-ésimo desde el final del primer arreglo.
            a[aux++] = numeros[i];
            a[aux++] = numeros[totalNumeros - 1 - i];
        }

        // Imprimimos el segundo arreglo para verificar que se ha construido correctamente.
        for (int i = 0; i < a.length; i++) {
            System.out.println("i: " + i + " valor: " + a[i]);
        }

    }

}
