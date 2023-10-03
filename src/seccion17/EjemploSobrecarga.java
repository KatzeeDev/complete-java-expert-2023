package seccion17;
import static seccion17.Calculadora.*;

public class EjemploSobrecarga {

    public static void main(String[] args) {

        System.out.println("Sumar int: " + sumar(10, 10));
        System.out.println("Sumar float: " + sumar(10.5F, 10.3F));
        System.out.println("Sumar float-int: " + sumar(10.5F, 10));
        System.out.println("Sumar int-float: " + sumar(53, 5.0));
        System.out.println("Sumar double: " + sumar(10D, 30D));
        System.out.println("Sumar String: " + sumar("10", "40"));
        System.out.println("Sumar tres int: " + sumar(10, 10, 10));

        // No hemos determinado un Long en la clase pero como Float permite guardar mas espacio se selecciona
        System.out.println("sumar long: " + sumar(10L, 5L));
        System.out.println("Sumar int: " + sumar(10, '@'));
        System.out.println("Sumar flaot-int: " + sumar(10F, '@'));

        // Utilizando varargs. (Argumentos variables)
        System.out.println(" ----------- Utilizacion de Argumentos variables  ----------- ");
        System.out.println("Sumar varios int: " + sumar(10, 10, 10, 4, 5, 9));
        System.out.println("Sumar  float + n int: " + sumar(10.5f, 30, 40, 56));
        System.out.println("Sumar  varios float: " + sumar(10.5f, 30f, 40f, 56f, 45f));
        System.out.println("Sumar  varios double: " + sumar(10.5d, 30d, 40d));

    }

}
