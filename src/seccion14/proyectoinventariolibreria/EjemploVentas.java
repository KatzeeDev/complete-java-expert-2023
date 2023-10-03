package seccion14.proyectoinventariolibreria;

public class EjemploVentas {

    public static void main(String[] args) {

        // Lector

        Lector lector1 = new Lector("Matias", "Osorio");
        Lector lector2 = new Lector("Vicho", "De las nieves");


        Libro[] librosLector1 = new Libro[3];
        librosLector1[0] = new Libro("Penguin", "El Imperio final", 4000);
        librosLector1[1] = new Libro("Penguin", "El Pozo de la ascension", 5000);
        librosLector1[2] = new Libro("Penguin", "El heroe de las eras", 6000);

        VentaLibros ventaLibros1 = new VentaLibros("Libros del mejor escritor de la tierra");
        ventaLibros1.setLector(lector1);
        for (Libro libro : librosLector1) {
            ventaLibros1.addLibro(libro);
        }



        Libro[] librosLector2 = new Libro[3];
        librosLector2[0] = new Libro("Penguin", "Gatos y Brujas", 4000);
        librosLector2[1] = new Libro("Penguin", "El gato negro", 5000);
        librosLector2[2] = new Libro("Penguin", "El gato", 6000);

        VentaLibros ventaLibros2 = new VentaLibros("Libros para un gato mimado");
        ventaLibros2.setLector(lector2);
        for(Libro libro : librosLector2){
            ventaLibros2.addLibro(libro);
        }

        System.out.println();
        ventaLibros1.imprimirDetalleVenta();

        ventaLibros2.imprimirDetalleVenta();





    }

}
