package seccion19.tarea24.mamifero.felino;

public class Tigre extends Felino {
    private String especieTigre;


    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico,
                 float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }


    @Override
    public String comer() {
        return "El tigre de la especie: " + especieTigre + " " + "esta comiendo";
    }

    @Override
    public String dormir() {
        return "El tigre de la especie: " + especieTigre + " " + "esta durmiendo";
    }

    @Override
    public String correr() {
        return "El tigre de la especie: " + especieTigre + " " + "esta corriendo";
    }

    @Override
    public String comunicarse() {
        return "El tigre de la especie: " + especieTigre + " " + "esta comunicandose";

    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNombre: Tigre"
                + "\nEspecie: " + especieTigre;
    }
}
