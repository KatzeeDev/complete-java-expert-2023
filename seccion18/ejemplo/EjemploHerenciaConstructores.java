package seccion18.ejemplo;

import seccion18.pooherencia.*;

public class EjemploHerenciaConstructores {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("========== Creando la instancia de la clase alumno =========");
        Alumno alumno = new Alumno("Matias", "Osorio", 24, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.3);
        alumno.setEmail("katze@cat.com");

        System.out.println("========== Creando la instancia de la clase alumno internacional =========");
        AlumnoInternacional  alumnInt = new AlumnoInternacional("Peter", "Parker", "EEUU");
        alumnInt.setEdad(19);
        alumnInt.setInstitucion("Cambridge");
        alumnInt.setNotaIdiomas(6.5);
        alumnInt.setNotaCastellano(6.4);
        alumnInt.setNotaHistoria(5.8);
        alumnInt.setNotaMatematicas(6.5);
        alumnInt.setEmail("peter@industries.com");

        System.out.println("========== Creando la instancia de la clase Profesor =========");
        Profesor profesor = new Profesor("Andres", "Guzman", "Programacion");
        profesor.setEdad(37);
        profesor.setEmail("profeandres@gmail.com");
        System.out.println(" -------------------------- ");

        imprimir(alumno);
        imprimir(alumnInt);
        imprimir(profesor);


    }

    public static void imprimir(Persona persona) {
        System.out.println("Imprimiendo los datos del tipo Persona: ");
        System.out.println("Nombre: " + persona.getNombre()
                + ", Apellido: " + persona.getApellido()
                + ", Edad: " + persona.getEdad()
                + ", Email: " + persona.getEmail());
        // Control de tipos
        if (persona instanceof Alumno) {
            System.out.println("Imprimiendo los datos del Tipo Alumno: ");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo los datos del tipo Alumno Internacional: ");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("============ Sobre escritura promedio ============");
            System.out.println("Promedio : " + ((Alumno) persona).calcularPromedio());
            System.out.println("============ Sobre escritura promedio ============");

        }
        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("============ Sobre escritura saludar ============");
        System.out.println(persona.saludar());

        System.out.println("==============================");

    }

}
