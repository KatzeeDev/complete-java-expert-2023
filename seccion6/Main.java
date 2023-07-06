package seccion6;

public class Main {

    public static void main(String[] args) {

        /*   Seccion 6: Clases Wrapper

        - Introduccion a las clases Wrapper
        - Clase Wrapper Integer
        - Autoboxing y unboxing
        - Clases Wrapper numericas y operadores relacionaes
        - Clase Wrapper Boolean
        - El Metodo getClass() del objeto para la reflexion y la metadata


        Introducción a las clases Wrapper:
        Las clases Wrapper en Java son aquellas que encapsulan un tipo primitivo dentro de un objeto.
        Los tipos primitivos en Java son: byte, short, int, long, float, double, char y boolean, y cada uno de estos
        tiene una correspondiente clase Wrapper: Byte, Short, Integer, Long, Float, Double, Character y Boolean.
        Las clases Wrapper nos proporcionan una manera de utilizar métodos para operar en tipos de datos primitivos.

        Clase Wrapper Integer:
        La clase Integer es una de las clases Wrapper más utilizadas en Java. Envuelve el tipo de dato
        primitivo int en un objeto y define varios métodos útiles para operaciones sobre int.
        Por ejemplo, puedes convertir un int en una cadena (string), encontrar el valor máximo o mínimo int, y
        así sucesivamente.

        Autoboxing y unboxing:
        El autoboxing y el unboxing son técnicas que Java utiliza para convertir automáticamente los
        tipos primitivos en sus correspondientes objetos de clase Wrapper y viceversa.
        Por ejemplo, si tienes una variable int y la usas en un contexto que espera un objeto Integer,
        Java automáticamente "empaqueta" (autoboxing) el int en un Integer. Del mismo modo, si tienes un objeto Integer
        y lo usas en un contexto que espera un int, Java automáticamente "desempaqueta" (unboxing) el Integer
        para obtener el int subyacente.

        Clases Wrapper numéricas y operadores relacionales:
        Las clases Wrapper numéricas (Byte, Short, Integer, Long, Float, Double)
        ofrecen una amplia gama de operaciones para trabajar con datos numéricos.
        También puedes usar operadores relacionales (==, !=, <, >, <=, >=) con estas clases,
        aunque hay que tener en cuenta la diferencia entre comparar los objetos en sí mismos y comparar
        los valores primitivos que contienen.

        Clase Wrapper Boolean:
        La clase Boolean es otra clase Wrapper que envuelve el tipo primitivo boolean en un objeto.
        Proporciona métodos para convertir cadenas en valores boolean, y viceversa,
        y para analizar cadenas para obtener valores boolean.

        El método getClass() del objeto para la reflexión y la metadata:
        Todos los objetos en Java heredan de la clase base Object, que incluye el método getClass().
        Este método se puede utilizar para obtener un objeto Class que representa la clase del objeto.
        A través de este objeto Class, puedes acceder a metadatos sobre la clase, como su nombre, sus campos,
        métodos, interfaces, etc. Esta es una parte importante de la reflexión en Java, que es la capacidad de examinar
        y manipular el comportamiento de una aplicación en tiempo de ejecución.

        */
    }

}
