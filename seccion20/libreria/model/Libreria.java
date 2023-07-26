package seccion20.libreria.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Libreria {
    private ArrayList<Producto> productos;

    public Libreria(Producto[] productos) {
        this.productos = new ArrayList<>(Arrays.asList(productos));
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            if (producto instanceof Displayable) {
                ((Displayable) producto).display();
            }
        }
    }

    public void venderProducto(Vendible producto) {
        producto.vender();
    }
}
