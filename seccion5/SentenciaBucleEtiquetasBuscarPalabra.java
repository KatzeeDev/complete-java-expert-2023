package seccion5;

import java.util.Scanner;

public class SentenciaBucleEtiquetasBuscarPalabra {

    public static void main(String[] args) {
        // Programa para buscar cuantas veces hay una palabra en una frase incluyendo si estan dentro de otra
        Scanner scanner = new Scanner(System.in);
        String frase;
        String palabra;

        System.out.print("Ingrese la frase: ");
        frase = scanner.nextLine();
        System.out.print("Ingrese la palabra: ");
        palabra = scanner.next();

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra +1;

        int cantidad = 0;

        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
            if (frase.charAt(k++) != palabra.charAt(j)) {
                continue buscar;
            }}
            cantidad++;
        }
        System.out.println("Encontrado: " + cantidad + " veces la palabra " + palabra + " en la frase");


    }
}
