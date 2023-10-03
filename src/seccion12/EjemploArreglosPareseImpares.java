package seccion12;
import java.util.Scanner;

public class EjemploArreglosPareseImpares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[7];

        System.out.print("Ingrese 7 numeros y se ordenaran segun sean pares o impares: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            if (a[i] % 2 == 0) {
                totalPares++;

            } else {
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0;
        int k = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                pares[j++] = a[i];
            } else {
                impares[k++] = a[i];
            }
        }

        System.out.println("Pares");
        for(int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }

        System.out.println("\r\nImpares");
        for(int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }
        System.out.println();

    }
}
