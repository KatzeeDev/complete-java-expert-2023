package seccion20.tarea25.model;

import seccion20.tarea25.interfaces.IProducto;

public class IPhone extends Electronico implements IProducto {

    private String modelo;
    private String color;

    public IPhone() {

    }
    public IPhone(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    public IPhone(String fabricante, String modelo, String color, int precio) {
        super(fabricante, precio);
        this.modelo = modelo;
        this.color = color;
    }



    @Override
    public double getPrecioVenta() {
        return getPrecio() * 2;
    }
}
