package seccion22.poointerfaces.repository;

import seccion22.poointerfaces.model.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
