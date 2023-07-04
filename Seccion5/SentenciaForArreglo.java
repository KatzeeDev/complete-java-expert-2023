package Seccion5;

import javax.swing.*;
import java.util.Arrays;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Matias","Barbara","Vicho","Copito", "Daniel", "Nicolas"};

        int count = nombres.length;

        for(int i = 0; i < count ; i++) {
            if(nombres[i].equals("Daniel") || (nombres[i].equals("Nicolas"))) {
                continue;
            }
            System.out.println(i + ":" + nombres[i]);
        }


        // Buscar un nombre

        String buscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar: ");

        boolean encontrado = false;

        for (int i = 0; i < count; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres);

        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null,buscar + ": Fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar + ": No existe en el sistema");
        }
    }
}
