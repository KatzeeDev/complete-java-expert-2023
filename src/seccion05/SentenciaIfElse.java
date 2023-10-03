package seccion05;

public class SentenciaIfElse {

    public static void main(String[] args) {

        double promedio = 5.5f;

        if(promedio >= 6.5) {
            System.out.println("Felicitaciones, Excelente promedio");
        } else if (promedio >= 6.0){
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5) {
            System.out.println("Bueno");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas mayor esfuerzo");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar mas");
        } else {
            System.out.println("Reprobado");
        }


        System.out.println("Tu promedio es de:" + promedio);

    }

}
