package seccion4;

import java.util.Scanner;

public class TareaMostrarNumerosOrdenados {

    public static void main(String[] args) {

        // Pedir dos números y mostrarlos ordenados de mayor a menor

        Integer num1;
        Integer num2;
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1 = s.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = s.nextInt();


        Integer numeroMayor;
        Integer numeroMenor;

        numeroMayor = num1 > num2 ? num1 : num2;
        numeroMenor = num2 < num1 ? num2 : num1;

        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("El numero menor es: " + numeroMenor);


        






    }

}
