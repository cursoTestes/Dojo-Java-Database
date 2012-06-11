package br.scrumban;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class VendaVendedor
{
    @Id
    private long id;

    @ManyToOne
    private Vendedor vendedor;
    
    @ManyToOne
    private Venda venda;
    
    private double valorParticipacao;

    
	public double getValorParticipacao() {
		return valorParticipacao;
	}

	public void setValorParticipacao(double valorParticipacao) {
		this.valorParticipacao = valorParticipacao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}
