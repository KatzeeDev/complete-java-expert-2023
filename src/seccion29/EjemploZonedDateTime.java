package seccion29;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.SortedMap;

public class EjemploZonedDateTime {

    public static void main(String[] args) {

        // Partimos de una fecha Local
        LocalDateTime fechaLocal = LocalDateTime.now();

        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zonaNewYork = ZonedDateTime.of(fechaLocal, newYork);
        System.out.println("Zona horaria de New York: " + zonaNewYork);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNewYork.withZoneSameInstant(madrid);
        System.out.println("Zona horaria de Madrid: " + zonaMadrid);

        System.out.println("---- Ejemplo ----");
        // Ej Si quiero viajar de New York a España. Tendremos una fecha de partida y una fecha de llegada
        System.out.println("Horario de partida: " + zonaNewYork);
        System.out.println("Hora de llegada en Madrid: " + zonaMadrid.plusHours(8));


    }

}
