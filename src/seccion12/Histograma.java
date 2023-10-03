package seccion12;

public class Histograma {

    public static void main(String[] args) {

        // Creamos el arreglo
        int[] numeros = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};

        // Inicializamos el arreglo de ocurrencias con 7 posiciones (para los números del 1 al 6)
        int[] ocurrencias = new int[7];  // {0, 0, 0, 0, 0, 0, 0}

        // Contamos las ocurrencias de cada número en el arreglo "numeros"
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            ocurrencias[numero]++;
        }

        // Imprimimos el histograma
        for (int i = 1; i < ocurrencias.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < ocurrencias[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
