package seccion18.pooherencia;

public final class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdiomas;


    public AlumnoInternacional() {
        System.out.println("Alumno Internacional: Inicializando Constructor...");
    }
    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }


    @Override
    public String saludar() {
        return super.saludar() + " , soy extranjero y mi pais es " + getPais();
    }

    @Override
    public double calcularPromedio() {
        // A la hora de imprimir imprimira 2 debido al uso del Super
        System.out.println("CalcularPromedio " + AlumnoInternacional.class.getCanonicalName());
        // Utilizamos el *3 para anular la division anterior ya que alumno internacional tienen ota iidomas
        return ((super.calcularPromedio()*3 + notaIdiomas) / 4);
    }

    @Override
    public String toString() {
        return super.toString() + "\npais='" + pais + '\'' +
                ", notaIdiomas=" + notaIdiomas;
    }
}
