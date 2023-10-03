package seccion29;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZonedDateTimePart2 {

    public static void main(String[] args) {

        // Establecemos una fecha.
        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/23 12:45"
                , DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        //ZoneId newYork = ZoneId.of("America/New_York");
        //ZonedDateTime zonaNewYork = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00")); // En este caso indicamos el delay
        ZonedDateTime zonaNewYork = fechaLocal.atZone(ZoneOffset.of("-04:00"));
        System.out.println("Horario de partida de New York: " + zonaNewYork);

        //ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaNewYork.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        System.out.println("Hora de llegada en Madrid: " + zonaMadrid);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm a, dd MMM yyyy");
        System.out.println("Detalles de viaje a españa: ");
        System.out.println("Partida de NY: " + f.format(zonaNewYork));
        System.out.println("Llegada a Madrid: " + f.format(zonaMadrid));

        // Ver todas las zonas disponibles.
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

    }

}
