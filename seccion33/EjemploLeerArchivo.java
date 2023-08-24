package seccion33;

import seccion33.service.ArchivoServicio;

public class EjemploLeerArchivo {

    public static void main(String[] args) {

        String nombreArchivo2 = "C:\\Users\\matoo\\Workspace\\Cursos\\java2.txt";
        ArchivoServicio servicio = new ArchivoServicio();
        System.out.println(" ----- Utilizando Buffered Reader ----- ");
        System.out.println(servicio.leerArchivo(nombreArchivo2));
        System.out.println(" ----- Utilizando la clase Scanner ----- ");
        System.out.println(servicio.leerArchivo2(nombreArchivo2));

    }

}
