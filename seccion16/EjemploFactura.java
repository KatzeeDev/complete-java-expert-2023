package seccion16;

import seccion16.model.Cliente;
import seccion16.model.Factura;
import seccion16.model.ItemFactura;
import seccion16.model.Producto;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Matias");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura: ");
        String desc = s.nextLine();

        Factura factura = new Factura(cliente, desc);

        Producto producto;
        String nombre;
        float precio;
        Integer cantidad;

        System.out.println();

        for (int i = 0; i < 3; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            // Solo podra ser de una línea
            nombre = s.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio = s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: " );
            cantidad = s.nextInt();

            ItemFactura item = new ItemFactura(producto, cantidad);
            factura.addItemFactura(item);

            System.out.println();
            s.nextLine();

        }

        System.out.println(factura.generarDetalle());


    }

}
