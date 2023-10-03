package seccion14.proyectoordencompra;

public class Producto {

    // fabricante tipo String y nombre String y precio int,
    //inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.

    private String fabricante;
    private String nombre;
    private int precio;

    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
