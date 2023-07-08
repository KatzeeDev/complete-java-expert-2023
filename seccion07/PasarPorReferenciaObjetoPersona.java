package seccion07;
class Persona {
    private String nombre;
    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferenciaObjetoPersona {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Matias");

        System.out.println("Iniciamos el metodo main: ");

        System.out.println("person.nombre = " + persona.leerNombre());

        System.out.println("Iniciamos el metodo test: ");
        test(persona);

        System.out.println("Despues de llamar al Metodo Test");

        System.out.println("person.nombre = " + persona.leerNombre());
    }
    public static void test(Persona persona) {
        System.out.println("Iniciamos el Metodo Test...");

        // Modificamos el nombre
        persona.modificarNombre("Barbara");

        System.out.println("Finalizamos el metodo test...");

    }
}
