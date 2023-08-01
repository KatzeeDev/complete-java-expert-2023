package seccion25.ejemploexecutor;


import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduledExecutorServicePeriodo {

    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        System.out.println("Alguna tarea en el Main ... ");

        AtomicInteger contador = new AtomicInteger(5);
        // Creamos una instancia de una cuenta regresiva.
        //CountDownLatch lock = new CountDownLatch(5);



        Future<?> future = executor.scheduleAtFixedRate(() -> {
            System.out.println("Hola Mundo tarea ... ");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                //lock.countDown();
                contador.getAndDecrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, 1000, 2000, TimeUnit.MILLISECONDS);

        //lock.await();
        //future.cancel(true);
        //TimeUnit.SECONDS.sleep(10);


        while (contador.get() >= 0) {
            if (contador.get() == 0) {
                future.cancel(true);
                //contador.getAndDecrement();
                break;
            }
        }
        System.out.println("Alguna otra tarea en el main..");
        executor.shutdown();

    }


}
