package seccion14.proyectoordencompra;

public class EjemploOrdenes {

    public static void main(String[] args) {

        /*
        Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro productos a cada una, cada orden con distintos productos, que no se repitan.

        Para cada una imprimir sus valores en consola usando método getter incluyendo los productos,
        donde con el método getter obtenemos el arreglo de productos y con un foreach recorremos e
        imprimimos sus atributos fabricante, nombre y precio.

        Tener en cuenta en la salida el gran total de cada orden, los clientes.
       */

        // Primer Cliente
        Cliente Barbara = new Cliente("Barbara", "Solis");
        Producto[] productosBarbara = new Producto[3];
        productosBarbara[0] = new Producto("Telepizza", "Pizza Jamon Queso", 10000);
        productosBarbara[1] = new Producto("Telepizza2", "Pizza Peperoni", 2000);
        productosBarbara[2] = new Producto("Telepizza3", "Pizza tu puta madre", 3000);

        OrdenCompra orden1 = new OrdenCompra("Descripción Orden 1");
        orden1.setCliente(Barbara);

        for (Producto producto : productosBarbara) {
            orden1.addProducto(producto);
        }

        // Segun Cliente
        Cliente Matias = new Cliente("Matias", "Osorio");
        Producto[] productosMatias = new Producto[3];
        productosMatias[0] = new Producto("Sushi", "Makigari", 1500);
        productosMatias[1] = new Producto("Sushi", "Makigari", 3500);
        productosMatias[2] = new Producto("Sushi", "Makigari", 4500);

        OrdenCompra orden2 = new OrdenCompra("Descripcion Orden 2: Sushi A Domicilio");
        orden2.setCliente(Matias);

        for (Producto producto: productosMatias){
            orden2.addProducto(producto);
        }


        Cliente Copito = new Cliente("Copito", "y Vicho");
        Producto[] productosCopito = new Producto[3];

        productosCopito[0] = new Producto("Purina", "Sobres de Comida", 3000);
        productosCopito[1] = new Producto("Purina2", "Sobres de Comida2", 4000);
        productosCopito[2] = new Producto("Purina3", "Sobres de Comida3", 5000);

        OrdenCompra orden3 = new OrdenCompra("Descripcion Orden 3: Importante!!");
        orden3.setCliente(Copito);

        for (Producto producto: productosCopito) {
            orden3.addProducto(producto);
        }


        // Imprimimos los detalles
        orden1.imprimirDetallesDeLaOrden();
        System.out.println(System.lineSeparator());
        orden2.imprimirDetallesDeLaOrden();
        System.out.println(System.lineSeparator());
        orden3.imprimirDetallesDeLaOrden();







    }

}
