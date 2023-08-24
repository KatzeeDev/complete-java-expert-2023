package seccion32.factory;

import seccion32.factory.producto.PizzaCaliforniaPepperoni;
import seccion32.factory.producto.PizzaCaliforniaQueso;
import seccion32.factory.producto.PizzaCaliforniaVegetariana;
import seccion32.factory.producto.PizzaNewYorkItaliana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "queso" -> new PizzaCaliforniaQueso();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}
