package seccion3;

public class EjemploStringExtensionArchivo {

    public static void main(String[] args) {

        // Obtener la extension de un archivo.

        String archivo = "alguna_imagen.json";
        String archivo2 = "alguna_imagen.jpg";


        System.out.println("archivo.length() = " + archivo.length());

        // De forma estatica
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(14) = " + archivo.substring(archivo.length() -4));


        // De forma mas automatica
        int i = archivo.lastIndexOf('.');

        System.out.println("archivo.substring(i) = " + archivo.substring(i));
        System.out.println("archivo2.substring(i) = " + archivo2.substring(i));





    }

}
