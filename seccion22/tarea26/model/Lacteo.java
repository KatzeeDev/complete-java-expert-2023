package seccion22.tarea26.model;

public class Lacteo extends Producto{
    private Integer cantidad;
    private Integer proteinas;

    public Lacteo(String nombre, Double precio, Integer cantidad, Integer proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getProteinas() {
        return proteinas;
    }

    public void setProteinas(Integer proteinas) {
        this.proteinas = proteinas;
    }
}
