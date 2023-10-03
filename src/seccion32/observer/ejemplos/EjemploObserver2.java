package seccion32.observer.ejemplos;

import seccion32.observer.UsuarioRepositorio;

public class EjemploObserver2 {

    public static void main(String[] args) {

        UsuarioRepositorio repo = new UsuarioRepositorio();
        repo.addObserver((o, u) -> System.out.println("Enviando un email al usuario..." + u));
        repo.addObserver((o, u) -> System.out.println("Enviando un email al administrador..." + u));
        repo.addObserver((o, u) -> System.out.println("Guardando info del usuario en el logs..." + u));
        repo.crearUsuario("Matias");

    }
}
