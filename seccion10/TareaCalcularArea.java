package seccion10;

import java.util.Scanner;

public class TareaCalcularArea {

    public static void main(String[] args) {
        // Pedir el radio de un círculo y calcular su área.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio de un circulo para calcular su area: ");
        int radio = scanner.nextInt();

        // Para calcular el area
        double area = Math.PI * (Math.pow(radio, 2));
        System.out.println("El area de un circulo de radio: " + radio + " es de: "  + Math.round(area));

    }

}
