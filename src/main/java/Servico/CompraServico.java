package Servico;

import Model.Cliente;
import Model.Compra;
import Repositorio.ICompraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.ObjenesisException;

import java.util.Optional;

public class CompraServico {

    @Autowired
    private ICompraRepositorio repositorio;

    public Compra Cadastrar(Compra compra){
        return repositorio.save(compra);
    }
    public Compra Atualizar(Integer id, Compra compra){
        repositorio.findById(id);
        return repositorio.save(compra);
    }

    public Compra FindById(Integer id){
        Optional<Compra> compra = repositorio.findById(id);
        return compra.orElseThrow(() -> new ObjenesisException(
                "Compra não encontrada"
        ));
    }
}
