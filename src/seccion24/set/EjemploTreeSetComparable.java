package seccion24.set;

import seccion24.model.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {

    public static void main(String[] args) {

        Set<Alumno> sa = new TreeSet<>((b, a) -> a.getNombre().compareTo(b.getNombre()));
        sa.add(new Alumno("Copito", 6));
        sa.add(new Alumno("Vicho", 7));
        sa.add(new Alumno("Matias", 4));
        sa.add(new Alumno("Barbara", 3));
        sa.add(new Alumno("Daniel", 5));
        sa.add(new Alumno("Andres", 2)); // Al estar repetido no lo agrega debido a que pertenece a los Set
        sa.add(new Alumno("Juan", 2)); // Sin embargo no es la misma forma que con los HashSet.

        System.out.println(sa);
    }

}
