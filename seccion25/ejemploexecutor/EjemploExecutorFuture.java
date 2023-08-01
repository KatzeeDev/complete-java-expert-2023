package seccion25.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> tarea = () -> { // Callable devuelve un valor a diferencia de Runnable
            System.out.println("Inicio de la tarea");
            try {
                System.out.println("Nombre del Thread: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea.");
            return "Algun resultado inmportante de la tarea";
        };

        Future<String> resultado = executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo Main");

        //System.out.println("¿Ha terminado?: " + resultado.isDone());
        while (!resultado.isDone()) {
            System.out.println("Ejecutando Tarea...");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("resultado.get" + resultado.get(3, TimeUnit.SECONDS)); // No siempre es bueno llamarlo ya que puede interrumpir
        System.out.println("Continuamos");
        System.out.println("¿Ha terminado?: " + resultado.isDone());

        //


    }

}
