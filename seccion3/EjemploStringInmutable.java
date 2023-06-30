package seccion3;

public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Andres Guzmán ";

        String resultado = curso.concat(profesor);
        System.out.println(curso);
        System.out.println("Resultado = " + resultado);
        System.out.println(curso == resultado);


        // Otra forma de convertir - transformar etc.  Funcion Lambda

        // Funcion Flecha
        String resultado2 = curso.transform(c -> {
           return c + " con " + profesor;
        });

        System.out.println(curso);

        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a", "A");

        System.out.println(resultado3);





    }


}
