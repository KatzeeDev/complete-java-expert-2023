package seccion20.libreria.model;

public class Libro extends Producto{
    private String autor;


    public Libro(String autor) {
        this.autor = autor;
    }

    public Libro(String nombre, double precio, int stock, String autor) {
        super(nombre, precio, stock);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void display() {
        System.out.println("Autor del libro: " + getAutor());
        System.out.println("Nombre del libro: " + getNombre());
        System.out.println("Precio:" + getPrecio());
        System.out.println("Stock: " + getStock());
    }
}
