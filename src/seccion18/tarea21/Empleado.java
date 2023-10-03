package seccion18.tarea21;

public class Empleado extends  Persona{
    private Double remuneracion;
    private static int nextId = 0;
    private int empleadoid = 0;
    public  int porcentaje = 0;


    public Empleado() {
        this.empleadoid = ++nextId; // asignamos y aumentamos el ID aquí
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoid = ++nextId; // asignamos y aumentamos el ID aquí también
    }


    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoid() {
        return empleadoid;
    }

    public void setEmpleadoid(int empleadoid) {
        this.empleadoid = empleadoid;


    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aumentarRemuneracion(int porcentaje) {
        double aumento = (porcentaje / 100.0) * remuneracion;
        remuneracion += aumento;
        return remuneracion;
    }

    public void imprimirRemuneracion(int porcentaje) {
        double aumento = (porcentaje / 100.0) * remuneracion;
        System.out.println("El porcentaje ingresado es de: " + porcentaje);
        System.out.println("El aumento es de: " + aumento);
        aumentarRemuneracion(porcentaje);
        System.out.println(" La nueva remuneracion es de: " + remuneracion);
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "remuneracion=" + remuneracion +
                ", empleadoid=" + empleadoid;
    }
}
