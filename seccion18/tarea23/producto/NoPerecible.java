package seccion18.tarea23.producto;

public class NoPerecible extends Producto {
    private int contenido;
    private int calorias;

    public NoPerecible() {

    }

    public NoPerecible(String nombre, Double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "---------- No perecible ----------"
                + "\n" + super.toString()
                + "\nContenido: " + contenido
                + "\nCalorias: " + calorias;
    }
}
