package seccion27.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {

    public static void main(String[] args) {

        System.out.println("----- Creando Stream directamente ------");
        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        nombres.forEach(System.out::println);

        System.out.println("----- Creando flujo desde un array ------");

        String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);


        System.out.println("----- Creando Stream usando Stream.Builder ------");
        // String builder
        Stream<String> nombres2 = Stream.<String>builder()
                .add("Matias")
                .add("Vicho")
                .add("Barbara")
                .add("Carlos")
                .build();
        nombres2.forEach(System.out::println);

        System.out.println("----- Creando Stream usando una coleccion ------");

        List<String> listaAsignaturas = new ArrayList<>();
        listaAsignaturas.add("Lenguaje");
        listaAsignaturas.add("Matematicas");
        listaAsignaturas.add("Historia");
        listaAsignaturas.add("Programacion");

        // Convertimos la coleccion a un stream
        Stream<String> nombreAsignaturas = listaAsignaturas.stream();
        nombreAsignaturas.forEach(System.out::println);

        System.out.println("----- Creando Stream usando una coleccion de manera mas directa ------");
        // Esta podria ser una manera mas directa de crearla
        listaAsignaturas.stream().forEach(System.out::println);


    }

}
