package seccion13;

public class EjemploMatricesSumarFilasColumnas {

    public static void main(String[] args) {
        int sumaFila, sumaColumna;

        // En este caso vamos a sumar 2 matrices y luego mostraremos una 3ra con los resultados
        int [][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("\nMatriz Original");
        for (int i = 0; i < a.length; i++) {
            sumaColumna = 0;
            sumaFila = 0;
            for (int j = 0; j < a[i].length; j++) {
               sumaFila += a[i][j];
               sumaColumna += a[j][i];
            }
            System.out.println("Total Fila " + i + ": " + sumaFila);
            System.out.println("Total columna " + i + ": " + sumaColumna);
        }



    }

}
