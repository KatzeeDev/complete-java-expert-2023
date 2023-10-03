package seccion18.tarea22;

public class Almacen {

    public static void main(String[] args) {

        Producto[] productos = new Producto[8];
        // Lacteos
        Lacteo yogurth = new Lacteo("Yogurth De Fresa", 500.0, 3, 90);
        Lacteo leche = new Lacteo("Leche de Proteinas", 2400.0, 3, 230);
        productos[0] = yogurth;
        productos[1] = leche;
        // Fruta
        Fruta manzana = new Fruta("Manzana", 400.0, 4, "Roja");
        Fruta banana = new Fruta("Banana", 500.0, 4, "Amarilla");
        productos[2] = manzana;
        productos[3] = banana;
        // Limpieza
        Limpieza detergente = new Limpieza("Detergente", 400.0, "Amonio, Acido Nitrico", 2);
        Limpieza shampoo = new Limpieza("Shampoo", 500.0, "Benzoato, Agua", 1);
        productos[4] = detergente;
        productos[5] = shampoo;
        // No perecible
        NoPerecible arroz = new NoPerecible("Arroz", 500.0, 1000, 200);
        NoPerecible lentejas = new NoPerecible("Lentejas", 600.0, 500, 100);
        productos[6] = arroz;
        productos[7] = lentejas;


        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
        }

    }


}
