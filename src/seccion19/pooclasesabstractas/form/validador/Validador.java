package seccion19.pooclasesabstractas.form.validador;

public abstract class Validador {

    protected String mensaje;

    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();
    abstract public boolean esValido(String valor);
}
