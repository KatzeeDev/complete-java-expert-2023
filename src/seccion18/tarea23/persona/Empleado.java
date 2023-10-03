package seccion18.tarea23.persona;

public class Empleado extends Persona{
    private Double remuneracion;
    private static int nextId = 0;
    private int empleadoId;

    public Empleado () {

    }

    public Empleado (String nombre, String apellido, String numeroFiscal, String direccion,
                     Double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
    }


    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Empleado.nextId = ++nextId;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCargo: Empleado"
                + "\nRemuneracion: " + remuneracion +
                "\nEmpleado ID: " + empleadoId;
    }
}
