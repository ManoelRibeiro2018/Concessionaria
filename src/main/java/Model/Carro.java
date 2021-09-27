package Model;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity(name = "Carros")
public class Carro {

    @Id
    private Integer IdCarro;
    private String Nome;
    private String Modelo;
    private String Marca;
    private Double Valor;
    private String Descricao;

    public int getIdCarro() {
        return IdCarro;
    }

    public void setIdCarro(int idCarro) {
        IdCarro = idCarro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
