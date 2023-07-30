package seccion23.ejemplo;

import seccion23.ejemplo.model.Calculadora;
import seccion23.ejemplo.exceptions.FormatoNumeroException;
import seccion23.ejemplo.exceptions.DivisionPorZeroException;
import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) throws FormatoNumeroException, DivisionPorZeroException {

        Calculadora cal = new Calculadora();

        String denominador = JOptionPane.showInputDialog("Ingrese un entero denomiandor: ");
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        int divisor;
        double division;



        System.out.print(System.lineSeparator());
        try {
         /* divisor = Integer.parseInt(valor);
            division = cal.dividir(40, divisor);
            System.out.println(division);*/
            double division2 = cal.dividir(numerador, denominador);
            System.out.println("division2 = " + division2);
        } catch (NumberFormatException nfe) {
            System.out.println("Ingrese un valor numerico: " + nfe.getMessage());
            main(args);
        } catch (FormatoNumeroException fme) {
            System.out.println("Se detecto una exepcion ");
            fme.printStackTrace(System.out);
        } catch (DivisionPorZeroException ae) {
            System.out.println("Capturamos la excepcion en tiempo de ejecucion: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Este mensaje se ejecuta independite si ocurre o no ocurre el error");
        }
        System.out.println("Continuamos el flujo de nuestra aplicacion");
    }
}
