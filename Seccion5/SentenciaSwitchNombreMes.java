package Seccion5;

import java.util.Arrays;
import java.util.Scanner;

public class SentenciaSwitchNombreMes {

    public static void main(String[] args) {


        // Nota: Este codigo es de ejemplo del curso. Posterior a esto se optimizara usando Arrays
        int mes;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes");
        mes = s.nextInt();

        String nombreMes = null;

        switch (mes) {
            case 1:
                System.out.println(nombreMes = "Enero");
                break;
            case 2:
                System.out.println(nombreMes = "Febrero");
                break;
            case 3:
                System.out.println(nombreMes = "Marzo");
                break;
            case 4:
                System.out.println(nombreMes = "Abril");
                break;
            case 5:
                System.out.println(nombreMes = "Mayo");
                break;
            case 6:
                System.out.println(nombreMes = "Junio");
                break;
            case 7:
                System.out.println(nombreMes = "Julio");
                break;
            case 8:
                System.out.println(nombreMes = "Agosto");
                break;
            case 9:
                System.out.println(nombreMes = "Septiembre");
                break;
            case 10:
                System.out.println(nombreMes = "Octubre");
                break;
            case 11:
                System.out.println(nombreMes = "Noviembre");
                break;
            case 12:
                System.out.println(nombreMes = "Diciembre");
                break;

            default:
                System.out.println("Ingrese un numero valido de mes");


        }







    }

}
