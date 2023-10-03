package seccion13;

public class EjemploMatricesIdentidad {

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        // Recordemos que cuando se inicializa una matriz sus valores son todos 0.
        System.out.println("La matriz original es esta");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Asignando los valores
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
            }
        };

        System.out.println("La matriz nueva es esta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }




    }

}
