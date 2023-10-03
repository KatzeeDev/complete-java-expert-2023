package seccion25.ejemploexecutor;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduledExecutorService {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        System.out.println("Alguna tarea en el Main ... ");

        executor.schedule(() -> {
            System.out.println("Hola Mundo tarea ... ");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, 0, TimeUnit.MILLISECONDS);

        System.out.println("Alguna otra tarea en el main..");
        executor.shutdown();

    }


}
