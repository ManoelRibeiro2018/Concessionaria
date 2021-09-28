package Servico;

import Model.Carro;
import Repositorio.ICarroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.ObjenesisException;

import java.util.Optional;

public class CarroServico {

    @Autowired
    private ICarroRepositorio repositorio;

    public Carro Cadastrar(Carro carro){
        return repositorio.save(carro);
    }

    public Carro FindById(Integer id){
        Optional<Carro> carro = repositorio.findById(id);
        return carro.orElseThrow(() -> new ObjenesisException(
                "Carro não encontrado"
        ));
    }

    public Carro Atualizar(Carro carro){
        FindById(carro.getIdCarro());
        return repositorio.save(carro);
    }

    public void Deletar(Integer id){
        FindById(id);
        repositorio.deleteById(id);
    }
}
