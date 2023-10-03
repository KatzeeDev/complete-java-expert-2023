package seccion25.ejemplos;

import seccion25.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {

    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("Copito");

        System.out.println(hilo.getState());
        hilo.start();
        //Thread.sleep(2);
        Thread hilo2 = new NombreThread("Matias");
        hilo2.start();

        NombreThread hilo3 = new NombreThread("Vicho");
        hilo3.start();
        System.out.println(hilo.getState());


    }

}
