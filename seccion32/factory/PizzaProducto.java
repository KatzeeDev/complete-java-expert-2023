package seccion32.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void preparar() {
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando Salsa " + masa);
        System.out.println("Agregando Salsa " + salsa);
        System.out.println("Agregando Ingredientes ");
        this.ingredientes.forEach(System.out::println);
    }

    abstract public void cocinar();
    abstract public void cortar();
    public void empaquetar() {
        System.out.println("Poniendo la pizza en una caja de empaque... ");
    }



    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
