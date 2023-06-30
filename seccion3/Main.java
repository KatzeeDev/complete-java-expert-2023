package seccion3;

public class Main {
    public static void main(String[] args) {
        // Estos archivos corresponden a la seccion 3. y abarca los siguientes temas

        /*
        - Introduccion a los String
        - Creando Objeto String en la literal vs operador new
        - Concatenando String
        - Inmutabilidad
        - Test Rendimiento concatenar con operador + vs metodo concat() vs StringBuilder
        - Validar un String
        - Metodos Importantes del objeto String Parte 1
        - Metodos Importantes del objeto String Parte 2
        - Obtener la extension de un archivo
        - Algunos metodos utiles para convertir un string en un arreglo
        */


        String ejemplo = "Esto es un string utilizando lo de siempre";
        System.out.println("ejemplo = " + ejemplo);
        String ejemplo2 = new String("Esto es un string utilizando new");
        System.out.println("ejemplo2 = " + ejemplo2);



        // Comparar
        String str1 = "Hola Matias";
        String str2 = new String("Hola Matias");


        // Chequea si son el mismo objeto => False
        System.out.println("¿Son el mismo objeto?: " + (str1 == str2));

        // Chequea si tienen el mismo valor => True
        System.out.println("¿Son el mismo objeto?: " + str1.equals(str2));






    }
}
