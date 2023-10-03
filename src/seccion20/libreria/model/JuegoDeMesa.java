package seccion20.libreria.model;

public class JuegoDeMesa extends Producto implements Displayable{
    private String fabricante;

    public JuegoDeMesa(String fabricante) {
        this.fabricante = fabricante;
    }

    public JuegoDeMesa(String nombre, double precio, int stock, String fabricante) {
        super(nombre, precio, stock);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void display(){
        System.out.println("Nombre del juego de mesa:" + " " + getNombre());
        System.out.println("Precio:" + " " + getPrecio());
        System.out.println("Fabricante:" + " " +getFabricante());
    }


}
