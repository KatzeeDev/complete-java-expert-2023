package seccion24.map;

import java.util.*;

public class EjemploTreeMap {

    public static void main(String[] args) {

        System.out.println();
        // Ordena las llaves. En este caso segun abcd
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length)); // Segun el largo del String
        persona.put("nombre", "John");
        persona.put("apellido", "Titor");
        persona.put("apellidoMaterno", "Desconocido");
        persona.put("email", "johntitor2036@gmail.com");
        persona.put("anhoDeOrigen", 2036);
        //persona.put(null, 2000); => No Acepta null


        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "Ohio");
        direccion.put("ciudad", "Toledo");
        direccion.put("calle", "Bush");
        direccion.put("numero", "234");

        // Asignamos direccion a persona
        persona.put("direccion", direccion);
        mostrarMap(persona);
    }
    public static void mostrarMap(Map<String, Object> personaHashMap) {
        System.out.println(" -------- Map -------- ");
        for (String llave : personaHashMap.keySet()) {
            Object valor = personaHashMap.get(llave);
            System.out.println(llave + " => " + valor);
        }
    }

}
