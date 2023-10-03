package seccion20.pokemon.model;

import seccion20.pokemon.interfaces.IElectrico;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    public Pikachu(int numPokedex, String nombrePokemon, double peso, String sexo, int temporada) {
        super(numPokedex, nombrePokemon, peso, sexo, temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Pikachu y estoy usando Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Pikachu y estoy usando Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Pikachu y estoy usando Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Soy Pikachu y estoy usando Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy Pikachu y estoy usando Puño trueno");
    }
}
