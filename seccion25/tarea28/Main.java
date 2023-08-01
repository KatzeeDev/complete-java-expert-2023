package seccion25.tarea28;

import seccion25.ejemplosync.Consumidor;
import seccion25.ejemplosync.Panaderia;
import seccion25.ejemplosync.Panadero;
import seccion25.tarea28.model.Alfanumerico;
import seccion25.tarea28.model.Tipo;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {


    public static void main(String[] args) {


        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);

        System.out.println("Tamaño del Pool:" + executor.getPoolSize());
        System.out.println("Cantidad de Tareas en Cola: " + executor.getQueue().size());

        Runnable letra = new Alfanumerico(Tipo.LETRA);
        Runnable numero = new Alfanumerico(Tipo.NUMERO);

        Future<?> futuro1 = executor.submit(letra);
        Future<?> futuro2 = executor.submit(numero);

        System.out.println("Tamaño del Pool:" + executor.getPoolSize());
        System.out.println("Cantidad de Tareas en Cola: " + executor.getQueue().size());

        executor.shutdown();
        System.out.println("Continuando con la ejecucion del metodo Main");



    }

}
