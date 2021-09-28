package Controller;

import Model.Compra;
import Repositorio.ICompraRepositorio;
import Servico.CompraServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompraController {

    @Autowired
    private CompraServico  servico;

    @PostMapping(path = "api/compra")
    public Compra Cadastrar(@RequestBody Compra compra){
        return servico.Cadastrar(compra);
    }

    @PutMapping(path = "api/compra/{codigo}")
    public Compra Atualizar(@PathVariable Integer codigo, @RequestBody Compra compra){
      return servico.Atualizar(codigo,compra);
    }
}
