package seccion32.decorator2;

import seccion32.decorator2.decorator.ConChocolateDecorador;
import seccion32.decorator2.decorator.ConCremaDecorador;
import seccion32.decorator2.decorator.ConLecheDecorador;

public class EjemploDecoradorCafe {

    public static void main(String[] args) {

        Configurable cafe = new Cafe("Cafe Mocha", 7);
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);

        System.out.println("El precio final del cafe Mocha es: $" + conChoco.getPrecioBase());
        System.out.println("Los ingredientes son: " + conChoco.getIngredientes());

        Configurable capuccino = new Cafe("Cafe Capuccino", 4);
        conCrema = new ConCremaDecorador(capuccino);
        conLeche = new ConLecheDecorador(conCrema);

        System.out.println("El precio del Capuccino es de : $" + conLeche.getPrecioBase());
        System.out.println("Los ingredientes son : " + conLeche.getIngredientes());

        Configurable expresso = new Cafe("Cafe Espresso", 3);
        System.out.println("El precio del Cafe Esoressi es : $" + expresso.getPrecioBase());
        System.out.println("Los ingredientes del cafe Espresso son : " + expresso.getIngredientes());



    }

}
