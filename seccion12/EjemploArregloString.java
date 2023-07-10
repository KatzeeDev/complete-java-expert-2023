package seccion12;

import java.util.Arrays;

public class EjemploArregloString {

    public static void main(String[] args) {

        String[] productos = new String[5];

        // Cuando no existe algo asignado al indice del array este posee el valor de nulo

        System.out.println("\nCuando no esta asignado un valor al indice, el valor que posee por default es: " + productos[0]);

        productos[0] = "Tv Samsung";
        productos[1] = "Iphone";
        productos[2] = "Ipad";
        productos[3] = "Google Pixel";
        productos[4] = "Ps5";

        // Asignamos cada elemento del array a un valor
        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];

        // Si imprimo todos uno por uno segun su indice
        System.out.println(" ----------- Array segun su indice ----------- ");
        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);

        // Imprimimos las variable
        System.out.println(" ----------- Array segun su nombre de variable asignada  ----------- ");
        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);

        // En cambio si quisiera imprimir el array seria:
        System.out.println(" ----------- Todo el Array ----------- ");
        System.out.println(Arrays.toString(productos));

        // Ahora se utilizara sort para ordenar el Array
        System.out.println("\n ----------- Uso de la clase Sort en Strings ----------- ");
        System.out.println("Antes de ordenar: " + Arrays.toString(productos));
        Arrays.sort(productos);
        // En este caso observamos luego de imprimir que se ordena de la A a la Z
        System.out.println("Despues de ordenar: "+ Arrays.toString(productos));


        // Tambien podemos ordenar numeros
        System.out.println("\n ----------- Uso de la clase Sort en Numeros ----------- ");
        int[] numeros = {6, 8, 7, 1, 2, 3, 5, 3, 4};
        System.out.println("Antes de ordenar: " + Arrays.toString(numeros));
        Arrays.sort(numeros);

        System.out.println("Despues de ordenar: "+ Arrays.toString(numeros));



    }

}
