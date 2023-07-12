package seccion13;

public class EjemploMatricesSimetrica {

    public static void main(String[] args) {

        boolean simetrica = true;
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        int i,j;
        i = 0;

        while (i < matriz.length && simetrica == true) {
            j = 0;
            while (j < i && simetrica == true){
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
                j++;
            }
            i++;
        }

        if (simetrica) {
            System.out.println("La matriz es simetrica ");
        } else {
            System.out.println("La matriz no es simetrica");
        }


        // Utilizando un for

        int[][] matriz2 = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        int k,l;
        boolean simetrica2 = true;

        salir2: for (k = 0; k < matriz2.length; k++) {
            for (l = 0; l < k; l++) {
                if (matriz2[k][l] != matriz2[l][k]) {
                    simetrica2 = false;
                    break salir2;
                }
            }
        }

        if (simetrica2) {
            System.out.println("La matriz 2 es simetrica");
        } else {
            System.out.println("La matriz 2 no es simetrica");
        }






    }

}
