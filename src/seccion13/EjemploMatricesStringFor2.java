package seccion13;

public class EjemploMatricesStringFor2 {

    public static void main(String[] args) {

        /*
        String [][] nombres = new String[3][2];
        nombres[0][0] = "Pepe";
        nombres[0][1] = "Pepa";
        nombres[1][0] = "Josefa";
        nombres[1][1] = "Paco";
        nombres[2][0] = "Lucas";
        nombres[2][1] = "Pancha";
        */

        // Si lo realizamos de manera simplificada seria

        String [][] nombres = {{"Pepe", "Pepa"}, {"Josefa", "Panco"}, {"Lucas", "Pancha"}};

        System.out.println(" --------- Iterando con for each --------- ");
        for(String[] fila : nombres) {
            for (String nombre: fila) {
                System.out.print(nombre + "\t");
            }
            System.out.println();

        }


    }

}
