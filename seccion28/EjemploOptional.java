package seccion28;

import java.util.Optional;

public class EjemploOptional {

    public static void main(String[] args) {

        String nombre = "Matias";

        // Indicamos el optional y el tipo de dato que va a contener
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        // Metodo para saber si esta presente o no. Es un booleano
        System.out.println(opt.isPresent());
        // Por ej
        if (opt.isPresent()) {
            System.out.println("Hola " + opt.get());
        }

        // Esto es lo contrario. Es la negacion del isPresent
        System.out.println(opt.isEmpty());
        System.out.println("---- Expresiones lambda y utilizacion del IfPresent ----");
        // Utilizamos expresiones lambda y el metodo ifPresent.
        opt.ifPresent(valor -> System.out.println("Hola " + valor));

        System.out.println("---- Si el Optional es Null ----");
        // Si el nombre es null
        nombre = null;
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresentOrElse(valor -> System.out.println("Hola " + valor),
                () -> System.out.println("No está presente"));

        // Lo anterior es lo mismo que esto
        if (opt.isPresent()){
            System.out.println("Hola " + opt.get());
        } else {
            System.out.println("No esta presente");
        }

        // Crearemos otro optional
        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());

    }
}
