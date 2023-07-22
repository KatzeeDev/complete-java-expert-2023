package seccion18.tarea23.producto;

public class Limpieza extends Producto {
    private String componentes;
    private double litros;

    public Limpieza() {
    }

    public Limpieza(String nombre, Double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "\n----------Lacteo ----------"
                +"\n" + super.toString()
                + "\nComponentes: " + componentes
                + "\nLitros: " + litros;
    }
}
