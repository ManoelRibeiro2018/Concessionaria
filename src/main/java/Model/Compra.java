package Model;

import javax.persistence.Id;
import javax.persistence.Entity;
import java.util.Date;

@Entity(name = "Compras")
public class Compra {
    @Id
    private Integer IdCompra;
    private Date DataRealizada;
    private Cliente Cliente;
    private Carro Carro;

    public int getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(int idCompra) {
        IdCompra = idCompra;
    }

    public Date getDataRealizada() {
        return DataRealizada;
    }

    public void setDataRealizada(Date dataRealizada) {
        DataRealizada = dataRealizada;
    }

    public Model.Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Model.Cliente cliente) {
        Cliente = cliente;
    }

    public Model.Carro getCarro() {
        return Carro;
    }

    public void setCarro(Model.Carro carro) {
        Carro = carro;
    }
}
