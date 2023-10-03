package seccion32.decorator2;

public class Cafe implements Configurable{

    private String nombre;
    private float precio;

    public Cafe(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public float getPrecioBase() {
        return this.precio;
    }

    @Override
    public String getIngredientes() {
        return this.nombre;
    }
}
