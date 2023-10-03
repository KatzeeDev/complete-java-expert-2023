package seccion03;

public class EjemploStringsMetodos {

    public static void main(String[] args) {

        // Metodos mas Importantes del objeto String Parte 1
        String nombre = "Matias";

        // .length() => Para saber cuantos caracteres tiene
        System.out.println("nombre.length() = " + nombre.length());

        // .toUpperCase() => Para que el string este en mayusculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        // .toLowerCase() => Para que el string este en minuscula
        System.out.println("nombre = " + nombre.toLowerCase());

        // .equals() => Para comparar un string y otro a nivel de valor. Recordar que Java es sensible a mayusculas y minusculas
        System.out.println("nombre.equals(\"Matias\") = " + nombre.equals("Matias"));
        System.out.println("nombre.equals(\"matiaS\") = " + nombre.equals("matiaS"));

        // .equalsIgnoreCase() => Ignorar la mayuscula o minuscula
        System.out.println("nombre.equalsIgnoreCase(matias) = " + nombre.equalsIgnoreCase("matias"));

        //  .compareTo() Comparar Caracteres utilizando orden lexico grafico.
        //  Realiza comparaciones segun el orden numerico unicode 0 = Iguales
        System.out.println("nombre.compareTo = " + nombre.compareTo("Matias"));

        // .charAt(int) Retorna el caracter que este en esa posicion del indice
        System.out.println("nombre.charAt(1) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(2));
        // Si queremos obtener el utimo caracter
        System.out.println("nombre.charAt(nombre.length() -1) = " + nombre.charAt(nombre.length() -1));

        // subString(Desde-Hasta)  Obtener un fragmento del string.
        // El valor que se ingresa es de donde se toma segun el indice
        System.out.println("nombre.substring() = " + nombre.substring(1,4));
        // Para obtener los ultimos
        System.out.println("nombre.substring() = " + nombre.substring(nombre.length() -4));



        //                  Métodos importantes del objeto String parte 2
        String trabalenguas = "trabalenguas";

        // .replace()  Se utiliza para remplazar caracteres de un String.
        System.out.println("trabalenguas.replace(\"a\",\"e\") = " + trabalenguas.replace("a","o"));
        // Recordar que los String son inmutables
        System.out.println("trabalenguas = " + trabalenguas);
        
        // .indexOf() Permite saber si se encuentra un caracter o un string dentro de otro y retornara la posicion
        // En este caso solo busca la primera
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));

        // . lastIndexOf() Realiza lo mismo que el anterior pero en este caso devuelve la ultima ocurrencia
        System.out.println("trabalenguas.lastIndexOf() = " + trabalenguas.lastIndexOf("aba"));
        // Si buscamos algo que no existe retornara un -1. En este caso se buscara la z
        System.out.println("trabalenguas.lastIndexOf() = " + trabalenguas.lastIndexOf('z'));
        
        // .contains  Retorna un booleano que si el string contiene otro string
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("lenguas"));


        // .startWhit() Retorna un booleano en el caso de que si comienza con ..
        System.out.println("trabalenguas.startsWith() = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.startsWith() = " + trabalenguas.startsWith("aba"));
        
        // .endWith() Retorna un booleano en el caso de que si termina con ..
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("aba"));


        // .trim() Quitar Espacios
        System.out.println("   trabalenguas  ");
        System.out.println("   trabalenguas  ".trim());

        

    }


}
