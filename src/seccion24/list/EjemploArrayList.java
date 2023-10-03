package seccion24.list;

import seccion24.model.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {

    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();

        System.out.println(al + ", size= " + al.size());
        System.out.println("Esta vacia =" + al.isEmpty());

        al.add(new Alumno("Copito", 6));
        al.add(0, new Alumno("Vicho", 7)); // Movemos Vicho al primer elemento
        al.add(new Alumno("Matias", 4));
        al.add(new Alumno("Barbara", 3));
        al.add(new Alumno("Daniel", 5));

        al.set(4, new Alumno("Copo", 5)); // Al ser un set remplaza a la posicion 4 (Daniel)

        // Tambien podemos eliminar atraves del indice
        al.remove(2); // Eliminamos a Matias
        System.out.println(al + ", size= " + al.size());

        al.remove(new Alumno("Barbara", 3)); // Eliminamos a Barbara, Los datos deben ser identicos
        System.out.println(al + ", size= " + al.size());

        // Contains
        System.out.println(" ------- Contains ------- ");
        boolean b = al.contains(new Alumno("Copito", 6));
        System.out.println("¿La lista contiene a Copito, 6?: " + b);

        System.out.println(" ------- Convertir esta lista a un Array ------- ");
        Object[] a = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("Desde el arreglo: " + a[i]);
        }

    }

}
