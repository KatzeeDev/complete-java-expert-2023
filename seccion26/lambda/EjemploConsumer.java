package seccion26.lambda;

import seccion26.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {

    public static void main(String[] args) {

        // Consumer es una expresion lamda que permite pasar por argumento un solo parametro
        // Una expresion lambda es una interfaz funcional.
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out.println(nombre + " tiene" + edad + " años");

        consumidorBi.accept("Matias", 24);

        Consumer<String> consumidor2 = System.out::println;
        consumidor2.accept("Hola Mundo Lambda");

        // Uso del foreach
        List<String> nombres = Arrays.asList("Matias", "Vicho", "Copito");
        nombres.forEach(consumidor2);

        // Expresion lambda que asigna un nombre al usuario
        Usuario usuario = new Usuario();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;

        asignarNombre.accept(usuario, "Vicho");

        System.out.println("Nombre usuario: " + usuario.getNombre());

        // Proveedor. Solo devuelve
        Supplier<String> proovedor = () -> "Hola Vicho";

        System.out.println(proovedor.get());

        // Tambien podriamos utilizar el Supplier para que devuelva automaticamente.
        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario1 = creaUsuario.get();




    }

}
