package seccion06;

public class WrapperInteger {

    public static void main(String[] args) {
        // - Clases envolventes que proporcionan una representación orientada a objetos de los tipos primitivos en Java.
        // - Estas clases permiten utilizar tipos primitivos en contextos donde se requieren objetos y proveen métodos adicionales para mayor funcionalidad.
        // - También permiten manejar el estado null, lo cual no es posible con los tipos primitivos.

        // Creacion de un objeto de forma estatica. Una forma explicita de hacerlo
        Integer intObjeto = Integer.valueOf(32768);

        // Autoboxing: Proceso de conversión automática que realiza el compilador de Java para que un tipo primitivo pase a ser un objeto
        Integer intObjeto2 = 32768;

        // Convertir un primitivo en un objeto Integer
        int intPrimitivo = 32768;
        Integer intObjeto3 = Integer.valueOf(intPrimitivo);

        // Obejeto a un Primitivo
        Integer intObjeto4 = 32768;
        int num = intObjeto4;

        // String a un Integer
        String valorTv = "675000";
        Integer valor = Integer.valueOf(valorTv);

        // Short  Recordemos la perdida de detos , puede ocurrir si en este caso se asigna un valor a una Clase no apta
        // En este caso se observa que posee el valor de 45767 sin embargo imprime -19769. Esto es debido a eso
        Integer intObjeto5 = 45767;
        Short shortObjeto = intObjeto5.shortValue();
        System.out.println(shortObjeto);




    }

}
