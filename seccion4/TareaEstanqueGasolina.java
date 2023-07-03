package seccion4;

import java.util.Scanner;

public class TareaEstanqueGasolina {


    public static void main(String[] args) {

        // Tarea  Estanque de Gasolina

        Scanner s = new Scanner(System.in);

        double capacidadActual;

        System.out.println("Ingrese la medida actual en litros de su estanque de gasolina: ");
        capacidadActual = s.nextDouble();


        if (capacidadActual >= 70) {
            System.out.println("Estanque Lleno");
        } else if (capacidadActual < 70 && capacidadActual >= 60) {
            System.out.println("Estanque casi lleno");
        }else if (capacidadActual < 60 && capacidadActual >= 40) {
            System.out.println("Estanque 3/4");
        }else if (capacidadActual < 40 && capacidadActual >= 35) {
            System.out.println("Medio Estanque");
        }else if (capacidadActual < 35 && capacidadActual >= 20) {
            System.out.println("Suficiente");
        } else if (capacidadActual < 20 && capacidadActual > 1){
            System.out.println("Insuficiente.");
        } else {
            System.out.println("Ingrese valores validos");
        }











    }


}
