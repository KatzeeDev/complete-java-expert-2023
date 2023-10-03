package seccion28;

import seccion28.models.Computador;
import seccion28.repository.ComputadorRepositorio;
import seccion28.repository.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {

    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //Computador pc = repositorio.filtrar("rog2").orElseThrow();
        // Usando expresiones lambda
        Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc);

        System.out.println("---- Ejemplo de separar un string ----");
        String archivo = "documento.pdf";
        String extesion = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extesion);


    }
}
