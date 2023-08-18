package seccion29;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {

    public static void main(String[] args) {

        // Esto es una mezcla de los 2 vistos anteriormente
        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("fechaTiempo = " + fechaTiempo);
        // También podemos crearlo asi
        fechaTiempo = LocalDateTime.of(2020, Month.DECEMBER, 24, 20, 45, 59);
        System.out.println("fechaTiempo = " + fechaTiempo);

        fechaTiempo = LocalDateTime.parse("2023-12-24T20:45:59");
        System.out.println("fechaTiempo = " + fechaTiempo);

        LocalDateTime fechaTiempo2 = fechaTiempo.plusDays(2).plusHours(2).plusYears(1);
        System.out.println("fechaTiempo = " + fechaTiempo);
        System.out.println("fechaTiempo2 = " + fechaTiempo2);
        System.out.println("fechaTiempo3 = " + fechaTiempo.minusYears(12));

        Month mes = fechaTiempo.getMonth();
        System.out.println("mes = " + mes);

        int dia = fechaTiempo.getDayOfMonth();;
        System.out.println("dia = " + dia);

        int anio = fechaTiempo.getYear();
        System.out.println("anio = " + anio);

        String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_DATE);
        System.out.println("formato1 = " + formato1);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a");
        String formato2 = fechaTiempo.format(df);
        System.out.println("formato2 = " + formato2);

        String formato3 = df.format(fechaTiempo);
        System.out.println("formato3 = " + formato3);



    }

}
