package seccion24.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {

    public static void main(String[] args) {

        String[] peces = {"Salmon", "Corbina", "Lenguado", "Pejerrey", "Atun", "Salmon"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez: peces) {
            if (!unicos.add(pez)) {
                duplicados.add(pez);
            }
        }

        // Elimina en este caso Salmon y lo agrega al set Duplicados
        unicos.removeAll(duplicados);

        System.out.println("Elementos unicos: " + unicos);

        System.out.println("Elementos duplicados " + duplicados);

    }

}
