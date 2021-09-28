package Controller;

import Model.Compra;
import Repositorio.ICompraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompraController {

    @Autowired
    private ICompraRepositorio repositorio;

    @PostMapping(path = "api/compra")
    public Compra Cadastrar(@RequestBody Compra compra){
        return repositorio.save(compra);
    }

    @PutMapping(path = "api/compra/{codigo}")
    public Compra Atualizar(@PathVariable Integer codigo, @RequestBody Compra compra){
        repositorio.findById(codigo);
        return repositorio.save(compra);
    }
}
