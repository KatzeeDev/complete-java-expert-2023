package seccion27.tarea34;

import seccion27.tarea34.models.Producto;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto(10.5, 3),
                new Producto(5.0, 4),
                new Producto(7.5, 2),
                new Producto(15.0, 1)
        );

        double total = productos.stream()
                .mapToDouble(producto -> producto.getPrecio() * producto.getCantidad())
                .sum();

        System.out.println("Gran total: " + total);
    }
}
