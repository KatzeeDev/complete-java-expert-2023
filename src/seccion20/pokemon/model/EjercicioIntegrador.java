package seccion20.pokemon.model;

public class EjercicioIntegrador {
    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();


        // Usamos metodos en la clase abstracta para indicar que cada Pokemon tiene esos ataques
        System.out.println(" -------- Uso de Ataques comunes de cada Pokemon -------- ");
        squirtle.atacarAraniazo();
        bulbasaur.atacarAraniazo();
        charmander.atacarAraniazo();
        pikachu.atacarAraniazo();
        // En este caso usamos el implements para que cada tipo de Pokemon posea el mismo ataque.
        System.out.println(" -------- Uso de Ataques especificos de cada tipo de Pokemon -------- ");
        squirtle.atacarPistolaAgua();
        bulbasaur.atacarDrenaje();
        charmander.atacarLanzallamas();
        pikachu.atacarImpactrueno();

        System.out.println(" -------- Agregamos otro Pokemon -------- ");
        // Agregamos un pokemon de tipo agua para mostrar nuevamente el uso de Implements
        Psyduck psyduck = new Psyduck();
        // Observamos que al utilizar extends Pokemon puede usar los ataques comunes
        psyduck.atacarPlacaje();
        // Y al utilizar implements IAgua puede utilizar los ataques de tipo Agua
        psyduck.atacarHidrobomba();

        System.out.println(" -------- Uso de 2 Interfaces -------- ");
        System.out.println("Informacion: Bulbasaur al poseer 2 tipos (Planta y Veneno) puede usar ambos tipos de ataques");
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarVenenoPolvo();



    }
}
