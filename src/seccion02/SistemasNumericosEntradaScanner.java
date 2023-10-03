package seccion02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        // String numeroString = scanner.nextLine();
        int numeroDecimal = 0;

        // Manejo de errores. El try intenta ejecutar el codigo si sale bien continua, sino lo manejamos en el catch
        try{
            numeroDecimal = scanner.nextInt();
            // Ahora hay que manejarlo como InputMismatchException
        } catch (InputMismatchException e) {
            System.out.println("Error debe ingresar un numero entero");
            // Con esto volvemos a ejecutar el main en caso de que el valor ingresado no sea valido
            main(args);
            // Con esto una vez ingresado y ejecutado el metodo main lo cerramos con un status 0 que significa que esta bien
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        
        // Sistema octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        // Sistema Hexadecimal
        String resultadoHexadecimal = "numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n"+ resultadoOctal;
        mensaje += "\n"+ resultadoHexadecimal;

        System.out.println(mensaje);

    }


}
