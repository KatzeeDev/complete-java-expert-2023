package seccion19.pooclasesabstractas.form.validador;

public class NoNuloValidador extends Validador {

    protected String mensaje = "El campo %s no puede ser Nulo";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return null;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }
}
