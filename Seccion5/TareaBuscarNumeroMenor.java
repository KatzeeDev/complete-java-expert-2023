package Seccion5;
import java.util.Arrays;
import java.util.Scanner;

public class TareaBuscarNumeroMenor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a evaluar: ");
        int numerosAEvaluar = scanner.nextInt();
        int[] numeros = new int[numerosAEvaluar];

        for (int i = 0; i < numerosAEvaluar; i++) {
            System.out.println("Ingrese el numero " + (i+1));
            numeros[i] = scanner.nextInt();
        }

        Integer numeroMinimo = Integer.MIN_VALUE;
        int valorMinimo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < valorMinimo) {
                valorMinimo = numeros[i];
            }
        }
        System.out.println("NumerosIngresados" + Arrays.toString(numeros));
        System.out.println("El valor minimo es: " + valorMinimo);
    }
}
