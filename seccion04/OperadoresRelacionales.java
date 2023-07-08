package seccion04;

public class OperadoresRelacionales {


    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;



        boolean b1 = i == j;
        System.out.println("b1 = " + b1);
        System.out.println("El valor de i(3) ¿Es igual a j(7)? : " + b1);

        // ! Se usa para la "contraparte del booleano" similar al unario
        boolean b2 = !b1;
        System.out.println("El valor del invertido de b1 (false) es: " + b2);

        // != Se usa para ver si es distinto de
        boolean b3 = i != j;
        System.out.println("¿i(3)  es distinto de j (7)?: " + b3);

        // Puedo comparar si un valor booleano es igual a un valor booleano
        boolean m = false;
        boolean b4 = m == true;
        System.out.println("El valor de m(false)¿Es igual a true?: " + b4);

        boolean b5 = m != true;
        System.out.println("¿Es m distinto de true?: " + b5);


        boolean b6 = i > k;
        System.out.println("¿i es mayor que k?: " + b6);

        boolean b7 = i < k;
        System.out.println("¿i es menor que k?: " + b7);

        boolean b8 = l >= k;
        System.out.println("¿l es mayor o igual a k? " + b8);

        double n = 3.40;
        double o = 3.40;

        boolean b9 = n <= o;
        System.out.println("¿n es menor o igual que o? : " + b9);



    }


}
