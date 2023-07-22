package seccion18.tarea22;

import seccion18.tarea22.Producto;

public class Fruta extends Producto {
    private double peso;
    private String color;


    public Fruta () {
    }

    public Fruta  (String nombre, Double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
