package seccion03;

public class EjemploString {

    public static void main(String[] args) {

        // Tipo de Dato => Referencia

        // Java crea el objeto string y lo hace por el metodo New pero no lo vemos de esta forma, esto ocurre por detras.
        // Esto es asi porque es tan utilizado que los tipos string se hicieron de esta forma.
        String curso = "Programacion Java";

        String curso2 = new String("Programacion Java");
        
        // Son 2 objetos distintos.
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2: " + esIgual);

        // Si queremos comparar el valor.
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2): " + esIgual);

        // Particularidad de Java. Objetos literales sin utilizar New pueden ser comparados y se les asignara true
        // Esto debido a que Java lo hace para lograr optimizar
        String curso3 = "Programacion Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3: " + esIgual);


}
}
