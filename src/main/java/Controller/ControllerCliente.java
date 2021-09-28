package Controller;

import Repositorio.IClienteRepositorio;
import Model.Cliente;
import Repositorio.ICompraRepositorio;
import Servico.ClienteServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerCliente {

    @Autowired
    private ClienteServico servico;
    private ICompraRepositorio  repositorio;

    @PostMapping("api/cliente")
    public Cliente Cadastrar(@RequestBody Cliente cliente){
        return servico.Cadastrar(cliente);
    }

    @PutMapping("api/cliente")
    public Cliente Atualizar (@PathVariable("codigo") Integer codigo, @RequestBody Cliente cliente){
       return servico.Atualizar(codigo, cliente);
    }

    @DeleteMapping(path = "api/cliente/{codigo}")
    public void Deletar(@PathVariable("codigo") Integer codigo){
        servico.Deletar(codigo);
    }

    @GetMapping(path = "api/cliente/{codigo}")
    public ResponseEntity Consultar(@PathVariable("codigo") Integer codigo){
     return  repositorio.findById(codigo)
               .map(record -> ResponseEntity.ok().body(record))
               .orElse(ResponseEntity.notFound().build());
    }


}
