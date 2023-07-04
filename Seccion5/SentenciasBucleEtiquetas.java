package Seccion5;

public class SentenciasBucleEtiquetas {
    // Break y Continue.

    public static void main(String[] args) {


        // Etiqueta
        // En este ejemplo se salta el 2
        bucle1:
        for(int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                // Se salta el 2.
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }


        System.out.print("\n-----------------------------------------------------------------------");
        // En este caso cuando llega al 2 se sale.
        etiqueta:
        for(int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                // termina cuando i => 2.
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }




        System.out.print("\n-----------------------------------------------------------------------");
        bucle:
        for(int i = 1; i <= 7; i++) {
            int j = 1;
            while (j <= 8) {
                // Se salta el 2.
                if (i == 6 || i == 7) {
                    System.out.println("Dia: " + i + ": Descanso de Fin de semana");
                    continue bucle;
                }
                System.out.println("Dia" + i + ", Trabajando a las " + j + "hrs");
                j++;
            }
        }



    }

}
