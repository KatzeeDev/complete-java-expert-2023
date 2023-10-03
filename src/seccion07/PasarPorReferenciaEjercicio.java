package seccion07;

public class PasarPorReferenciaEjercicio {

    public static void main(String[] args) {
        /*
        Ejercicio de Practica (No esta en el curso)

        En este caso me dispuse a hacer modificaciones en un String llamado Libros, la funcionalidad que cree es que
        a medida que se vaya recorriendo el Array de String llamado libros utilizando el for, a medida que vaya llegando
        a cierto indice utilizando una estructura de flujo de control (if) vayamos agregando libros.

        En este caso agregando libros de la saga de Mistborn entre cada indice para asi completar la saga y ademas
        eliminando uno que seria : El libro troll del Rubius => Cambiandolo por => Aleacion de Ley

        */
        System.out.println("Iniciamos el metodo main con los siguientes libros: ");

        String [] libros = {"El imperio final", "El Heroe de las eras", "El libro Troll del Rubius"};

        for (String lib: libros) {
            System.out.println(lib);
        }

        agregar(libros);

        for (String lib: libros) {
            System.out.println(lib);
        }

        System.out.println("Finaliza el metodo main con los cambios realizados");
    }


    public static void agregar(String[] librosArray) {
        System.out.println(" ------------ Iniciamos el metodo test ------------- ");

        for (int i = 0; i < librosArray.length; i++) {
            if (i == 0) {
                librosArray[i] = librosArray[i] + "\nEl pozo de la Ascension";
            } else if (i == 1) {
                librosArray[i] = librosArray[i] + "\nHistoria Secreta";
            } else if (i == 2){
                librosArray[i] = "Aleacion de Ley";
            }
        }
}}
