package seccion32.decorator.decorador;

import seccion32.decorator.Formateable;

public class RemplazarEspacioDecorador extends TextoDecorador{

    public RemplazarEspacioDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
