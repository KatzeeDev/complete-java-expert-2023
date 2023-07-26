package seccion20.tarea25.model;

import seccion20.tarea25.interfaces.IProducto;

public abstract class Producto implements IProducto {
    private int precio;

    public Producto() {
    }

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }



}
