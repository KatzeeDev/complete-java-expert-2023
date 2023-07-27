package seccion20.pokemon.model;

public abstract class Pokemon {

    protected int numPokedex;
    protected String nombrePokemon;
    protected double peso;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();

    public Pokemon() {
    }

    public Pokemon(int numPokedex, String nombrePokemon, double peso, String sexo, int temporada) {
        this.numPokedex = numPokedex;
        this.nombrePokemon = nombrePokemon;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
    }
}
