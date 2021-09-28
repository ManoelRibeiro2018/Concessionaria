package Repositorio;

import Model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteRepositorio extends CrudRepository<Cliente,Integer> {
}
