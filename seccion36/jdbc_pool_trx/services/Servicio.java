package seccion36.jdbc_pool_trx.services;

import seccion36.jdbc_pool_trx.models.Producto;
import seccion36.jdbc_pool_trx.models.Categoria;

import java.sql.SQLException;
import java.util.List;

public interface Servicio {
    // Producto
    List<Producto> listarProducto() throws SQLException;

    Producto porIdProducto(Long id) throws SQLException;

    Producto guardarProducto(Producto producto) throws SQLException;

    void eliminarProducto(Long id) throws SQLException;

    // Categoria
    List<Categoria> listarCategoria() throws SQLException;

    Categoria porIdCategoria(Long id) throws SQLException;

    Categoria guardarCategoria(Categoria categoria) throws SQLException;

    void eliminarCategoria(Long id) throws SQLException;

    // Metodo de Transaccion.
    void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException;

}
