package seccion22.tarea26;

import seccion22.genericsclass.Animal;
import seccion22.genericsclass.Automovil;
import seccion22.genericsclass.Maquinaria;
import seccion22.tarea26.model.BolsaSupermercado;
import seccion22.tarea26.model.*;
import seccion22.tarea26.model.Producto;

public class Implementacion {

    public static <T> void imprimirBolsa(BolsaSupermercado<T> bolsa) {
        for (T t : bolsa) {
            if (t instanceof Lacteo) {
                Lacteo lacteo = (Lacteo) t;
                System.out.println("Nombre: " + lacteo.getNombre()
                        + " Precio: " + lacteo.getPrecio()
                        + " Cantidad: " + lacteo.getCantidad()
                        + " Proteinas: " + lacteo.getProteinas());
            }
            else if (t instanceof Fruta) {
                Fruta fruta = (Fruta) t;
                System.out.println("Nombre: " + fruta.getNombre()
                        + " Precio: " + fruta.getPrecio()
                        + " Peso (KG): " + fruta.getPeso()
                        + " Color: " + fruta.getColor());
            }
            else if (t instanceof Limpieza) {
                Limpieza limpieza = (Limpieza) t;
                System.out.println("Nombre: " + limpieza.getNombre()
                        + " Precio: " + limpieza.getPrecio()
                        + " Componentes: " + limpieza.getComponentes()
                        + " Litros: " + limpieza.getLitros());
            }
            else if (t instanceof NoPerecible) {
                NoPerecible noPerecible = (NoPerecible) t;
                System.out.println("Nombre: " + noPerecible.getNombre()
                        + " Precio: " + noPerecible.getPrecio()
                        + " Contenido: " + noPerecible.getContenido()
                        + " Calorias: " + noPerecible.getCalorias());
            }
        }
    }


    public static void main(String[] args) {


        BolsaSupermercado<Producto> bolsaSupermercado = new BolsaSupermercado<>(4);

        bolsaSupermercado.addProducto(new Fruta("Manzanas", 234.0, 20.5, "Rojas"));
        bolsaSupermercado.addProducto(new Lacteo("Yogurth", 234.0, 4, 43));
        bolsaSupermercado.addProducto(new Limpieza("Clorina", 234.0, "Cloro", 3.5));
        bolsaSupermercado.addProducto(new NoPerecible("Arroz", 234.0, 400, 43));

        imprimirBolsa(bolsaSupermercado);


    }
}
