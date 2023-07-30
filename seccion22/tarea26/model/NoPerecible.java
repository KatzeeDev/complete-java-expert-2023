package seccion22.tarea26.model;

public class NoPerecible extends Producto{

    private Integer contenido;
    private Integer calorias;

    public NoPerecible(String nombre, Double precio, Integer contenido, Integer calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public Integer getContenido() {
        return contenido;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }
}
