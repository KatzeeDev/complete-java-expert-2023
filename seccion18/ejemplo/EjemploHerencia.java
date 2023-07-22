package seccion18.ejemplo;

import seccion18.pooherencia.Alumno;
import seccion18.pooherencia.AlumnoInternacional;
import seccion18.pooherencia.Profesor;

public class EjemploHerencia {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("========== Creando la instancia de la clase alumno =========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Matias");
        alumno.setApellido("Osorio");
        alumno.setInstitucion("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.3);

        System.out.println("========== Creando la instancia de la clase alumno internacional =========");
        AlumnoInternacional  alumnInt = new AlumnoInternacional();
        alumnInt.setNombre("Rick");
        alumnInt.setApellido("Grimes");
        alumnInt.setPais("EE.UU");
        alumnInt.setEdad(15);
        alumnInt.setInstitucion("Cambridge");
        alumnInt.setNotaIdiomas(6.5);
        alumnInt.setNotaCastellano(6.4);
        alumnInt.setNotaHistoria(5.8);
        alumnInt.setNotaMatematicas(6.5);

        System.out.println("========== Creando la instancia de la clase Profesor =========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Andres");
        profesor.setApellido("Guzman");
        profesor.setAsignatura("Programacion");

        System.out.println(" -------------------------- ");

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido()
                + " Institucion: " + alumno.getInstitucion());

        System.out.println(" -------------------------- ");

        System.out.println("Alumno: " + alumnInt.getNombre() + " " + alumnInt.getApellido()
                + " Institucion: " + alumnInt.getInstitucion()
                + " Pais: " + alumnInt.getPais());

        System.out.println(" -------------------------- ");

        System.out.println("Profesor: " + profesor.getNombre() + " " + profesor.getApellido()
                + " Asignatura: " + profesor.getAsignatura());

        System.out.println(" -------------------------- ");

        Class clase = alumnInt.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();

        }

    }
}
