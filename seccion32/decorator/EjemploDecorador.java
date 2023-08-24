package seccion32.decorator;

import seccion32.decorator.decorador.MayusculaDecorador;
import seccion32.decorator.decorador.ReversaDecorador;
import seccion32.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {

    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal Vicho!!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayado = new SubrayadoDecorador(reversa);

        System.out.println(subrayado.darFormato());

    }

}
