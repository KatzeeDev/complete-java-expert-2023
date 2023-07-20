package seccion15.app.hogar;
import seccion15.app.jardin.Perro;

import static seccion15.app.hogar.Persona.saludar;

public class EjemploHogar {

    public static void main(String[] args) {

        Persona p = new Persona();
        Perro perro = new Perro();
        //perro.jugar  (solo se puede utilizar en su contexto)
        // Aca no se importa debido a que se encuentran en el mismo contexto.

        String saludo = saludar();



    }

}
