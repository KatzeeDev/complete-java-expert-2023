package seccion14.proyectoinventariolibreria;

public class Lector {
    private String nombre;
    private String apellido;

    // Constructor
    public Lector (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
