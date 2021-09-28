package Controller;

import Model.Carro;
import Repositorio.ICarroRepositorio;
import Servico.CarroServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerCarro {
    @Autowired
    private ICarroRepositorio repositorio;
    private CarroServico  servico;

    @PostMapping("api/carro")
    public Carro Cadastrar(@RequestBody Carro carro){
        return servico.Cadastrar(carro);
    }

    @PutMapping("api/carro")
    public Carro Atualizar (@PathVariable("codigo") Integer codigo, @RequestBody Carro carro){
        return servico.Atualizar(codigo, carro);
    }

    @DeleteMapping(path = "api/carro/{codigo}")
    public void Deletar(@PathVariable("codigo") Integer codigo){
        servico.Deletar(codigo);
    }

    @GetMapping(path = "api/carro/{codigo}")
    public ResponseEntity Consultar(@PathVariable("codigo") Integer codigo){
        return  repositorio.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

}
