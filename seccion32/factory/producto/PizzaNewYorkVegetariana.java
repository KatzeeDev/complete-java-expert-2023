package seccion32.factory.producto;

import seccion32.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {
    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza Vegetariana New York";
        masa = "Masa Integral Vegana";
        salsa = "Salsa de Tomate";
        ingredientes.add("Queso Vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min a 150 grados...");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la piza en rebanadas cuadradas.");
    }
}
