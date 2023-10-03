package seccion32.factory.producto;

import seccion32.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza California Pepperoni";
        masa = "Masa a la piedra gruesa";
        ingredientes.add("Pepperoni");
        ingredientes.add("Extra Queso Mozzarela");
        ingredientes.add("Aceitunas");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 50 min a 55 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando en pequeños rectangulos");
    }
}
