package seccion26.models.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {

    public double computar(double a, double b, Aritmetica lambda) {
        return lambda.operacion(a, b);
    }

    // No se soporta la sobrecarga de metodos con lambda
    public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda) {
        return lambda.apply(a, b);
    }

}
