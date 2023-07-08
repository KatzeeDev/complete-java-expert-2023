package seccion9;

import java.util.Map;

public class EjemploVariablesDeEntorno {

    public static void main(String[] args) {

        //  Un mapa es un arreglo asociativo. Asocia valores que estan guardados con un nombre. Se le conoce como llave y valor

        Map<String, String> varEnv = System.getenv();

        System.out.print("Variables de ambiente del sistema: " + varEnv);


        // Como obtenemos una particular?

        // Username
        String username = System.getenv("USERNAME");
        System.out.println("Username: " + username);

        // Java Home
        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javahome = " + javahome);

        // TempDir
        String temDir = System.getenv("TEMP");
        System.out.println("temDir: " + temDir);

        // path
        String path = System.getenv("Path");
        System.out.println("path: " + path);

        // Tambien podemos obtenerlo usando el map que creamos antes
        String path2 = varEnv.get("Path");
        System.out.println("\npath2: " + path2);

        // Si creamos una variable de entorno en este caso luego podemos llamarla
        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("\nappEnv: " + appEnv);

        System.out.println(" -------------- Listando las variables de entorno -------------- ");
        for (String key: varEnv.keySet()) {
            System.out.println(key + "=>" + varEnv.get(key));

        }

    }

}
