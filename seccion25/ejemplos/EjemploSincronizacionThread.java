package seccion25.ejemplos;

import seccion25.runnable.ImprimirFrases;

public class EjemploSincronizacionThread{
	public static void main(String[] args) throws InterruptedException {
		new Thread(new ImprimirFrases("Hola ", "Que tal!!")).start();
		new Thread(new ImprimirFrases("Quien eres ", "tu?")).start();
		Thread.sleep(100);
		new Thread(new ImprimirFrases("Muchas ", "Gracias")).start();
		Thread h3 = new Thread(new ImprimirFrases("Adios ", "amigo!!"));
		h3.start();
		Thread.sleep(100);
		System.out.println(h3.getState());
	}

	// Utilizacion del metodo Synchronized para evitar que se mezclen.
	public synchronized static void imprimirFrases(String frase1, String frase2) {
		System.out.print(frase1);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(frase2);
	}
}
