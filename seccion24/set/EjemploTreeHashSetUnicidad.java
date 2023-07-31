package seccion24.set;

import seccion24.model.Alumno;

import java.util.*;

public class EjemploTreeHashSetUnicidad {

    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();
        /*List<Alumno> sa = new LinkedList<>();*/
        sa.add(new Alumno("Copito", 6));
        sa.add(new Alumno("Vicho", 7));
        sa.add(new Alumno("Matias", 4));
        sa.add(new Alumno("Barbara", 3));
        sa.add(new Alumno("Daniel", 5));
        sa.add(new Alumno("Andres", 2));
        sa.add(new Alumno("Andres", 2)); // Al existir el mismo valor no lo muestra debido al equals en Alumno
        sa.add(new Alumno("Andres2", 2));

        System.out.println(sa);

/*
        System.out.println(" ------ Utilizando un for clasico ------ ");
        for (int i = 0; i < sa.size(); i++) {
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }
*/


        System.out.println(" ------ Iterando usando un foreach ------ ");
        for (Alumno a: sa) {
            System.out.println(a);
        }
        System.out.println(" ------ Iterando usando while y iterator ------ ");

        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a);
        }
        System.out.println(" ------ Iterando usando expresiones lambda ------ ");
        sa.forEach(System.out::println);

    }

}
