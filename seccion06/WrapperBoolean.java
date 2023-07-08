package seccion06;

public class WrapperBoolean {

    public static void main(String[] args) {

        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;


        // Ahora utilizaremos la clase de referencia
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf(false);
        Boolean objBoolean3 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        // Los comparamos por instancia
        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean2 == objBoolean3));


        // Convierte un objeto Boolean a un Primitivo. Esto se conoce como unboxing
        // Forma explicita
        boolean primBoolean2 = objBoolean2.booleanValue();

        // Forma implicita
        primBoolean2 = objBoolean3;



        /*


        */


    }

}
