package seccion19.tarea24.mamifero.felino;

public class Guepardo extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico,
                    float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo esta comiendo";
    }

    @Override
    public String dormir() {
        return "EL Guepardo esta durmiendo";
    }

    @Override
    public String correr() {
        return String.format("EL Guepardo esta Corriendo a una velocidad de %d kilometros por hora", getVelocidad());
    }

    @Override
    public String comunicarse() {
        return "El Guepardo esta comunicandose ";
    }

}
