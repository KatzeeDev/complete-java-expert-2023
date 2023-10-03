package seccion26.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {


    public static void main(String[] args) {

        Function<String, String> saludar = param -> "Hola que tal! " + param;

        String resultado = saludar.apply("Vicho");

        System.out.println(resultado);

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("matias"));


        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toLowerCase());

        String resultado2 = f3.apply("UpperCase", "LowerCase");
        System.out.println(resultado2);

        // Devuelve un Integer y recibe 2 Strings
        BiFunction<String, String, Integer> f4 = (a, b) -> a.compareTo(b);
        Integer resultado3 = f4.apply("matias", "matias");

        if (resultado3 == 0) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }

        // Mas simplificado seria de la siguiente forma
        BiFunction<String, String, Integer> f5 = String::compareTo; // (a, b) -> a.compareTo(b);
        Integer resultado4 = f5.apply("a", "a");

        BiFunction<String, String, String> f6 = String::concat; // (a, b) -> a.concat(b);
        System.out.println(f6.apply("juntarlas", "palabras"));





    }

}


