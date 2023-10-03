package seccion20.pokemon.model;

import seccion20.pokemon.interfaces.IFuego;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    public Charmander(int numPokedex, String nombrePokemon, double peso, String sexo, int temporada) {
        super(numPokedex, nombrePokemon, peso, sexo, temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Charmander y estoy usando Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Charmander y estoy usando Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Charmander y estoy usando Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy Charmander y estoy usando Puño Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy Charmander y estoy usando Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy Charmander y estoy usando Ascuas");
    }
}
