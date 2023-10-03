package seccion24.model;

import java.util.Objects;

public class Alumno implements Comparable <Alumno> {
    private String nombre;
    private Integer nota;


    public Alumno() {
    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "\n"
                + "Nombre: " + nombre
                + " Nota: " + nota;
    }


    // Ordenamos de menor a mayor
    @Override
    public int compareTo(Alumno a) {
/*        if (this.nota == a.nota) {
            return 0;
        }
        if (this.nota > a.nota) {
            return 1;
        } else {
            return -1;
        }*/
        if (this.nota == null) {
            return 0;
        }
        return this.nota.compareTo(a.nota);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
