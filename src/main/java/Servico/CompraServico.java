package Servico;

import Model.Compra;
import Repositorio.ICompraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class CompraServico {

    @Autowired
    private ICompraRepositorio repositorio;

    public Compra Cadastrar(Compra compra){
        return repositorio.save(compra);
    }
}
