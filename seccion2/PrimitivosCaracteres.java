package seccion2;

public class PrimitivosCaracteres {

    public static void main(String[] args) {

        // Una sola letra => Debe ser envuelta en comilas simples al declararlo
        char caracter = '$';
        System.out.println("caracter = " + caracter);
        // Puede expresarse en unicode
        char caracterDolar = '\u0024';
        System.out.println("caracterDolar = " + caracterDolar);
        // En decimal
        char decimal = 36;
        System.out.println("decimal = " + decimal);

        // Comparamos si son los mismos valores.
        System.out.println( "¿Es caracter = caracterDolar y caracter == decimal? : "+ (caracter == caracterDolar && caracter == decimal));

        System.out.println("Char corresponde en byte a " + Character.BYTES);
        System.out.println("Char corresponde en bites a " + Character.SIZE);
        System.out.println("El minimo valor es: " + Character.MIN_VALUE);
        System.out.println("El maximo valor es: " + Character.MAX_VALUE);


        System.out.println(" ------------- Caracteres Especiales ------------- ");

        // Crear un espacio
        char espacio = '\u0020';
        // Ejemplos de uso
        System.out.println("Esto es un ejemplo del uso de espacio:\u0020" + "Ejemplo");

        // Eliminar un caracter
        char retroceso = '\b';
        System.out.println("Esto es un ejemplo del uso de retroceso: 33\b3" + retroceso);

        // Tabular (Es mas grande que el espacio algo asi como __ en vez de _)
        char tabulador = '\t';
        System.out.println("Esto es un ejemplo del uso de tabulador ejem\tlo" + tabulador + "3");

        // Nueva linea
        char nuevaLinea = '\n';
        System.out.println("Este es un ejemplo de un \n salto de linea");

        // Retorno de carro
        char retornoCarro = '\r';
        System.out.println("Este es un ejemplo de \r No va a mostrar lo anterior");


        // Tambien se puede usar como metodo

        System.out.println("Este es un ejemplo de uso de metodo a nivel de sistema" + System.lineSeparator() + "A");








    }


}
