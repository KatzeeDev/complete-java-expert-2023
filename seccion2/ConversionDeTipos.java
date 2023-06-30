package seccion2;

public class ConversionDeTipos {

    public static void main(String[] args) {


        System.out.println(" ---------------   Conversion String a Primitivo  --------------- ");


        System.out.println(" --------------- String => int  --------------- ");
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        System.out.println(" --------------- String => double  --------------- ");

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        System.out.println(" --------------- String => boolean  --------------- ");
        
        String logicoString = "false";
        boolean logicoBoolean = Boolean.parseBoolean(logicoString);
        System.out.println("logicoBoolean = " + logicoBoolean);




        System.out.println(" ---------------  Conversion Primitivos a String  --------------- ");


        System.out.println(" --------------- int => String  --------------- ");

        int otroNumeroInt = 240;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroString = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroString = " + otroNumeroString);

        // Otra forma de hacerlo y utilizando un operador
        otroNumeroString = String.valueOf(otroNumeroInt + 60);
        System.out.println("otroNumeroString (utilizando valueof) = " + otroNumeroString);


        System.out.println(" --------------- double => String  --------------- ");
        double otroDouble = 98765.43e-3;
        // Podria utilizar => String otroRealStr = String.valueOf(otroDouble); ||    String otroRealStr = Double.toString(otroDouble);
        String otroRealStr = Double.toString(otroDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        // Podriamos incluso hasta utilizar el mismo valor en notacion cientifica
        // f => float  i = int  c = character
        String otroRealStr2 = String.valueOf('a');
        System.out.println("otroRealStr = " + otroRealStr2);


        System.out.println(" --------------- Conversion Primitivo a Primitivos  --------------- ");
        int ejemploInt = 100000;
        // Forzar la conversion utilizando Cast
        short ejemploShort = (short) ejemploInt;
        // En este caso hay perdidas de datos. 100000 pasa a ser un => -31072
        System.out.println("ejemploShort = " + ejemploShort);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);

        // Por ejemplo si quisieramos hacer lo mismo con un long.
        int ejemploInt2 = 100000;
        long ejemploLong = ejemploInt2;
        System.out.println("ejemploLong = " + ejemploLong);

        // Utilizando char
        char ejemploChar = (char)ejemploInt;
        System.out.println("ejemploChar = " + ejemploChar);

        // Deciaml
        float ejemploFloat =  (float) ejemploInt;
        System.out.println("ejemploFloat = " + ejemploFloat);



        


    }

}
