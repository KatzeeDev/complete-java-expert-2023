package seccion20.pokemon.model;

import seccion20.pokemon.interfaces.IPlanta;
import seccion20.pokemon.interfaces.IVeneno;

public class Bulbasaur extends Pokemon implements IPlanta, IVeneno {

    public Bulbasaur() {
    }

    public Bulbasaur(int numPokedex, String nombrePokemon, double peso, String sexo, int temporada) {
        super(numPokedex, nombrePokemon, peso, sexo, temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasaur y estoy usando Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Bulbasaur y estoy usando Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasaur y estoy usando Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasaur y estoy usando Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy Bulbasaur y estoy usando Paralizar");
    }

    @Override
    public void atacarVenenoPolvo() {
        System.out.println("Soy Bulbasaur y estoy usando Veneno Polvo");
    }
}
