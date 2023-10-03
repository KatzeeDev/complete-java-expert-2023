package seccion12;

import java.util.Arrays;

public class EjemploArregloFor {

    public static void main(String[] args) {

        String[] productos = new String[5];

        int total = productos.length;


        System.out.println("Cuando no esta asignado un valor al indice, el valor que posee por default es: " + productos[0]);

        productos[0] = "Tv Samsung";
        productos[1] = "Iphone";
        productos[2] = "Ipad";
        productos[3] = "Google Pixel";
        productos[4] = "Ps5";

        // Siempre hay que ordenar antes de recorrer los elementos
        Arrays.sort(productos);

        System.out.println(" --------------- Usando for  --------------- ");
        for(int i = 0; i < total; i++ ) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        // Usando un for each
        System.out.println(" --------------- Usando foreach  --------------- ");
        for (String prod: productos) {
            System.out.println("prod = " + prod);
        }

        System.out.println(" --------------- Usando while  --------------- ");
        int i = 0;

        // Mientras...
        while(i < total) {
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }


        System.out.println(" --------------- Usando do while  --------------- ");
        int j = 0;
        // Haz esto...
        do {
            System.out.println("Para indice " + j + " : " + productos[j]);
            j++;
            // Mientras...
        } while (j < total);



        System.out.println(" --------------- Usando array de numeros  --------------- ");
        int[] numeros = new int[5];

        int totalNumeros = numeros.length;

        // Recorrer los valores
        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("Numeros: " + numeros[k]);
        }

        // En este caso aun no existen valores asignados a los indices por lo tanto crearemos un for para esto
        for (int k = 0; k < totalNumeros; k++) {
            numeros[k] = k * 3;
            System.out.println("Multiplos de 3: " + numeros[k]);
        }

        System.out.println(" --------------- Usando array de numeros  --------------- ");

    }
}
