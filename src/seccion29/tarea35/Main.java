package seccion29.tarea35;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
        // convertirla a una fecha del tipo LocalDate y calcular la edad de la persona de acuerdo a la fecha actual.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de nacimiento separado por / Ej: 10/07/2023");
        String fechaNacimiento = scanner.next();

        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate fechaNac = LocalDate.parse(fechaNacimiento, dtf);
            Period periodo = Period.between(fechaNac, LocalDate.now());
            System.out.printf("La edad es de : " +  periodo.getYears());
        } catch (DateTimeParseException e) {
            System.out.println("La fecha ingresada no es valida.");
        }
    }
}
