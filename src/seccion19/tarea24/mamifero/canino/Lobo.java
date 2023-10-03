package seccion19.tarea24.mamifero.canino;

public class Lobo extends Canino{

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico,
                String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(int numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return String.format("El lobo de la especie %s esta comiendo", especieLobo);
    }

    @Override
    public String dormir() {
        return String.format("El lobo de la especie %s esta durmiendo", especieLobo);
    }

    @Override
    public String correr() {
        return "El lobo esta corriendo";
    }

    @Override
    public String comunicarse() {
        return String.format("El lobo esta comunicandose con su mananda de %d lobos", numCamada);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNumero de la camada: " + numCamada
                + "\nEspecie Lobo: " + especieLobo;
    }
}
