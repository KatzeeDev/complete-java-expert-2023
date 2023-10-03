package seccion24.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args) {

        // Tienen un costo de rendimiento debido a que son ordenados.
        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres"); // No lo imprimira debido a que ya existe. Los Set no aceptan elemetos duplicadoss
        ts.add("cuatro");
        ts.add("cinco");

        // Ordena segun el unicode
        System.out.println("TreeSet: " + ts);

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(5);
        numeros.add(2);
        numeros.add(4);
        numeros.add(4); // No lo lo imprimira
        numeros.add(1);

        System.out.println("Numeros " + numeros);


        System.out.println("Si quisieramos ordenarlo en orden descendente");
        Set<Integer> numerosDesc = new TreeSet<>(Comparator.reverseOrder());
        numerosDesc.add(3);
        numerosDesc.add(5);
        numerosDesc.add(2);
        numerosDesc.add(4);
        numerosDesc.add(4); // No lo lo imprimira
        numerosDesc.add(1);

        System.out.println("Numeros en Orden Descendente: " + numerosDesc);


    }

}
