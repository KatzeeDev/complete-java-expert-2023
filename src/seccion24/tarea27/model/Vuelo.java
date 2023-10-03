package seccion24.tarea27.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private int numPasajeros;

    // SimpleDateFormat para parsear las fechas de llegada
    private static final SimpleDateFormat sdf = new SimpleDateFormat("EEE dd MMM yyyy HH:mm 'hrs'", new Locale("es", "ES"));

    public Vuelo(String nombre, String origen, String destino, String fechaLlegadaStr, int numPasajeros) throws Exception {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = sdf.parse(fechaLlegadaStr);
        this.numPasajeros = numPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre +
                ", origen='" + origen +
                ", destino='" + destino +
                ", fechaLlegada=" + sdf.format(fechaLlegada) +
                ", numPasajeros=" + numPasajeros;
    }
}
