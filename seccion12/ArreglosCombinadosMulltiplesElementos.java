package seccion12;

import java.util.Arrays;

public class ArreglosCombinadosMulltiplesElementos {

    public static void main(String[] args) {

        // Combinar dos arreglos en un tercero con múltiples elementos
        // Cada iteracion 2 elementos de a 3 de b asi.

        //
        int[] a,b,c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        // Hacemos que el array a mientras i < largo de a i aumentara y se le asignara basicamente => 1,2,3,4,5,6,7,8..
        for (int i = 0; i < a.length ; i++) {
            a[i] = i+1;
        }

        // En este caso haremos lo mismo que el ejemplo anterior pero ira aumentando en multiplos de 5 => 5,10,15,20
        for (int i = 0; i < b.length; i++) {
            b[i] = (i+1)*5;

        }

        System.out.println("Valores de los arreglos antes");
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("c = " + Arrays.toString(c));

        // Declaramos una variable auxiliar para conservar los valores
        int aux = 0;

        for (int i = 0; i < b.length; i+=2) {
            for (int j = 0; j < 2; j++){
                 c[aux++] = a[i+j];
            }
            for (int j = 0; j < 2; j++) {
                c[aux++] = b[i + j];
            }
        }

        System.out.println("\n Valor del arreglo luego de combinarlos ");
        System.out.print("c[i] = " + Arrays.toString(c));
        
    }

}
