package seccion25.ejemploexecutor;

import seccion25.ejemplosync.Consumidor;
import seccion25.ejemplosync.Panaderia;
import seccion25.ejemplosync.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductorConsumidor {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del Pool:" + executor.getPoolSize());
        System.out.println("Cantidad de Tareas en Cola: " + executor.getQueue().size());

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);

        Future<?> futuro1 = executor.submit(productor);
        Future<?> futuro2 = executor.submit(consumidor);

        System.out.println("Tamaño del Pool:" + executor.getPoolSize());
        System.out.println("Cantidad de Tareas en Cola: " + executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo Main");

    }

}
