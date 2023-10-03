package seccion24.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();

        hs.add("Uno");
        hs.add("Dos");
        hs.add("Tres");
        hs.add("Cuatro");
        hs.add("Cinco");
        hs.add("Seis");

        // Podemos ver que no tiene ningun orden en particular
        System.out.println(hs);

        // Si agregamos un elemento que ya está no lo agregara
        boolean b = hs.add("Tres");
        System.out.println("¿Set Permite elementos duplicados?: " + b);
        System.out.println(hs);




    }


}
