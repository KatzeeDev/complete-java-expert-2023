package seccion23.ejemplo.model;

import seccion23.ejemplo.exceptions.DivisionPorZeroException;
import seccion23.ejemplo.exceptions.FormatoNumeroException;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorZeroException, FormatoNumeroException{
        if (divisor == 0) {
            throw new DivisionPorZeroException("No se puede divir por cero bobo!");
        }
        return (double) numerador / divisor;
    }

    public double dividir(String numerador, String divisor)
            throws DivisionPorZeroException, FormatoNumeroException {
        try {
        int num = Integer.parseInt(numerador);
        int div = Integer.parseInt(divisor);
        return this.dividir(num, div);
        } catch (NumberFormatException e) {
            throw new FormatoNumeroException("Debe ingresar un numero en el numerador y divisor ");
        }

    }

}
