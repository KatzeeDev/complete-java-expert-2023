package seccion19.tarea24;

import seccion19.tarea24.mamifero.Mamifero;
import seccion19.tarea24.mamifero.canino.Lobo;
import seccion19.tarea24.mamifero.canino.Perro;
import seccion19.tarea24.mamifero.felino.Guepardo;
import seccion19.tarea24.mamifero.felino.Leon;
import seccion19.tarea24.mamifero.felino.Tigre;

public class EjemploZoo {

    public static void main(String[] args) {

        //

        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon("Sabana", 120, 170, 130, "Panthera Leo", 7, 80, 15, 114);
        mamiferos[0] = leon;
        Mamifero tigre = new Tigre("Manglares", 110, 180 , 100, "Panthera Tigris", 10.3f, 65, "Tigre de Sumatra");
        mamiferos[1] = tigre;
        Mamifero guepardo = new Guepardo("Sabana", 94, 110, 64, "Acinonyx jubatus", 5.4f, 100);
        mamiferos[2] = guepardo;
        Mamifero lobo = new Lobo("Bosques", 90, 130, 30, "Canis Lupus", "Gris", 6.5f, 4, "Lobo Gris");
        mamiferos[3] = lobo;
        Mamifero perro = new Perro("Domestico", 62, 100, 25, "Canis Lupus Familiaris", "Gris", 2.5f, 4);
        mamiferos[4] = perro;


        for(Mamifero animal : mamiferos) {
            System.out.println("\n" + animal);
        }


    }

}
