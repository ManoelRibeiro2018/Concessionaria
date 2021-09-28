package Servico;

import Model.Cliente;
import Repositorio.IClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.ObjenesisException;

import java.util.List;
import java.util.Optional;

public class ClienteServico {

    @Autowired
    private IClienteRepositorio repositorio;

    public Cliente Cadastrar(Cliente cliente){
        return repositorio.save(cliente);
    }

    public Cliente FindById(Integer id){
        Optional<Cliente> cliente = repositorio.findById(id);
        return cliente.orElseThrow(() -> new ObjenesisException(
                "Cliente não encontrado"
        ));
    }

    public Cliente Atualizar(Integer id, Cliente cliente){
        FindById(id);
        return repositorio.save(cliente);
    }

    public void Deletar(Integer id){
        FindById(id);
         repositorio.deleteById(id);
    }

}
