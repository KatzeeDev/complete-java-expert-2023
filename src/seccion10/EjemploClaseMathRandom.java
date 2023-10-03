package seccion10;

import java.util.Random;

public class EjemploClaseMathRandom {

    public static void main(String[] args) {

        // Este metodo es para generar un numero aleatorio decimal. Entre 0 y 1 (nunca llegara al 1)


        double random = Math.random();
        System.out.println("random = " + random);


        System.out.println("random multiplicado por 7 = " + random);

        random = Math.floor(random);
        System.out.println("random piso = " + random);

        // Si por ej quisieramos obtener algo de un arreglo 6 elementos indice 5
        String [] colores = {"Azul", "Rojo", "Verde", "Violeta", "Naranja", "Blanco"};
        double random2 = Math.random();
        random2 *= colores.length;
        System.out.println("colores = " + colores[(int) random2]);

        System.out.println(" ------------------ Utilizando la clase Random de Java Util ------------------ ");

        // Es mucho mas amplio que el de la clase Math, ya que permite usar int, long etc
        Random randomObj = new Random();

        int randomInt = randomObj.nextInt();
        System.out.println("randomInt = " + randomInt);

        long randomLong = randomObj.nextLong();
        System.out.println("randomLong = " + randomLong);

        float randomFloat = randomObj.nextFloat();
        System.out.println("randomFloat = " + randomFloat);

        double randomDouble = randomObj.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        // Tambien podemos pasar un valor en especifico
        // Aca genera un valor entre el valor 0 y 7 sin incluir el 7
        int randomInt2 = randomObj.nextInt(7);
        System.out.println("randomInt2 = " + randomInt2);

        // Si queremos que vaya de cierto numero a otro
        int rango = 10 + randomObj.nextInt(20 - 10);
        System.out.println("rango = " + rango);

        // Si lo utilizamos para los colore de antes seria algo como:

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("Indice color en el arreglo:  " + randomInt);
        System.out.println("colores[randomInt] = " + colores[randomInt]);



    }


}
