package seccion04;

public class OperadoresLogicos {

    public static void main(String[] args) {

        /*  Operadores Logicos
        Permite evaluar operaciones relacionales, se utilizan para realizar operaciones logicas y omar decisiones
        en base a condiciones o expresiones booleanas.

        - Solo se obtendran valores como verdadero o falso.

        Enj los operadores logicos And y OR (&& y ||) existe un termino llamado cortocircuito
        que significa que la evaluación de la segunda expresión puede omitirse en ciertos casos,
        */


        int i = 4;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;


        // Uso de And. En esta situacion la expresion sera falsa debido a que se deben cumplir las 2.
        boolean usoAnd = i == j && m == false;
        System.out.println("¿Es i tiene el mismo valor de j y m es falso? = " + usoAnd);


        // Uso de Or. En este caso i es mayor que j por lo tanto la expresion es true debido a que se cumple la primera.
        boolean b2 = i > j || m == true;
        System.out.println("¿Es i mayor que j? o ¿m es verdadero? = " + b2);


        // Precedencia de operadores. Siempre las expresiones se evaluan de izq a derecha.
        System.out.println(" ------------ Precedencia de Operadores en And y OR ------------ ");
        System.out.println("El valor de k es: " + k);
        System.out.println("El valor de l es: " + l);


        boolean b3 = i == j && k > l || m == false;
        System.out.println("¿i posee el mismo valor que j? y ¿k es mayor a l? o ¿m es false? = " + b3);

        // Ahora utilizamos parentesis
        boolean c1 = i == j && (k > l || m == false);
        System.out.println("c1 = " + c1);


        // Debido a la precedencia de operadores, no se evalua de izq a derecha, sino que primero se evalua el and.
        int a = 3;
        int b = 3;
        k = 4;
        l = 2;

        boolean b4 = a == b || k < l && m == true;
        System.out.println("b4 = " + b4);

        boolean b5 = (true || true) && false;
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false;
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || false;
        System.out.println("b7 = " + b7);














        


    }

}
