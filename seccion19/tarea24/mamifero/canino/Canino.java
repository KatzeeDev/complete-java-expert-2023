package seccion19.tarea24.mamifero.canino;

import seccion19.tarea24.mamifero.Mamifero;

public abstract class Canino extends Mamifero {
    protected String color;
    protected float tamanoColmillos;

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico,
                  String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nColor: " + color
                + "\nTamaño Colmillos (cm): " + tamanoColmillos;
    }
}
