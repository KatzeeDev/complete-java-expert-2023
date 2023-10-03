package seccion24.map;

import java.util.*;

public class EjemploHashMapObject {

    public static void main(String[] args) {

        System.out.println();
        // Contiene una llave, con la cual se llama al objeto.
        // Los datos no están ordenados.
        Map<String, Object> persona = new HashMap<>();
        persona.put("nombre", "John");
        persona.put("apellido", "Titor");
        persona.put("apellidoMaterno", "Desconocido");
        persona.put("email", "johntitor2036@gmail.com");
        persona.put("anhoDeOrigen", 2036);
        persona.put(null, 2000); // Acepta solo un null


        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "Ohio");
        direccion.put("ciudad", "Toledo");
        direccion.put("calle", "Bush");
        direccion.put("numero", "234");

        // Asignamos direccion a persona
        persona.put("direccion", direccion);

        System.out.println(persona);

        String nombre = (String) persona.get("Nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("Apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String estado = direccionPersona.get("estado");
        String barrio = direccionPersona.getOrDefault("barrio", "La playa");

        System.out.println(" --------- Uso de Map Direccion --------- ");
        System.out.println("El Pais de John es : " + pais
                + "\nLa ciudad es: " + ciudad
                + "\nEl estado es: " + estado
                + "\nEl barrio es: " + barrio);

        // ================= Metodos Importantes de HashMap =================
        System.out.println(" ------ remove ------ ");
        //String valorApellido = persona.remove("apellidoMaterno"); => Elimina atraves de la llave
        boolean b = persona.remove("apellidoMaterno", "Desconocido"); // Elimina atraves de la llave o llave y valor
        System.out.println("b = " + b);
        System.out.println("persona = " + persona);

        System.out.println(" ------ contains ------ ");
        // Retorna un boolean
        boolean b2 = persona.containsKey("email"); // => Preguntamos si existe la key
        System.out.println("¿Persona contiene la key email?: " + b2);

        // Preguntamos si existe el valor
        b2 = persona.containsValue("2036"); // => Preguntamos si existe el valor
        System.out.println("¿Persona contiene el valor 2036? " + b2);

        System.out.println(" ------ values ------ ");
        // Imprimimos los valores utilizando Collection.
        System.out.println(" --- Valores --- ");
        Collection<Object> valores = persona.values();
        for (Object valor : valores) {
            System.out.println(valor);
        }
        System.out.println(" --- Llaves --- ");
        Set<String> llaves = persona.keySet();
        for (String keys : llaves) {
            System.out.println(keys);
        }
        // ======================== Uso de instanceOf  ========================
        System.out.println(" ------ Uso de Instance Of Map Entry ------ ");
        System.out.println(" --- Llaves y Valores utilizando Map.Entry --- ");
        for (Map.Entry<String, Object> par : persona.entrySet()) {
            Object valor = par.getValue();
            if (valor instanceof Map) {
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for (Map.Entry<String, String> parDir : direccionMap.entrySet()) {
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            }

        }

        // ======================== Uso de instanceOf  ========================
        System.out.println(" ------ Uso de Instance Of KeySet ------ ");
        System.out.println(" --- Otra forma de obtener llaves y valores  --- ");
        for (String llave : persona.keySet()) {
            Object valor = persona.get(llave);
            if (valor instanceof Map) {
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pais de " + nom + ": "
                        + direccionMap.get("pais"));
                System.out.println("El estado de " + nom + ": "
                        + direccionMap.get("estado"));
                System.out.println("La ciudad de " + nom + ": "
                        + direccionMap.get("ciudad"));
            } else {
                System.out.println(llave + " => " + valor);
            }
        }

        System.out.println(" --- Utilizando expresiones lambda  --- ");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + "=>" + valor);
        });

        System.out.println(" ------ size ------ ");
        System.out.println("Total: " + persona.size());

        System.out.println(" ------ isEmpty ------ ");
        System.out.println("persona ¿Contiene elementos?: " + !persona.isEmpty());

        System.out.println(" ------ replace ------ ");
        // En este caso remplaza el valor de la key

        persona.replace(null, "1999");// => null posee el valor 2000 y es remplazado por 1999
        for (String llave : persona.keySet()) {
            Object valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }
        // Se puede utilizar boolean
        boolean b3 = persona.replace("email", "johntitor2036@gmail.com", "johntitor2036@hotmail.com");
        System.out.println("¿El valor fue remplazado con exito? : " + b3);
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
