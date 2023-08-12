package seccion27.stream;

import seccion27.stream.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {

    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzales", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman", "Pato Guzman", "Pato Guzman")
                .distinct()
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]));

        nombres.forEach(System.out::println);
    }
}
