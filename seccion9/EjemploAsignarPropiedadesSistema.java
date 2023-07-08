package seccion9;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesSistema {

    public static void main(String[] args) {

        // La idea es agregar las configuraciones creadas en config propertis.     Stream = Flujo de Datos

        try {
            FileInputStream archivo = new FileInputStream("src/seccion9/config2.properties");

            Properties properties = new Properties(System.getProperties());
            properties.load(archivo);
            properties.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");

            // Ahora seteamos las propiedades que elaboramos arriba
            System.setProperties(properties);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.auto.nombre"));
            System.out.println(System.getProperty("cofig.autor.email"));

        } catch (Exception e) {
            System.err.println("No existe el archivo: " + e);
            System.exit(1);
        }



    }
}
