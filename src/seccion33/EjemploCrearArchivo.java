package seccion33;

import seccion33.service.ArchivoServicio;

public class EjemploCrearArchivo {

    public static void main(String[] args) {
        // Definimos una variable con el nombre del archivo
        String nombreArchivo = "C:\\Users\\matoo\\Workspace\\Cursos\\java.txt";
        String nombreArchivo2 = "C:\\Users\\matoo\\Workspace\\Cursos\\java2.txt";

        ArchivoServicio service = new ArchivoServicio();

        service.crearArchivo(nombreArchivo);
        service.crearArchivo2(nombreArchivo2);

    }

}
