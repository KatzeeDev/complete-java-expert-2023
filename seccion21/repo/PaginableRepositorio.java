package seccion21.repo;

import seccion21.model.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
