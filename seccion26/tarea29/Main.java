package seccion26.tarea29;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // Expresion Lambda que elimine espacios, comas y puntos de una frase y ademas devuelva la frase
        // convertida en Mayuscula
        Consumer<String> consumer = (s) -> {
            String s2 = s.replaceAll("[ .,]", "").toUpperCase();
            System.out.println(s2);
        };
        consumer.accept("Fras.,.,.,.enume ro,2");

    }

}
