package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Venda implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idvenda;

	@Column
	private String serieVenda;

	@Column
	private String dtVenda;

	@Column
	private String hrVenda;

	@Column
	private float valDescontoVenda;

	@Column
	private float valTotalVenda;

	@Column(name = "cliente_idcliente")
	@OneToOne
	private Cliente cliente;

	@Column(name = "vendedor_idvendedor")
	@OneToOne
	private Vendedor vendedor;

	@Column(name = "condicaoPagamento_idcondicaoPagamento")
	@OneToOne
	private CondicaoPagamento condicaoPagamento;

	@Column
	private int diaVencimentoParcela;

	public Venda() {
	}

	public Venda(int idvenda, String serieVenda, String dtVenda, String hrVenda, float valDescontoVenda,
			float valTotalVenda, Cliente cliente, Vendedor vendedor, CondicaoPagamento condicaoPagamento,
			int diaVencimentoParcela) {
		super();
		this.idvenda = idvenda;
		this.serieVenda = serieVenda;
		this.dtVenda = dtVenda;
		this.hrVenda = hrVenda;
		this.valDescontoVenda = valDescontoVenda;
		this.valTotalVenda = valTotalVenda;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.condicaoPagamento = condicaoPagamento;
		this.diaVencimentoParcela = diaVencimentoParcela;
	}

	public int getIdvenda() {
		return idvenda;
	}

	public void setIdvenda(int idvenda) {
		this.idvenda = idvenda;
	}

	public String getSerieVenda() {
		return serieVenda;
	}

	public void setSerieVenda(String serieVenda) {
		this.serieVenda = serieVenda;
	}

	public String getDtVenda() {
		return dtVenda;
	}

	public void setDtVenda(String dtVenda) {
		this.dtVenda = dtVenda;
	}

	public String getHrVenda() {
		return hrVenda;
	}

	public void setHrVenda(String hrVenda) {
		this.hrVenda = hrVenda;
	}

	public float getValDescontoVenda() {
		return valDescontoVenda;
	}

	public void setValDescontoVenda(float valDescontoVenda) {
		this.valDescontoVenda = valDescontoVenda;
	}

	public float getValTotalVenda() {
		return valTotalVenda;
	}

	public void setValTotalVenda(float valTotalVenda) {
		this.valTotalVenda = valTotalVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public CondicaoPagamento getCondicaoPagamento() {
		return condicaoPagamento;
	}

	public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}

	public int getDiaVencimentoParcela() {
		return diaVencimentoParcela;
	}

	public void setDiaVencimentoParcela(int diaVencimentoParcela) {
		this.diaVencimentoParcela = diaVencimentoParcela;
	}

	@Override
	public String toString() {
		return this.getSerieVenda();
	}

}
