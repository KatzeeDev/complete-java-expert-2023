package seccion24.list;

import seccion24.model.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {

    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();

        System.out.println(enlazada + ", size= " + enlazada.size());
        System.out.println("Esta vacia =" + enlazada.isEmpty());

        enlazada.add(new Alumno("Copito", 6));
        enlazada.add(new Alumno("Vicho", 7));
        enlazada.add(new Alumno("Matias", 4));
        enlazada.add(new Alumno("Barbara", 3));
        enlazada.add(new Alumno("Daniel", 5));
        enlazada.set(4, new Alumno("Copo", 5));

        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println(" ------ addFirst y addLast ------ ");
        // Usamos metodos de LinkedList
        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Poseidon", 1));

        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println(" ------ getFirst y getLast ------ ");
        // Lanzan exepcion en caso de no encontrar elemento
        System.out.println("Primer elemento: " +enlazada.getFirst());
        System.out.println("Ultimo elemento: " + enlazada.getLast());

        System.out.println(" ------ peekFirst y peekLast ------ ");
        // Este no lanza excepcion
        System.out.println("Primer elemento: " + enlazada.peekFirst());
        System.out.println("Ultimo elemento: " + enlazada.peekLast());

        System.out.println(" ------ obtener un elemento  con un indice especifico ------ ");
        System.out.println("Indice 2: " + enlazada.get(2));

        System.out.println(" ------ removeFirst y removeLast ------ ");
        // Lanza excepcion en caso de no encontrar un elemento
        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println(" ------ pollFirst y pollLast ------ ");
        // No Lanza excepcion
        enlazada.pollFirst();
        enlazada.pollLast();
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println(" ------ pop ------ ");
        // ELimina el primer elemento
        enlazada.pop();
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println(" ------ remove especifico ------ ");
        // Añadimos un par de elementos
        enlazada.add(new Alumno("Vicho", 4));
        enlazada.add(new Alumno("Copito", 6));
        enlazada.add(new Alumno("Minnie", 3));
        System.out.println(enlazada + ", size = " + enlazada.size());
        // Eliminamos a Minnie
        enlazada.remove(new Alumno("Minnie", 3));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println(" ------ addLast ------ ");
        enlazada.addLast(new Alumno("Minnie", 3));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println(" ------ indexOf ------ ");
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Indice de Vicho: " + enlazada.indexOf(new Alumno("Vicho", 4)));

        System.out.println(" ------ remove ------ ");
        // Eliminamos segun índice
        enlazada.remove(0);
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println(" ------ set para remplazar ------ ");
        // Remplazamos a Barbara con indice 0
        enlazada.set(0, new Alumno("Matias", 3));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println(" ------ List Iterator ------ ");
        ListIterator<Alumno> li = enlazada.listIterator();

        System.out.println(" -- HasNext -- ");
        while (li.hasNext()) {
            Alumno al = li.next();
            System.out.println(al);
        }
        System.out.println(" -- HasPrevious -- ");
        while (li.hasPrevious()) {
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }


    }

}
