package seccion19.tarea24.mamifero.canino;

public class Perro extends Canino{

    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico,
                 String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return String.format("El perro esta comiendo, posee una fuerza de mordida de %d", fuerzaMordida);
    }

    @Override
    public String dormir() {
        return "El perro esta durmiendo";
    }

    @Override
    public String correr() {
        return "El perro esta corriendo";
    }

    @Override
    public String comunicarse() {
        return "El perro esta comunicandose";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nFuerza de mordida(N/cm): " + fuerzaMordida;
    }
}
