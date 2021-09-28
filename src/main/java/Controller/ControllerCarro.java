package Controller;

import Model.Carro;
import Repositorio.ICarroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerCarro {
    @Autowired
    private ICarroRepositorio repositorio;

    @PostMapping("api/carro")
    public Carro Cadastrar(@RequestBody Carro carro){
        return repositorio.save(carro);
    }

    @PutMapping("api/carro")
    public Carro Atualizar (@PathVariable("codigo") Integer codigo, @RequestBody Carro carro){
        repositorio.findById(codigo);
        return repositorio.save(carro);
    }

    @DeleteMapping(path = "api/carro/{codigo}")
    public void Deletar(@PathVariable("codigo") Integer codigo){
        repositorio.deleteById(codigo);
    }

    @GetMapping(path = "api/carro/{codigo}")
    public ResponseEntity Consultar(@PathVariable("codigo") Integer codigo){
        return  repositorio.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

}
