package seccion32.factory.producto;

import seccion32.factory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {

    public PizzaNewYorkPepperoni() {
        super();
        nombre = "Pizza Pepperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso Mozzarela");
        ingredientes.add("Extra Pepperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min a 90 grados..");
    }

    @Override
    public void cortar() {
        System.out.println("Cortanzo la pizza en triangulos");
    }
}
