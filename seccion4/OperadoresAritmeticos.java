package seccion4;

import javax.swing.*;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        // 2 Variables en una linea
        int i = 5, j = 4;

        int suma = i + j;
        System.out.println("suma = " + suma);

        int resta = i - j;
        System.out.println("resta = " + resta);

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        int division = i / j;
        float div2 = (float)i / j;
        // 5 / 4 = 1.25
        System.out.println("division = " + division);
        // Debemos forzar un cast para realizar la division.
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);
        
        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }









    }


}
