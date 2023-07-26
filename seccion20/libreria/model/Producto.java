package seccion20.libreria.model;

public class Producto implements Vendible{

    private String nombre;
    private double precio;
    private int stock;


    public Producto() {
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void vender() {
        if (stock > 0) {
            stock--;
            System.out.println("Se ha vendido el producto llamado: " + nombre + ". Quedan " + stock + " en Stock");
        } else {
            System.out.println("Lo siento, el producto llamado " + nombre + " esta agotado.");
        }
    }


}
