package seccion27.stream;

import seccion27.stream.models.Factura;
import seccion27.stream.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("Jhon", "Doe");
        Usuario u2 = new Usuario("Matias", "Osorio");
        Usuario u3 = new Usuario("Vicho", "De las nieves");

        u1.addFactura(new Factura("Compras tecnologicas"));
        u1.addFactura(new Factura("Compras Muebles"));

        u2.addFactura(new Factura("Compra Comics"));
        u2.addFactura(new Factura("Compra Muebles"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
        // Lo comun seria realizar esto
        System.out.println(" ------- Manera Convencional ------- ");
        for (Usuario u: usuarios) {
            for (Factura f : u.getFacturas()){
                System.out.println(f.getDescripcion().concat(" Cliente:")
                        .concat(f.getUsuario().toString()));
            }
        }
        // Pero esto se puede simplificar
        System.out.println(" ------- Manera simplificada ------- ");
        usuarios.stream().
                flatMap(u -> u.getFacturas().stream())
                .forEach(f ->  System.out.println(f.getDescripcion().concat(" Cliente:")
                        .concat(f.getUsuario().toString())));
    }

}
