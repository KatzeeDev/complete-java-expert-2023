package seccion29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EjemploDuration {

    public static void main(String[] args) {

        LocalDateTime fecha1 = LocalDateTime.now();
        LocalDateTime fecha2 = LocalDateTime.now().plusDays(1).plusHours(1).plusMinutes(20).plusSeconds(32);

        Duration lapsus = Duration.between(fecha1, fecha2);
        // Aca se obtienen los lapsos de tiempo requeridos
        System.out.println("lapsus = " + lapsus);
        System.out.println("Dias: " + lapsus.toDays());
        System.out.println("Horas: " + lapsus.toHours());
        System.out.println("Minutos: " + lapsus.toMinutes());
        System.out.println("Segundos: " + lapsus.getSeconds());

        System.out.println("Sumamos 5 horas: " + lapsus.plusHours(2));




    }

}
