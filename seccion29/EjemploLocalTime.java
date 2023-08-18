package seccion29;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalTime {

    public static void main(String[] args) {

        // Para el tema de horas
        LocalTime ahora = LocalTime.now();
        System.out.println(ahora);
        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Segundos: " + ahora.getSecond());
        System.out.println("NanoSegundos: " + ahora.getNano());

        System.out.println("---- Otra forma de crear ----");
        LocalTime seisConTreinta = LocalTime.of(6, 30, 59);
        System.out.println(seisConTreinta);
        seisConTreinta = LocalTime.parse("06:30");

        System.out.println("---- Para sumar horas ----");
        System.out.println(seisConTreinta);
        LocalTime sieteConTreinta = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
        System.out.println(sieteConTreinta);
        boolean esAnterior = LocalTime.of(6, 30).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior = " + esAnterior);

        // Formatear Fechas
        System.out.println("---- DateTimeFormatter ----");
        // Establecemos como sera el formato
        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss a");

        String ahoraFormateado = ahora.format(df);
        System.out.println("ahoraFormateado = " + ahoraFormateado);
        String seisConTreintaF = seisConTreinta.format(df);
        System.out.println("seisConTreintaF = " + seisConTreintaF);

        ahoraFormateado = df.format(ahora);
        System.out.println("ahoraFormateado = " + ahoraFormateado);

        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

}
