package seccion6;

public class AutoboxingInteger {

    public static void main(String[] args) {

        // De partida ya tenemos autoboxing. Estamos convirtiendo primitivos em la literal en tipos de referencia
        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        // Sumaremos los valores pares
        int suma = 0;
        int suma2 =0;

        for (Integer i: enteros) {
            if (i.intValue() % 2 == 0) {
                suma += i.intValue();
            }
        }
        System.out.println(suma);


        // En esta situacion observamos que Java realiza exactamente lo mismo gracias al autoboxing.
        for (Integer i: enteros) {
            if (i % 2 == 0) {
                suma2 += i;
            }
        }
        System.out.println(suma2);


    }

}
