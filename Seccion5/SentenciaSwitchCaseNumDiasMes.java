package Seccion5;

import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el mes: ");
        int mes = s.nextInt();

        System.out.println("Ingrese el año: ");
        int anio = s.nextInt();

        int numeroDias = 0;

        switch (mes) {
            case 1,3,5,7,8,10,12:
                numeroDias = 31;
                break;
            case 4,6,9,11:
                numeroDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                numeroDias = 29;
                break;
                }
                else {
                    numeroDias = 28;
                }
            default:
                System.out.println("Ingrese un mes valido");
                break;
        }


        /* if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        }
        */
        System.out.println("numeroDias = " + numeroDias);

    }



}
