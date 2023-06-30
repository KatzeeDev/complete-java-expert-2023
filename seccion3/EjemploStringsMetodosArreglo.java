package seccion3;

public class EjemploStringsMetodosArreglo {

    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";


        // Convertir el string en un array de caracteres
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        // La unica forma seria implementar un For

        char[] arreglo = trabalenguas.toCharArray();
        // Recordar que el metodo en un arreglo es un atributo y no un metodo como en un String
        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++) {
            System.out.println(arreglo[i]);
        }


        System.out.println();
        // Muestra el hash de un objeto
        System.out.println("trabalenguas = " + trabalenguas.split("a"));


        // Hacemos esto para separarlos en array cuando encuentre una a

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for (int j = 0; j < l; j++) {
            System.out.println(arreglo2[j]);
        }

        System.out.println("------------------------------");

        String archivo = "alguna.imagen.json";
        // Indicamos que nos referimos al caraceter .  con \\ o [.]
        String[] archivoArr = archivo.split("\\.");

        l = archivoArr.length;


        for (int i = 0; i < l; i++) {
            System.out.println(archivoArr[i]);

        }


        System.out.println("extension = " + archivoArr[l-1]);




    }


}
