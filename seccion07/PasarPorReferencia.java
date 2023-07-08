package seccion07;

public class PasarPorReferencia {
    public static void main(String[] args) {
        /*
        Inicializamos un arreglo de enteros con los valores 10, 11, 12.
        */
        int [] edad = {10,11,12};

        System.out.println("Iniciamos el metodo main");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("Antes de llamar al metodo test");

        /*
        Llamamos al método test pasando el arreglo edad como argumento. En este caso, se pasa
        una copia de la referencia al arreglo. Esto significa que el método test tiene acceso
        al mismo arreglo en la memoria.
        */
        test(edad);

        System.out.println("Despues de llamar al metodo test");

        /*
        Dado que el método test modificó el mismo arreglo edad, los cambios son visibles
        después de la llamada al método test.
        */
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }

        System.out.println("Finaliza el metodo main con los datos del arreglo modificados!:");
    }

    public static void test(int[] edadArr) {
        System.out.println("Iniciamos el metodo test");

        /*
        Dentro del método test, modificamos el arreglo edadArr. Dado que edadArr es una
        referencia al mismo arreglo edad en el método main, estas modificaciones son visibles
        después de la llamada al método test.
        */
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] = edadArr[i] + 20;
        }

        System.out.println("Finalizamos el metodo test");
    }
}
