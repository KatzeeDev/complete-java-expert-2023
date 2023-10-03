package seccion14.proyectoordencompra;

import java.util.Date;

public class OrdenCompra {
    private Integer autoIncremental = 0;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getters
    public Integer getAutoIncremental() {
        return autoIncremental;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }


    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void addProducto(Producto producto) {
        if (autoIncremental < this.productos.length) {
            this.productos[autoIncremental++] = producto;
        }
    }

    public int granTotal() {
        int total = 0;
        for (Producto producto : this.productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }
        return total;
    }

    public void imprimirDetallesDeLaOrden() {
        System.out.println("Descripción de la orden: " + this.getDescripcion());
        System.out.println("Cliente: " + this.getCliente().getNombre() + " " + this.getCliente().getApellido());

        Producto[] productos = this.getProductos();
        for (Producto producto : productos) {
            if (producto != null) {
                System.out.println("Fabricante: " + producto.getFabricante() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
            }
        }

        System.out.println("Gran total de la orden: " + this.granTotal());
    }


}
