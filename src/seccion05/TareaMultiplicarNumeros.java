package seccion05;

import java.util.Scanner;

public class TareaMultiplicarNumeros {

    public static void main(String[] args) {
        // Multiplicar numeros sin usar el *
        int num1, num2, sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = scanner.nextInt();

        for (int i = 1; i <= num1; i++) {
            sum = sum + num2;
        }

        System.out.println(sum);

    }
}
