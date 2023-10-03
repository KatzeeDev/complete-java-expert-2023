package seccion18.tarea21;

public class Cliente extends Persona {
    private static int nextId = 0;
    private int clienteid;

    public Cliente() {
        super();
        this.clienteid = nextId;
    }

    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
        this.clienteid = ++nextId;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" +
                "clienteid=" + clienteid +
                '}';
    }
}
