package seccion32.factory.producto;

import seccion32.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa con Carne";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamon");
        ingredientes.add("Choricillo");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min a 120 grados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en traingulos grandes");
    }
}
