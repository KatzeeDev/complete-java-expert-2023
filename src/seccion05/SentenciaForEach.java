package seccion05;

public class SentenciaForEach {

    public static void main(String[] args) {

        // Se utiliza para iterar sobre arreglos. No se necesitan contadores, ni evaluar , nada. Solo se recorre el arreglo

        int numeros [] = {1, 3, 5, 7, 9, 11, 13, 15};

        /* Se estructura de la siguiente forma.

        tipodedato nombrevariable: nombrearreglo

        */
        for (int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Matias","Barbara","Vicho","Copito", "Daniel", "Nicolas"};

        for (String nom: nombres) {
            System.out.println("nom = " + nom);
        }
    }

}
