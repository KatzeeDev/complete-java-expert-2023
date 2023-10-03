package seccion04;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        /*  Ternario:
        Significa que esta formado por 3 elementos o 3 argumentos o partes.
        Donde la primera evalua una expresion booleana.

        variable = condicion ? si es verdadero : si es falso

        Es una expresion abreviada de if  y else
        */

        // Llevado a codigo seria de la siguiente forma:
        String variable = 7 == 7 ? "Si, son iguales" : "No, no son iguales";
        System.out.println("variable = " + variable);

        String estado;
        double promedio;

        double matematicas;
        double lenguaje;
        double historia;
        double ciencias;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota de Matematicas en escala del 1.0 al 7.0");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de Lenguaje en escala del 1.0 al 7.0");
        lenguaje = s.nextDouble();

        System.out.println("Ingrese la nota de Historia en escala del 1.0 al 7.0");
        historia = s.nextDouble();

        System.out.println("Ingrese la nota de Quimica en escala del 1.0 al 7.0");
        ciencias = s.nextDouble();

        promedio = (matematicas + lenguaje + historia + ciencias) / 4;

        estado = promedio >= 5.55 ? "El alumno ha aprobado con un promedio de: " +
                promedio : "El alumno ha reprobado con un promedio de: " + promedio;

        System.out.println(estado);

    }

}
