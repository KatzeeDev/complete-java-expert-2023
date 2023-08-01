package seccion25.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        System.out.println("Tamaño del Pool:" + executor.getPoolSize());
        System.out.println("Cantidad de Tareas en Cola: " + executor.getQueue().size());

        Callable<String> tarea = () -> { // Callable devuelve un valor a diferencia de Runnable
            System.out.println(" ----- Inicio de la tarea ----- ");
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

        Callable<Integer> tarea2 = () -> {
            System.out.println(" ------ Iniciando tarea 2 ... ------ ");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };


        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2); // Enviamos otra ejecucion

        System.out.println("Tamaño del Pool:" + executor.getPoolSize());
        System.out.println("Cantidad de Tareas en Cola: " + executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo Main");

        //System.out.println("¿Ha terminado?: " + resultado.isDone());
        while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())) {
            System.out.println(String.format("resultado 1: %s - resultado2 : %s - resultado3 : %s",
                    resultado.isDone()? "finalizo": "en proceso",  resultado2.isDone()? "finalizo": "en proceso",
                    resultado3.isDone()? "finalizo" : "en proceso"));
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println("Obtenemos el resultado 1 de la tarea " + resultado.get());
        System.out.println("Finaliza la tarea 1 : " + resultado.isDone());

        System.out.println("Obtenemos el resultado 2 de la tarea " + resultado2.get());
        System.out.println("Finaliza la tarea 2 : " + resultado.isDone());

        System.out.println("Obtenemos el resultado 3 de la tarea " + resultado3.get());
        System.out.println("Finaliza la tarea 3: " + resultado2.isDone());


        //


    }

}
