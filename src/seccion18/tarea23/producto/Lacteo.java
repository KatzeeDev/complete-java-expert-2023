package seccion18.tarea23.producto;

public class Lacteo extends Producto {
    private int cantidad;
    private int proteinas;


    public Lacteo() {

    }

    public Lacteo(String nombre, Double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String toString() {
        return "\n----------Lacteo ----------"
                + "\n" + super.toString()
                + "\nCantidad: " + cantidad
                + "\nProteinas: " + proteinas;
    }
}
