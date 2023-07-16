package seccion14.proyectoinventariolibreria;

import java.util.Date;
import java.util.List;

public class VentaLibros {
    private Integer autoincremental = 0;
    private String nota;
    private Date date = new Date();
    private Lector lector;
    private Libro[] libros = new Libro [3];


    // Constructor
    public VentaLibros(String nota){
        this.nota = nota;
    }

    // Getters and Setters
    public Integer getAutoincremental() {
        return autoincremental;
    }

    public String getNota() {
        return nota;
    }

    public Date getDate() {
        return date;
    }

    public Lector getLector() {
        return lector;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLector(Lector lector){
        this.lector = lector;
    }

    public void setFecha(Date date){
        this.date = date;
    }

    // Metodo para agregar libros
    public void addLibro (Libro libro) {
        if (libro == null) {
            System.out.println("No se puede agregar un libro nulo a la venta.");
            return;
        }

        if (autoincremental < libros.length) {
            this.libros[autoincremental++] = libro;
        } else {
            System.out.println("No se pueden agregar mas libros a la venta, maximo 3");
        }
    }
    public int calcularTotal () {
        int total = 0;
        for (Libro libro: libros) {
            if (libro != null) {
                total += libro.getPrecio();
            }
        }
        return total;
    }

public void imprimirDetalleVenta () {
    System.out.println("Nota: " + nota);
    System.out.println("fecha: " + date);
    System.out.println("Lector: " + getLector().getNombre() + " " + getLector().getApellido());
    System.out.println("Libros: ");
    for (Libro libro: libros) {
        if (libro != null) {
            System.out.println("\tEditorial: " + libro.getEditorial());
            System.out.println("\tTitulo: " + libro.getTitulo());
            System.out.println("\tPrecio: " + libro.getPrecio());
            System.out.println();
        }
    }
    System.out.println("Total: " + calcularTotal());
}


}
