package seccion04;

public class OperadoresIncrementales {

    public static void main(String[] args) {


        System.out.println(" ------ Pre Incremento ------ ");
        int i = 1;
        System.out.println("i = " + i);
        int j = ++i;   // i = i+1
        System.out.println("El valor de i ahora es: ");

        System.out.println(" ------ Post Incremento ------ ");
        i = 2;
        System.out.println("Valor inicial de i = " + i);
        j = i++;
        // Nota: En este caso j valdra 2. Debido a que se asigna despues de por eso conserva el valor. En cambio i vale 3
        System.out.println("i = " + i);
        System.out.println("j = " + j);


        System.out.println(" ------ Pre Decremento ------ ");
        i = 3;
        j = --i; // i = i - 1 = 2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println(" ------ Post Decremento ------ ");
        i = 4;
        j = i--;
        System.out.println("Valor de i = " + i);
        System.out.println("Valor de j = " + j);
        System.out.println("Valor de ++j = " + (++j));
        System.out.println("Valor de j++ = " + (j++));
        System.out.println("j = " + j);



    }


}
