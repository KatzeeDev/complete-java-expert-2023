package seccion25.ejemplos;

import seccion25.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {

    public static void main(String[] args) {

        new Thread(new ViajeTarea("Isla de pascua")).start();
        new Thread(new ViajeTarea("Canada")).start();
        new Thread(new ViajeTarea("Paris")).start();
        new Thread(new ViajeTarea("Mayorca")).start();
        new Thread(new ViajeTarea("Menorca")).start();



    }

}
