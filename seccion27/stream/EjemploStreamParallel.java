package seccion27.stream;

import seccion27.stream.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {

    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres", "Guzman"));
        lista.add(new Usuario("Matias", "Osorio"));
        lista.add(new Usuario("Vicho", "Vicharracus"));
        lista.add(new Usuario("Barbara", "Solis"));
        lista.add(new Usuario("Bruce", "Wayne"));
        lista.add(new Usuario("Bruce", "Lee"));

        long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                //Esto hace la diferencia, ya que si esta se ejecuta en paralelo
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName());
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (nombre.contains("bruce" .toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total " + (t1 - t2));
        System.out.println(resultado);
    }
}
