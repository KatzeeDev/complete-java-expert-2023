package seccion6;

public class WrapperOperadoresRelacionales {

    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Ambas instancias son iguales. Es la misma, es un objeto que esta asignado a 2 variables de tipo Integer.
        System.out.println("Son el mismo objeto? " + (num1 == num2));


        // Ahora realizamos el siguiente ejercicio.
        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // No son iguales, contiene el mismo valor pero no la misma instancia ya que a num2 se le asigna otra instancia
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        // Comparamos ahora si poseen el mismo valor
        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));


        // Unboxing. En este caso pasa de valores de referencia a primitivos
        boolean condicion = num1 < num2;
        System.out.println(condicion);

    }

}
