package seccion32.factory.producto;

import seccion32.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();

        nombre = "Pizza California Queso";
        masa = "Masa a la piedra delgada";
        salsa = "Salsa de tomate rucula";
        ingredientes.add("Extra Queso Mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Espinacas");
        ingredientes.add("Queso Azul");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 35 minutos a 100 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la piza en pequeños triangulos");

    }
}
