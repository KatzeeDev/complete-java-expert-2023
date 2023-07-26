package seccion20.libreria;

import seccion20.libreria.model.Libro;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("El Imperio final", 343, 3, "Brandon Sanderson");

        libro.display();
        libro.vender();


    }
}
