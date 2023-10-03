package seccion32.factory.producto;

import seccion32.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza California Vegetariana";
        masa = "Masa delgada light";
        salsa = "Salsa BBQ Light";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
        ingredientes.add("Berenjena");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min a 180 grados...");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebandas rectangulares ...");
    }
}
