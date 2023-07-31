package seccion24.tarea27;

import seccion24.tarea27.model.Vuelo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {

        LinkedList<Vuelo> vuelos = new LinkedList<>();

        vuelos.add(new Vuelo("AAL933", "New York", "Santiago", "Lun 29 Ago 2021 05:39 hrs", 62));
        vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", "Lun 31 Ago 2021 04:45 hrs", 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", "Lun 30 Ago 2021 16:00 hrs", 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", "Lun 29 Ago 2021 13:22 hrs", 59));
        vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", "Lun 31 Ago 2021 14:05 hrs", 25));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", "Lun 31 Ago 2021 05:20 hrs", 29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", "Lun 30 Ago 2021 08:45 hrs", 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", "Lun 29 Ago 2021 07:41 hrs", 51));
        vuelos.add(new Vuelo("SKU 303", "Lima", "Santiago", "Lun 30 Ago 2021 10:35 hrs", 48));
        vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", "Lun 29 Ago 2021 09:14 hrs", 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", "Lun 31 Ago 2021 08:33 hrs", 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", "Lun 31 Ago 2021 15:15 hrs", 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", "Lun 30 Ago 2021 08:14 hrs", 47));
        vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", "Lun 29 Ago 2021 22:53 hrs", 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", "Lun 31 Ago 2021 09:57 hrs", 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", "Lun 31 Ago 2021 04:00 hrs", 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", "Lun 29 Ago 2021 07:45 hrs", 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", "Lun 30 Ago 2021 07:12 hrs", 58));
        vuelos.add(new Vuelo("LAT 501", "París", "Santiago", "Lun 29 Ago 2021 18:29 hrs", 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", "Lun 30 Ago 2021 15:45 hrs", 39));

        // Ordenar la lista de vuelos por fecha de llegada en orden ascendente
        Collections.sort(vuelos, Comparator.comparing(Vuelo::getFechaLlegada));

        System.out.println("Vuelos ordenados por fecha de llegada ascendente:");
        for(Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }

        // Obtener el último vuelo en llegar
        Vuelo ultimoVuelo = vuelos.get(vuelos.size() - 1);
        System.out.println("El último vuelo en llegar es " + ultimoVuelo.getNombre() + ": " + ultimoVuelo.getOrigen()
                + ", aterriza el " + Vuelo.getSdf().format(ultimoVuelo.getFechaLlegada()));

        // Obtener el vuelo con menos pasajeros
        Vuelo vueloMenosPasajeros = Collections.min(vuelos, Comparator.comparing(Vuelo::getNumPasajeros));
        System.out.println("El vuelo con menor número de pasajeros es " + vueloMenosPasajeros.getNombre()
                + ": " + vueloMenosPasajeros.getOrigen() + ", con " + vueloMenosPasajeros.getNumPasajeros()
                + " pasajeros.");
    }
}
