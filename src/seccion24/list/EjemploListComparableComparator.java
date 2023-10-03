package seccion24.list;

import seccion24.model.Alumno;

import java.util.*;

public class EjemploListComparableComparator {

    public static void main(String[] args) {

        List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Copito", 6));
        sa.add(new Alumno("Vicho", 7));
        sa.add(new Alumno("Matias", 4));
        sa.add(new Alumno("Barbara", 3));
        sa.add(new Alumno("Daniel", 5));
        sa.add(new Alumno("Andres", 2));
        sa.add(new Alumno("Andres", 2)); // Al ser una Lista admite valores duplicados
        sa.add(new Alumno("Andres2", 2));

        // Al ser una lista podemos ordenar
        // Ordena por nota debido a nuestra implementacion en alumno en el compareTo
        //Collections.sort(sa, (b,a) -> a.getNota().compareTo(b.getNota()));

        // Pero también podemos implementar el sort directamente
        //sa.sort((b, a) -> a.getNota().compareTo(b.getNota()));

        // Usando java 8
        sa.sort(Comparator.comparing(Alumno::getNota).reversed());

        System.out.println(sa);

        System.out.println(" ------ Iterando usando expresiones lambda ------ ");
        sa.forEach(System.out::println);

    }

}
