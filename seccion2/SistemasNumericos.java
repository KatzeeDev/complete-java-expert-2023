package seccion2;

import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog(null, "Ingrese un numero entero");

        int numeroDecimal = 0;

        // Manejo de errores. El try intenta ejecutar el codigo si sale bien continua, sino lo manejamos en el catch
        try{
            numeroDecimal = Integer.parseInt(numeroString);
        } catch (NumberFormatException e) {
            // Mostramos un mensaje de dialogo
            JOptionPane.showMessageDialog(null, "Error, Debe Ingresar un numero entero");
            // Con esto volvemos a ejecutar el main en caso de que el valor ingresado no sea valido
            main(args);

            // Con esto una vez ingresado y ejecutado el metodo main lo cerramos con un status 0 que significa que esta bien
            System.exit(0);
        };


        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        // Binario
        int numeroBinario = 0b11110;
        // Lo interpreta como binario y se muestra como decimal
        System.out.println("numeroBinario = " + numeroBinario);
        
        // Sistema octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        // Sistema Hexadecimal
        String resultadoHexadecimal = "numero Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);
        // Si quisieramos declarar el hexadecimal debemos anteponer un 0x
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n"+ resultadoOctal;
        mensaje += "\n"+ resultadoHexadecimal;

        JOptionPane.showMessageDialog(null, mensaje);


    }


}
