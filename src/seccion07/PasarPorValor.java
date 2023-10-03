package seccion07;

public class PasarPorValor {
    public static void main(String[] args) {
        /*
        Declaramos y asignamos el valor 10 a una variable primitiva de tipo int llamada i.
        */
        int i = 10;
        System.out.println("Iniciamos el metodo main con i  = " + i);

        /*
        Llamamos al método test pasando la variable i como argumento. Recuerda que Java pasa
        los argumentos por valor, lo que significa que se hace una copia del valor de i (en este caso, 10)
        y se pasa esa copia al método test.
        */
        test(i);

        /*
        Cuando el método test ha terminado de ejecutarse, volvemos al método main.
        La variable i en main no ha cambiado, porque lo que se modificó en test
        fue la copia del valor, no la variable i en sí.
        */
        System.out.println("Finaliza el metodo main con el valor de i = " + i);
    }

    public static void test(int i) {
        /*
        Ahora estamos dentro del método test. La variable i aquí es local al método test y
        es independiente de la variable i en el método main. Inicialmente tiene el valor que
        fue pasado como argumento al llamar a este método (una copia del valor de la variable i
        en el método main).
        */
        System.out.println("Iniciamos el metodo test con i por parametro = " + i);

        /*
        Aquí cambiamos el valor de la variable i dentro del método test. Esto no afecta a
        la variable i en el método main, porque son variables diferentes que solo comparten
        el mismo nombre.
        */
        i = 35;
        System.out.println("Finaliza el metodo test con i = " + i);

        /* Esto es debido a la inmutabilidad */
    }
}
