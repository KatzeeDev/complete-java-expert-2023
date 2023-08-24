package seccion32.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;


    private ConexionBDSingleton () {
        System.out.println("Conectando algun motor de base de datos...");
    }

    // Metodo estatico que nos devuelva una unica instancia
    public static ConexionBDSingleton getInstancia() {
        // Creamos la instancia una sola vez
        if (instancia == null) {
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }


}
