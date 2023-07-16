package seccion14.proyectoinventariolibreria;

public class Libro {
    private String editorial;
    private String titulo;
    private int precio;

    // Constructor
    public Libro(String editorial, String titulo, int precio) {
        this.editorial = editorial;
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrecio() {
        return precio;
    }
}
