package seccion20.tarea25.model;

import seccion20.tarea25.interfaces.IProducto;

public class TvLcd extends Electronico implements IProducto {
    private int pulgada;


    public TvLcd(int pulgada) {
        this.pulgada = pulgada;
    }

    public TvLcd(String fabricante, int pulgada) {
        super(fabricante);
        this.pulgada = pulgada;
    }

    public TvLcd(String fabricante, int precio, int pulgada) {
        super(fabricante, precio);
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio() * 3;
    }
}
