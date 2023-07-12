package seccion13;
import java.util.Scanner;

public class TareaImprimirSillaMatrices {
    public static void main(String[] args) {

        boolean aprobado = true;
        //Pedir tamaño de la silla a imprimir
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, ingrese el tamaño de la silla a imprimir:");
        int n = s.nextInt();

        aprobado = (n > 1)? aprobado : false;
        if (!aprobado){
            System.err.println("¡ERROR! Tamaño incompatible");
            System.exit(1);
        }

        //Crear e imprimir la silla
        int[][] Silla = new int[n][n];
        int tabla = 0;

        if(n % 2 == 0){
            tabla = n/2;
        }else{
            tabla = (int)Math.floor(n/2);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if( /*Respaldo:*/ (j == 0) ||
                        /*Asiento:*/ (i == tabla) ||
                        /*Patas:*/ (i > tabla && j == (n - 1))
                ){
                    Silla[i][j] = 1;
                    System.out.print((Silla[i][j]));
                }else{
                    System.out.print((Silla[i][j]));
                }
            }
            System.out.println();
        }
    }
}