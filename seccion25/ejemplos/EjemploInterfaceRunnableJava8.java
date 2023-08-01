package seccion25.ejemplos;
public class EjemploInterfaceRunnableJava8 {

    public static void main(String[] args) {

        Runnable viaje = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + " " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("Finalmente me voy de viaje a : " + Thread.currentThread().getName());
            }
        };

        new Thread(viaje, "Isla de pascua").start();
        new Thread(viaje, "Canada").start();
        new Thread(viaje, "Mayorca").start();
        new Thread(viaje, "Paris").start();


    }

}
