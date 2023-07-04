package Seccion5;

import java.util.Arrays;

public class SentenciaFor {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 10; i > 0; i--){
            System.out.println("i = " + i);
        }

        System.out.println("Utilizar mas de una variable en un for");

        for (int i = 1, j = 10; i < j ; i++, j--) {
            System.out.println(i + " - " + j);
        }


        System.out.println("---------- Impares ----------");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println("---------- Pares ----------");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("i = " + i);
        }

    }

}
