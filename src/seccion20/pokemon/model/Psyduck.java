package seccion20.pokemon.model;

import seccion20.pokemon.interfaces.IAgua;

public class Psyduck extends Pokemon implements IAgua {

    public Psyduck() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Psyduck y estoy usando Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Psyduck y estoy usando Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Psyduck y estoy usando Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Soy Psyduck y estoy usando HidroBomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Psyduck y estoy usando Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Psyduck y estoy usando Pistola de agua");
    }


}
