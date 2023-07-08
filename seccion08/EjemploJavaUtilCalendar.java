package seccion08;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {

    public static void main(String[] args) {

        // Con este metodo invocamos la instancia de Calendar. Este metodo en esta clase
        Calendar calendario = Calendar.getInstance();

        //El mes va de 0 a 11
        calendario.set(1998, Calendar.AUGUST, 07, 19 , 20, 10);
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);


        // Esta es otra forma mas explicita.
        calendario.set(Calendar.YEAR,2002);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 19);

        fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);


    }

}
