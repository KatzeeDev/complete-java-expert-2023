package seccion18.tarea23.persona;

public class Cliente extends Persona{
    private int clienteId;

    public Cliente() {

    }

    public  Cliente (String nombre, String apellido, String numeroFiscal,
                     String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
    }


    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
}
