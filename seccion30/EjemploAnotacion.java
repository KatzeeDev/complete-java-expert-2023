package seccion30;

import seccion30.models.Producto;
import seccion30.utility.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotacion {

    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("notebook gamer  asus rog");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(p));

    }

}
