package seccion32.composite;

import java.util.Objects;

abstract public class Componente {
    protected String nombre;

    public Componente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    abstract public String mostrar(int nivel);
    abstract public boolean buscar(String nombre);

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Componente that = (Componente) object;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
