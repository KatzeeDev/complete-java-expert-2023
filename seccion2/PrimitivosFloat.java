package seccion2;

public class PrimitivosFloat {

    public static void main(String[] args) {


        System.out.println(" ----------- float (Float) -----------  ");
        // Representar un numero real decimal para trabajar con ellos.

        float realFloat = 15;
        float reatlFloat2 = 15.4f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("reatlFloat2 (UtiLizando la F para poner puntos) = " + reatlFloat2);

        // Si quisieramos poder guiar la coma seria:
        float realFloat3 = 1.50e3f; // 1500.0
        System.out.println("realFloat3 = " + realFloat3);

        float realFloat4 = 0.00000000015f; // 1.5e-10f
        System.out.println("realFloat4 = " + realFloat4);

        // Utilizar la F en float
        float valorFloatMin = 1.4E-45F;
        float valorFloatMax = 3.4028235E38F;

        // Si queremos representarlo a que tipo de bytes corresponde
        System.out.println(" Tipo float corresponde en byte a: " + Float.BYTES);
        System.out.println(" Tipo float corresponde en bites a: " + Float.SIZE);

        // Valores Maximos y Minimos Rango Posible 1.4E-45 => 3.4028235E38
        System.out.println("El valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("El valor minimo de un float: " + Float.MIN_VALUE);
        
        var varFlotante = 3.1416f;
        System.out.println("Type.varFloatane. = " + varFlotante);


    }

}
