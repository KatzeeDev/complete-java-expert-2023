package seccion12;

import java.util.Arrays;

public class OrdenamientoBurbuja {

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

        String[] productos = {"Auto de Juguete", "Celular Samsung" , "Ps5", "Proyector", "Xbox one"};
        
        
        int total = productos.length;

        // El primer for recorrera cada elemento y el segundo los comparara. Comparandolos todos con todos
        // Algoritmo Burbuja. No es tan eficiente, tiene muchas iteraciones pero es simple

        int contador = 0; // Contaremos cuantas veces itera
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if(productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println(" ---------- Usando for ---------- ");
        for (int i = 0; i < total; i++) {
            System.out.println("Indice: " + i + " Valor: " + productos[i]);

        }
        System.out.println("Veces que itera: " + contador);
    }

}
