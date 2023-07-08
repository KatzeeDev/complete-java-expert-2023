package seccion03;

public class EjemploStringConcatenacion {

    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Andres Guzmán ";

        String detalle = curso + " con el instructor " + profesor;

        System.out.println(detalle);

        // Concatenacion de strings con  numeros
        int numeroA = 10;
        int numeroB = 5;
        //El resultado sera => Programacion Java con el instructor Andres Guzmán 15 debido a la precedencia de operadores
        System.out.println(detalle + (numeroA + numeroB));
        // Importante mencionar que las expresiones se van evaluando de izq a derecha
        //El resultado de esto seria => 15Programacion Java con el instructor Andres Guzmán
        System.out.println(numeroA + numeroB + detalle);


        // Concatenar de otra forma
        String detalle2 = curso.concat(" con el instructor ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);


        // Nota: Importante mencionar que lo que hace el + detras de escena es concatenar atraves de un stringbuilder


    }


}
