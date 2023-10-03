package seccion25.ejemploexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea");

            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea.");
        };

        executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo Main 1");
        executor.awaitTermination(2, TimeUnit.SECONDS);// Esperamos a que finalice el proceso continuamos con el print
        System.out.println("Continuando con la ejecucion del metodo Main 2");

    }

}
