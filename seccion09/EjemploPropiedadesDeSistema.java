package seccion09;

import java.util.Properties;

public class EjemploPropiedadesDeSistema {

    public static void main(String[] args) {
        // Nombre de Usuario
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        // Ruta
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        // Workspace o Directorio
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        // Version de Java
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        // Salto de Linea
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator: " + lineSeparator + "una linea nueva");
        // Otro ejemplo de Salto de linea
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator2 = " + lineSeparator2);

        System.out.println(" ----------------- Lista de Propiedades ----------------- ");

        // Listar todas las propiedades del Sistema
        Properties properties = System.getProperties();
        properties.list(System.out);


    }

}
