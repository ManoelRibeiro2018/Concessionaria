package Model;

import javax.persistence.Id;
import javax.persistence.Entity;

@Entity(name = "Usuarios")
public class Cliente {
    @Id
    private Integer IdCliente;
    private String Nome;
    private String Cpf;
    private String Endereco;
    private String Email;
    private String Senha;

    public int getId() {
        return IdCliente;
    }

    public void setId(int IdCliente) {
        IdCliente = IdCliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }
}
