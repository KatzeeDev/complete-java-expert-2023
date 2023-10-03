package seccion15.app.jardin;

import seccion15.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;


    // Metodo
    String jugar(Persona persona) {
       return persona.lanzarPelota();
    }



}
