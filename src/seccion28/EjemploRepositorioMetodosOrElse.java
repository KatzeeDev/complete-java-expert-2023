package seccion28;

import seccion28.models.Computador;
import seccion28.repository.ComputadorRepositorio;
import seccion28.repository.Repositorio;

public class EjemploRepositorioMetodosOrElse {

    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //Computador defecto = new Computador("HP", "Pavilion");

        // Aca imprimimos si lo encuentra y si no imprime el valor por defecto que es el HP
        // El orElse siempre crea el objeto, incluso si no es necesario. Esto puede afectar el rendimiento.
        Computador pc = repositorio.filtrar("rog").orElse(valorDefecto());
        System.out.println(pc);

        // Podriamos utilizar el defecto o crear uno dentro

        pc = repositorio.filtrar("macbook pro").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);

    }

    public static Computador valorDefecto() {
        System.out.println("Obteniendo el valor por defecto!!");
        return new Computador("Hp Omen", "LA0001");
    }

}
