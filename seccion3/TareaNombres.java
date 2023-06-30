package seccion3;


import java.util.Scanner;

public class TareaNombres {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[3];

        for (int i = 0; i < nombres.length ; i++) {
            System.out.println("Nombre " + (i + 1) +  ": ");
            nombres[i] = scanner.nextLine();
        }


        System.out.println("Nombres Ingresados sin Formatear: ");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }


        System.out.println("Nombres Ingresados Formateados: ");

        for (String nombre : nombres) {
            String nombreFormateado = formatearNombres(nombre);
            System.out.println(nombreFormateado);
        }



    }

    private static String formatearNombres(String nombre) {


        String nombresFormateados = "toLowerCase: " + nombre.toLowerCase()
                + "\n" + "toUpperCase: " + nombre.toUpperCase()
                + "\n" + "subString: " + nombre.substring(0,3);
        return nombresFormateados;

    }

}
