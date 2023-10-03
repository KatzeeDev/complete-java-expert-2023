package seccion12;

public class EjemploArreglosInt {

    public static void main(String[] args) {

        // Crear un array de cuatro elementos
        int[] numeros = new int[4];

        // Asignamos valores a cada elemento del array segun su indice
        numeros[0] = 1;
        numeros[1] = Integer.valueOf(2);
        numeros[2] = 3;
        numeros[3] = 4;


        // Asignamos cada valor del array a una variable distinta.
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        // Imprimir el valor de cada variable
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        // Obtener el ultimo elemento del arreglo
        int ultimo = numeros[numeros.length - 1];
        System.out.println("ultimo = " + ultimo);

        // Obtener el primer elemento del arreglo
        int primero = numeros[0];
        System.out.println("primero = " + primero);



    }

}
