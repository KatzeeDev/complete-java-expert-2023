package seccion32.observer.ejemplos;

import seccion32.observer.Corporacion;

public class EjemploObserver {

    public static void main(String[] args) {

        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver((observable, obj) -> {
            System.out.println("John:  " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Matias:  " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Marcelo:  " + observable);
        });

        google.modificaPrecio(2000);

    }

}
