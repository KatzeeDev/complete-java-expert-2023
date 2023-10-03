package seccion12;

public class OrdenamientoBurbujaOptimizado {

    public static void main(String[] args) {

        // Declaramos e inicializamos el arreglo de productos.
        String[] productos = {"Auto de Juguete", "Celular Samsung" , "Ps5", "Proyector", "Xbox one"};
        int total = productos.length;

        sortBurbuja(productos);


        // Imprimimos los productos ordenados.
        System.out.println(" ---------- Usando for ---------- ");
        for (int i = 0; i < total; i++) {
            System.out.println("Indice: " + i + " Valor: " + productos[i]);
        }


        System.out.println(" ---------- Usando for para ordenar numeros ---------- ");
        Integer[] numeros = {3, 5, 4, 2, 1};
        int totalNumeros = numeros.length;

        sortBurbuja(numeros);

        // Mostraremos los resultados ordenados
        for (int j = 0; j < totalNumeros; j++) {
            System.out.println("numeros = " + numeros[j]);
        }

    }


    public static void sortBurbuja(Object[] arreglo) {

        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                // Si quisieramos ordenar de mayor a menor bastaria con cambiar este signo a >
                if( ((Comparable<Object>)arreglo[j + 1]).compareTo(arreglo[j]) < 0){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
    }
}
