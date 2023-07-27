package seccion20.pokemon.model;

import seccion20.pokemon.interfaces.IAgua;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    public Squirtle(int numPokedex, String nombrePokemon, double peso, String sexo, int temporada) {
        super(numPokedex, nombrePokemon, peso, sexo, temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle y estoy usando Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Squirtle y estoy usando Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Squirtle y estoy usando Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Squirtle y estoy usando HidroBomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle y estoy usando Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy usando Pistola de Agua");
    }
}
