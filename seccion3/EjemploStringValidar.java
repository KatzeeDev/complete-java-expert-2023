package seccion3;

public class EjemploStringValidar {

    public static void main(String[] args) {

        // Clase para ejemplificar y forzar el NullPointerExcepction
        // Concat solo se usara cuando no existen Nulos

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);


        if(esNulo){
            curso = "Programacion Java";

        }

        // Forma de verificar si esta vacio
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        // Otra forma de verificar si esta vacio, es un atajo al primer metodo
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        // Forma mas estrica de validar.
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false) {
          System.out.println(curso.toUpperCase());
          System.out.println("Bienvenido al Curso " + curso);
        }






    }

}
