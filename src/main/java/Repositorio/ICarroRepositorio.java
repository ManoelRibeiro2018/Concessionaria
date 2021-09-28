package Repositorio;

import Model.Carro;
import org.springframework.data.repository.CrudRepository;

public interface ICarroRepositorio extends CrudRepository<Carro,Integer> {
}
