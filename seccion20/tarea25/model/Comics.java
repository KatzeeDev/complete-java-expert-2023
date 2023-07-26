package seccion20.tarea25.model;

import java.util.Date;

public class Comics extends Libro{

    private String personaje;

    public Comics() {
        super();
    }

    public Comics(String personaje) {
        super();
        this.personaje = personaje;
    }

    public Comics(Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }


    @Override
    public double getPrecioVenta() {
        return getPrecio() * 3;
    }
}
