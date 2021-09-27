package Controller;

import Interface.IClienteRepositorio;
import Model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerCliente {

    @Autowired
    private IClienteRepositorio repositorio;

    @PostMapping("api/cliente")
    public Cliente Cadastrar(@RequestBody Cliente cliente){
        return repositorio.save(cliente);
    }

    @PutMapping("api/cleinte")
    public Cliente Atualizar (@PathVariable("codigo") Integer codigo, @RequestBody Cliente cleinte){
        repositorio.findById(codigo);
       return repositorio.save(cleinte);
    }

    @DeleteMapping(path = "api/cliente/{codigo}")
    public void Deletar(@PathVariable("codigo") Integer codigo){
        repositorio.deleteById(codigo);
    }

    @GetMapping(path = "api/cliente/{codigo}")
    public ResponseEntity Consultar(@PathVariable("codigo") Integer codigo){
     return  repositorio.findById(codigo)
               .map(record -> ResponseEntity.ok().body(record))
               .orElse(ResponseEntity.notFound().build());
    }


}
