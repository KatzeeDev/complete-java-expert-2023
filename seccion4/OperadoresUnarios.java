package seccion4;

public class OperadoresUnarios {

    public static void main(String[] args) {

        /*  Operadores Unarios = - y +
         Los operadores unarios son operadores que actúan sobre un solo operando,
         es decir, una sola variable o valor. Estos operadores permiten realizar acciones como cambiar el signo de un número,
         incrementar o decrementar su valor en una unidad, o invertir su valor lógico.

        */

        int i = -5;
        int j = +i;  // El operador unario + no realiza ningún cambio en el valor de i, se utiliza aquí por claridad
                    // j = (+1)*i => -5

        System.out.println("j = " + j);

        int k = -i; // El operador unario - cambia el signo del valor de i
                   // k = (-1)*i => 5
        System.out.println("k = " + k);


        i = 6;
        j = +i;
        System.out.println("j = " + j);

        k = -i;
        System.out.println("k = " + k);






    }
}
