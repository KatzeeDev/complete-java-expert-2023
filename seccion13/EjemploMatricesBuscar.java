package seccion13;

public class EjemploMatricesBuscar {

    public static void main(String[] args) {

        int[][] matrizDeEnteros = {
                {35, 90, 3 , 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementoBuscar = 15;
        boolean encontrado = false;
        int i = 0;
        int j = 0;

        buscar: for (i = 0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if (matrizDeEnteros[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado) {
            System.out.println("\nEl elemento " + elementoBuscar + " fue encontrado en las cordenadas " + i + "," + j);
        } else {
            System.out.println("El elemento no ha sido encontrado");
        }




    }

}
