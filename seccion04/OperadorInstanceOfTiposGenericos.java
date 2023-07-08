package seccion04;

public class OperadorInstanceOfTiposGenericos {

    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String";

        Number num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("texto(String) es instancia de String: " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto(oject) es instancia de Integer: " + b1);

        b1 = num instanceof Long;
        System.out.println("Es num instancia de Long: " + b1);

        b1 = num instanceof Double;
        System.out.println("Es num instancia de Double: " + b1);

        Number decimal = 45.54;
        b1 = decimal instanceof Double;
        System.out.println("¿Es decimal instancia de Double?: " + b1);

        b1 = decimal instanceof Float;
        System.out.println("¿Es decimal instancia de Float?: " + b1);

        b1 = decimal instanceof Number;
        System.out.println("¿Es decimal instancia de Number?: " + b1);

        boolean b2 = num instanceof Number;
        System.out.println("num(Number) es instancia de Number: " + b2);

        boolean b3 = num instanceof Object && texto instanceof Object;
        System.out.println("Son num(Number) y texto instancias de un objeto: " + b3);

        boolean b4 = decimal instanceof Number;
        System.out.println("¿Es la variable decima una instancia de number?: " + b4);

    }

}
