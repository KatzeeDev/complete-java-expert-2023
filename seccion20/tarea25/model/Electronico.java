package seccion20.tarea25.model;

import seccion20.tarea25.interfaces.IElectronico;

public abstract class Electronico extends Producto implements IElectronico {

    private String fabricante;

    public Electronico() {
    }

    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }
    public Electronico(String fabricante, int precio) {
        super(precio);
        this.fabricante = fabricante;
    }



    @Override
    public String getFabricante() {
        return fabricante;
    }
}
