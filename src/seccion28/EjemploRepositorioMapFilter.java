package seccion28;

import seccion28.models.Computador;
import seccion28.models.Fabricante;
import seccion28.models.Procesador;
import seccion28.repository.ComputadorRepositorio;
import seccion28.repository.Repositorio;

public class EjemploRepositorioMapFilter {

    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("macbook")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "Intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);

    }


}
