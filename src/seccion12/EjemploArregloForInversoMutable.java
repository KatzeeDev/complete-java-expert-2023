package seccion12;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArregloForInversoMutable {

    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;

        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] productos = {"Google Pixel", "Tv Samsung" , "Ps5", "Proyector", "Xbox one"};
        
        
        int total = productos.length;
        Arrays.sort(productos);

        System.out.println(" ---------- Usando for ---------- ");

        for (int i = 0; i < total; i++) {
            System.out.println("Indice: " + i + " Valor: " + productos[i]);
        }

        // Uso del metodo para invertilos
        arregloInverso(productos);

        // Otra forma es usar la clase Collection.reverse() pero requiere un tipo list que sera visto mas adelante
        //  Collections.reverse(Arrays.asList(productos));

        System.out.println(" ---------- Verificando cambios ---------- ");

        for (int i = 0; i < total; i++) {
            System.out.println("Indice: " + i + " Valor: " + productos[i]);
        }




    }

}
