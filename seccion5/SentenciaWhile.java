package seccion5;

public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;


        // Primero Evalua, luego ejecuta.  Es mejor usar el for debido a que es mas rapido
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        while (prueba) {
            if (i == 7) {
                // Cuando while llegue en este caso a 7. El valor de prueba sera false y no se ejecutara el while
                prueba = false;
            }
            System.out.println(i);
            i++;
        }

        System.out.println(prueba);

        prueba = false;
        while (prueba) {
            System.out.println("nunca se ejecutara");
        }

        System.out.println(" -------------------- Do While --------------------");
        // Hacer algo mientras sea verdadero.
        // Primero ejecuta, luego evalua
        prueba = false;
        do {
            System.out.println("Se ejecuta al menos una vez");
        } while (prueba);


        // Otro ejemplo
        prueba = true;
        i = 0;
        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
        i++;
        } while (prueba);




    }
}
