package seccion32.factory.ejemplo;

import seccion32.factory.PizzaProducto;
import seccion32.factory.PizzeriaCaliforniaFactory;
import seccion32.factory.PizzeriaNewYorkFactory;
import seccion32.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {

    public static void main(String[] args) {

        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Matias ordena una " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("pizza = " + pizza.getNombre());

        pizza = california.ordenarPizza("pepperoni");
        System.out.println("Jhon ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);

    }

}
