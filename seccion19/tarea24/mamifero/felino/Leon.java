package seccion19.tarea24.mamifero.felino;

public class Leon extends Felino{

    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad,
                int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public void setNumManada(int numManada) {
        this.numManada = numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return String.format("El Leon está comiendo junto a la manada de %d leones", numManada);
    }


    @Override
    public String dormir() {
        return "El Leon esta durmiendo con la manada";
    }

    @Override
    public String correr() {
        return "El Leon esta corriendo junto a una manada de " + numManada + " " + "Leones";
    }

    @Override
    public String comunicarse() {
        return "El Leon esta Comunicandose con un rugido de una potencia de " + potenciaRugidoDecibel + " decibeles";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNombre: Leon"
                + "\nNumero Manada: " + numManada
                + "\nPotencia de Rugido (Decibeles) : " + potenciaRugidoDecibel;
    }
}
