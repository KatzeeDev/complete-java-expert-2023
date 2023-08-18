package seccion29;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {

    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual = " + fechaActual);
        System.out.println("Dia: " + fechaActual.getDayOfMonth());
        System.out.println("Dia Semana: " + fechaActual.getDayOfWeek());

        System.out.println("---- Mes ----");
        System.out.println("Mes: " + fechaActual.getMonth());
        Month mes = fechaActual.getMonth();
        System.out.println(mes);
        System.out.println("Numero del mes: " + mes.getValue());
        System.out.println("Mes español: " + mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        System.out.println("---- Dia Semana ----");
        DayOfWeek diaSemana = fechaActual.getDayOfWeek();
        System.out.println("Numero del dia: " + diaSemana.getValue());
        System.out.println("Nombre del dia: " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

        System.out.println(diaSemana);
        System.out.println("Año: " + fechaActual.getYear());
        System.out.println("Dia del Año: " + fechaActual.getDayOfYear());
        System.out.println("Era: " + fechaActual.getEra());


        LocalDate cumpleanhosMatias = LocalDate.of(1998, 8, 7);
        System.out.println("cumpleanhos = " + cumpleanhosMatias);

        LocalDate cumpleanhosGato = LocalDate.of(2019, Month.SEPTEMBER, 3);
        System.out.println("cumpleanhosGato = " + cumpleanhosGato);

        cumpleanhosGato = LocalDate.parse("2020-09-03");
        System.out.println("cumpleanhosGato = " + cumpleanhosGato);
        
        LocalDate diaDeManiana = LocalDate.now().plusDays(1);
        System.out.println("diaDeManiana = " + diaDeManiana);

        LocalDate diaDeAyer = LocalDate.now().minusDays(1);
        System.out.println("diaDeAyer = " + diaDeAyer);

        LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
        System.out.println("mesAnteriorMismoDia = " + mesAnteriorMismoDia);
        // El mismo ejemplo de arriba se podria hacer de esta forma tambien
        mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnteriorMismoDia ChronoUnit = " + mesAnteriorMismoDia);

        // Obtener el dia de la semana de cierta fecha
        DayOfWeek nombreDiaSegunFecha = LocalDate.parse("2020-11-11").getDayOfWeek();
        System.out.println("nombreDiaSegunMes = " + nombreDiaSegunFecha);

        int once = LocalDate.of(2020, 11, 11).getDayOfMonth();

        // Como saber si el año es biciesto
        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);

        // Comparamos una fecha acutal con una fecha pasada
        boolean esAntes = LocalDate.of(2020,11,11).isBefore(LocalDate.parse("2020-11-10"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2023-11-11").isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("esDespues = " + esDespues);



    }

}
