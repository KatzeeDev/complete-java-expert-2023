package seccion20.libreria.model;

public class Revista extends Producto{
    private String publicador;


    public Revista(String publicador) {
        this.publicador = publicador;
    }

    public Revista(String nombre, double precio, int stock, String publicador) {
        super(nombre, precio, stock);
        this.publicador = publicador;
    }

    public String getPublicador() {
        return publicador;
    }

    public void setPublicador(String publicador) {
        this.publicador = publicador;
    }

    public void display(){
        System.out.println("Nombre revista: " + getNombre());
        System.out.println("Publicador: " + getPublicador());
        System.out.println("Precio: " + getPrecio());

    }
}
