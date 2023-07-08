package seccion10;

public class EjemploClaseMath {

    public static void main(String[] args) {

        // Metodo para calcular el valor absoluto
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        // El maximo entre 2 numeros, pueden ser decimales, enteros etc
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);
        // El minimo
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        // Redondedear decimal al techo
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // Redondear hacia abajo
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        // Redondear
        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        long entero2 = Math.round(3.4);
        System.out.println("entero2 = " + entero2);

        long ejemploPi = Math.round(Math.PI);
        System.out.println("ejemploPi = " + ejemploPi);

        // Funcion Exponencial
        double exp = Math.exp(1);
        // Al elevarlo a 1 obtenemos el valor de la constante
        System.out.println("exp = " + exp);
        exp = Math.exp(2);
        System.out.println("exp elevado a 2 = " + exp);

        // Logaritmos
        double log = Math.log(10);
        System.out.println("log = " + log);

        // Potencia  En el ejemplo seria 10 elevado a 3
        double pontencia = Math.pow(10, 3);
        System.out.println("pontencia = " + pontencia);

        // Raiz Cuadrada => Raiz Cuadrada de 5
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        // Convertir un angulo en radianes a grados
        double grados = Math.toDegrees(1.57);
        // Redondeamos los grados
        grados = Math.round(grados);
        System.out.println("Convertir radianes a grados = " + grados);

        // Convertir de grados a radianes
        double radianes = Math.toRadians(90d);
        System.out.println("Convertir de grados a radianes = " + radianes);


        // Funciones de Trigonometria

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));
        System.out.println("tan(90): " + Math.tan(radianes));






    }


}
