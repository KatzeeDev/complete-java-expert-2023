package seccion12;

import java.util.Arrays;

public class EjemploArregloForInverso {

    public static void main(String[] args) {

        String[] productos = new String[5];
        productos[0] = "Tv Samsung";
        productos[1] = "Iphone";
        productos[2] = "Ipad";
        productos[3] = "Google Pixel";
        productos[4] = "Ps5";

        // Siempre hay que ordenar antes de recorrer los elementos


        int total = productos.length; // 5
        System.out.println("total = " + total);

        int k = total;
        System.out.println(" --------------- Usando for inverso --------------- ");
        for (int i = 0; i < total ; i++) {
            System.out.println("Indice = " + (total - 1 - i) + " Valor: " + productos[total - 1 - i]);

        }
        System.out.println(" --------------- Usando for inverso otra forma  --------------- ");
        for (int i = total - 1 ; i >= 0 ; i--) {
            System.out.println("Indice:" + i + " Valor: " + productos[i]);
        }


    }
}
