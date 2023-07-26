package seccion20.tarea25.main;

import seccion20.tarea25.interfaces.IElectronico;
import seccion20.tarea25.interfaces.ILibro;
import seccion20.tarea25.interfaces.IProducto;
import seccion20.tarea25.model.Comics;
import seccion20.tarea25.model.IPhone;
import seccion20.tarea25.model.Libro;
import seccion20.tarea25.model.TvLcd;

import java.util.Date;


public class ProyectoCatalogo {
    public static void main(String[] args) {
        // Creamos un array de productos
        IProducto[] productos = new IProducto[6];

        // Creamos instancias de cada tipo de producto
        productos[0] = new IPhone("Apple", "iPhone 12", "Black", 1000);
        productos[1] = new TvLcd("Samsung", 32, 500);
        productos[2] = new Libro(200, new Date(), "George R. R. Martin", "Game of Thrones", "Bantam");
        productos[3] = new Comics(20, new Date(), "Stan Lee", "Spiderman", "Marvel", "Spiderman");
        productos[4] = new Libro(150, new Date(), "J. K. Rowling", "Harry Potter", "Bloomsbury");
        productos[5] = new IPhone("Apple", "iPhone 13", "White", 1100);

        // Mostramos los datos de cada producto
        for(IProducto producto : productos) {
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Precio de venta: " + producto.getPrecioVenta());

            // Usamos instanceof para ver si el producto es de cierto tipo y mostrar más información
            if(producto instanceof ILibro) {
                ILibro libro = (ILibro) producto;
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Editorial: " + libro.getEditorial());
            }

            if(producto instanceof IElectronico) {
                IElectronico electronico = (IElectronico) producto;
                System.out.println("Fabricante: " + electronico.getFabricante());
            }

            // Imprimir una línea vacía para separar los productos
            System.out.println();
        }
    }
}
