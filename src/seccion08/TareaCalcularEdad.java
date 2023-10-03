package seccion08;

// Importaciones
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TareaCalcularEdad {

    public static void main(String[] args){
        /*
        Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
        convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.

        Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante,
        también se pueden apoyar de google que hay varios ejemplos.

        */

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
            String fechaNacimiento = scanner.next();

            try {
                // Convertir la fecha de nacimiento de String a Date
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = formato.parse(fechaNacimiento);

                // Inicializar las instancias de Calendar para hoy y la fecha de nacimiento
                Calendar hoy = Calendar.getInstance();
                Calendar nacimiento = Calendar.getInstance();

                // Establecer la fecha de nacimiento en su correspondiente Calendar
                nacimiento.setTime(fecha);

                // Calcular la diferencia en años
                int diferencia = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

                // Si el mes de nacimiento es mayor que el mes actual, restar 1 a la diferencia
                if (hoy.get(Calendar.MONTH) < nacimiento.get(Calendar.MONTH)) {
                    diferencia--;
                }
                // Si el mes de nacimiento es igual al mes actual pero el día de nacimiento es mayor que el día actual, restar 1 a la diferencia
                else if (hoy.get(Calendar.MONTH) == nacimiento.get(Calendar.MONTH)
                        && hoy.get(Calendar.DAY_OF_MONTH) < nacimiento.get(Calendar.DAY_OF_MONTH)) {
                    diferencia--;
                }
                // Imprimir la edad
                System.out.println("Tu edad es: " + diferencia);
            } catch (ParseException e) {
                System.out.println("Formato de fecha incorrecto");
                e.printStackTrace();
            }
        }
    }
