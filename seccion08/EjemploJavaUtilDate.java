package seccion08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {

        Date fecha = new Date();

        // Thu Jul 06 Time CLT 2023
        System.out.println("fecha = " + fecha);

        // Podemos modificar el formato del cómo se muestra
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaStr = df.format(fecha);
        // 06 julio, 2023
        System.out.println("fechaStr = " + fechaStr);

        // 06/07/2023
        df = new SimpleDateFormat("dd/MM/yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        // 06 jul, 2023
        df = new SimpleDateFormat("dd MMM, yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        // Para ver mas formatos => google.cl => SimpleDateFormat Version Java.

        // Fecha: 06.07.2023 d.C. son las: 19:03:51 CLT
        df = new SimpleDateFormat("'Fecha: 'dd.MM.yyyy G 'son las: 'HH:mm:ss z");
        fechaStr = df.format(fecha);
        System.out.println(fechaStr);


        // Ejemplo Milisegundos.
        long j = 0;
        for (int i = 0; i< 10_000_000; i++){
            j += i;
        }

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();


        System.out.println("Tiempo Transcurrido en el for: " + tiempoFinal);
        System.out.println("j = " + j);

    }

}
