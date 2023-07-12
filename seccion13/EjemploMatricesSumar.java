package seccion13;

public class EjemploMatricesSumar {

    public static void main(String[] args) {

        // En este caso vamos a sumar 2 matrices y luego mostraremos una 3ra con los resultados
        int [][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][] b = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        int[][] suma = new int[3][3];

        System.out.println("Matriz A");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println("Matriz B");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }

            System.out.println();
        }

        // Realizamos la operacion
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        // Mostramos la matriz
        System.out.println("Matriz C");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + "\t");
            }

            System.out.println();
        }





    }

}
