package seccion26.lambda;

import seccion26.models.aritmetica.Aritmetica;
import seccion26.models.aritmetica.Calculadora;

public class EjemploInterfaceFuncional {

    public static void main(String[] args) {


        Aritmetica suma = Double::sum; //(a, b) -> a + b;
        Aritmetica resta = (a, b) -> a - b;
        Aritmetica multi = (a, b) -> a * b;
        Aritmetica divi = (a, b) -> a / b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10, 5, suma));
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10, 5, multi));
        System.out.println(cal.computar(10, 5, divi));

        // También podemos implementarla al vuelo
        System.out.println(cal.computar(7, 2, (a, b) -> a * b));

        // Utilizando la expresion lambda en calculadora
        System.out.println(cal.computarConBiFunction(13, 79, (c, d) -> c + d));
        System.out.println(cal.computarConBiFunction(13, 149, (c, d) -> c - d));


    }


}
