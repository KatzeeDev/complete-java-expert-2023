// Se importan todas las clases dentro del paquete "seccion15.matias.app.hogar"
// El asterisco (*) indica que se importarán todas las clases en ese paquete
package seccion15.matias.app.jardin;
import seccion15.matias.app.hogar.*;
// Demostracion de los import Static. En este caso con el asterisco importamos todos los atributos, miembros metodos etc
import static seccion15.matias.app.hogar.ColorPelo.*;
import static seccion15.matias.app.hogar.Persona.*;


public class EjemploPaquetes {

    public static void main(String[] args) {
        /*
        1. Se crea un nuevo objeto "p" de la clase "Persona"
        2. Se imprime el valor del atributo "nombre" de "p"
        3. Se crea un nuevo objeto "g" de la clase "Gato"
        */

        Persona p = new Persona();
        p.setNombre("Matias");
        p.setApellido("Osorio");
        p.setColorPelo(NEGRO);

        System.out.println(p.getNombre());

        // Aca se hace utilizacion de las clases las cuales se encuentran en distintos niveles de carpetas
        //Gato gato = new Gato();
        Perro perro = new Perro();

        // Se utiliza este ejemplo para demostrar el alcance de los modificadores de acceso
        perro.nombre = "Tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

        // Llamamos al metodo saludar como si se encontrara en la clase, pero hicimos la importancion
        // Se puede usar en metodos , constantes, atributos
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        // Utilizamos las constantes establecido en la clase Persona
        String generoMasculino = GENERO_MASCULINO;
        String generoFemenino = GENERO_FEMENINO;


    }
}
