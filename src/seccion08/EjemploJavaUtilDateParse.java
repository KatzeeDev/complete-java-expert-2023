package seccion08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {

        // Recordar que Parse hace referencia a convertir

        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        // Ingresamos las fechas

        System.out.println("Ingrese la fecha con el siguiente formato 'dd-MM-yyyy' :");
        try {
            Date fechaIngresada = format.parse(scanner.next());
            System.out.println("Fecha Ingresada: " + fechaIngresada);
            System.out.println("Fecha Ingresada (Formateada) = " + format.format(fechaIngresada));

            Date fechaActual = new Date();
            System.out.println("Fecha Actual: " + fechaActual);
            System.out.println("Fecha Actual (Formateada): " + format.format(fechaActual));

            if (fechaIngresada.after(fechaActual)) {
                System.out.println("\nFecha ingresada por el usuario es despues que la fecha actual: ");
            } else if (fechaIngresada.before(fechaActual)){
                System.out.println("\nFecha ingresada por el usuario es anterior a la fecha actual");
            } else if (fechaIngresada.equals(fechaActual)) {
                System.out.println("\nFecha Ingresada es igual a la Fecha Actual");
            }
            /*
            Otra forma de Hacerlo seria:

             if (fechaIngresada.compareTo(fechaActual) > 0 ) {
                System.out.println("\nFecha ingresada por el usuario es despues que la fecha actual: ");
            } else if (fechaIngresada.compareTo(fechaActual) < 0) {
                System.out.println("\nFecha ingresada por el usuario es anterior a la fecha actual");
            } else if (fechaIngresada.compareTo(fechaActual) == 0) {
                System.out.println("\nFecha Ingresada es igual a la Fecha Actual");
            }
             */

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

}
