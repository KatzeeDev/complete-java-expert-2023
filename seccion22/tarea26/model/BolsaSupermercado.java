package seccion22.tarea26.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable <T>{

    private List<T> productos;
    private int max;

    public BolsaSupermercado(int max) {
        this.max = max;
        this.productos = new ArrayList<>();
    }

    public void addProducto(T objeto) {
        if (this.productos.size() < max) {
            this.productos.add(objeto);
        } else {
            throw new RuntimeException("No hay mas espacio en la bolsa");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.productos.iterator();
    }
}
