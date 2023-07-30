package seccion23.generics;

import seccion23.poointerfaces.model.Cliente;
import seccion23.poointerfaces.model.ClientePremiun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Matias", "Osorio"));


        // Recupera el primer cliente de la lista
        Cliente andres = clientes.iterator().next();


        // Define arrays de objetos Cliente y de enteros
        Cliente[] clientesArreglo = {new Cliente("Vicho", "De las nieves"), new Cliente("Copito", "De las nieves")};
        Integer[] enterosArreglo = {1, 2, 3};


        // Convierte los arrays en listas utilizando un método genérico
        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);


        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);


        String[] stringArreglo = {"Gato", "Perro", "Pajaro"};


        // Convierte un array de Strings y un array de Integer en una lista de String, e imprime los enteros durante el proceso
        List<String> nombres = fromArrayToList(new String[]{"Matias", "Barbara", "Lucy", "Bea", "John"}, enterosArreglo);
        nombres.forEach(System.out::println);


        List<ClientePremiun> clientePremiunList = fromArrayToList(
                new ClientePremiun[]{new ClientePremiun("Paco", "Fernandez")});

        System.out.println(" -------- Utilizando metodo imprimirClientes -------- ");
        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        System.out.print("Clientes Premiun: ");
        imprimirClientes(clientePremiunList);


        System.out.println(" -------- Utilizando metodo maximo -------- ");
        System.out.println("Maximo de 1, 9 y 4 es: " + maximo(1,9,4));
        System.out.println("Maximo de 3.9 , 11.6 , 7.78 es: " + maximo(3.9, 11.8, 7.78));
        System.out.println("Mazimo de zanahoria, arandanos, manzana es: "
                + maximo("zanahoria", "arandanos", "manzana"));

    }


    // Este método convierte un array de cualquier tipo en una lista
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // Este Limita solo a los de tipo Number
    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // En este caso acepta lo que se hereda de Cliente y Cliente Premiun debido a que hereda de Cliente
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // Este método hace lo mismo que el anterior, pero adicionalmente imprime los elementos de un segundo array.
    // Puede manejar dos tipos diferentes a la vez, llamados T y G.
    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    // Uso de Wildcard <?
    public static void imprimirClientes(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo (T a, T b,  T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        } if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}
