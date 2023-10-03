package seccion04;

public class OperadorInstanceOf {

    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String";
        Integer num = 7;
        Double decimal = 3.5;



        boolean b1 = texto instanceof String;
        System.out.println("texto(String) es instancia de String: " + b1);

        boolean b2 = num instanceof Number;
        System.out.println("num(Integer) es instancia de Number: " + b2);

        boolean b3 = num instanceof Object && texto instanceof Object;
        System.out.println("Son num(Integer) y texto instancias de un objeto: " + b3);

        boolean b4 = decimal instanceof Number;
        System.out.println("¿Es la variable decima una instancia de number?: " + b4);

    }

}
