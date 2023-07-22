package seccion18.ejemplo;

import seccion18.pooherencia.Alumno;
import seccion18.pooherencia.AlumnoInternacional;
import seccion18.pooherencia.Persona;
import seccion18.pooherencia.Profesor;

public class EjemploHerenciaToString {

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
        System.out.println(" --------------------------------------------------- ");
        System.out.println(persona);

    }

}
