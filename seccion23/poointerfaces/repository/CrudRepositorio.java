package seccion23.poointerfaces.repository;

import seccion23.poointerfaces.repository.exceptions.AccesoDatoException;
import seccion23.poointerfaces.repository.exceptions.EscrituraAccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {

    List<T> listar();
    T porId(Integer id) throws AccesoDatoException;
    void crear(T t) throws EscrituraAccesoDatoException;
    void editar(T t) throws AccesoDatoException;
    void eliminar(Integer id) throws AccesoDatoException;

}
