package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Compra implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcompra;

	@Column(name = "fornecedor_idfornecedor")
	@OneToOne
	private Fornecedor fornecedor;

	@Column(name = "condicaoPagamento_idcondicaoPagamento")
	@OneToOne
	private CondicaoPagamento condicaoPagamento;

	@Column
	private int numNFCompra;

	@Column
	private String serieNFCompra;

	@Column
	private String dtHRCompra;

	@Column
	private float descontoCompra;

	@Column
	private float valorTotalCompra;

	public Compra() {
	}

	public Compra(int idcompra, Fornecedor fornecedor, CondicaoPagamento condicaoPagamento, int numNFCompra,
			String serieNFCompra, String dtHRCompra, float descontoCompra, float valorTotalCompra) {
		super();
		this.idcompra = idcompra;
		this.fornecedor = fornecedor;
		this.condicaoPagamento = condicaoPagamento;
		this.numNFCompra = numNFCompra;
		this.serieNFCompra = serieNFCompra;
		this.dtHRCompra = dtHRCompra;
		this.descontoCompra = descontoCompra;
		this.valorTotalCompra = valorTotalCompra;
	}

	public int getIdcompra() {
		return idcompra;
	}

	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public CondicaoPagamento getCondicaoPagamento() {
		return condicaoPagamento;
	}

	public void setCondicaoPagamento(CondicaoPagamento condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}

	public int getNumNFCompra() {
		return numNFCompra;
	}

	public void setNumNFCompra(int numNFCompra) {
		this.numNFCompra = numNFCompra;
	}

	public String getSerieNFCompra() {
		return serieNFCompra;
	}

	public void setSerieNFCompra(String serieNFCompra) {
		this.serieNFCompra = serieNFCompra;
	}

	public String getDtHRCompra() {
		return dtHRCompra;
	}

	public void setDtHRCompra(String dtHRCompra) {
		this.dtHRCompra = dtHRCompra;
	}

	public float getDescontoCompra() {
		return descontoCompra;
	}

	public void setDescontoCompra(float descontoCompra) {
		this.descontoCompra = descontoCompra;
	}

	public float getValorTotalCompra() {
		return valorTotalCompra;
	}

	public void setValorTotalCompra(float valorTotalCompra) {
		this.valorTotalCompra = valorTotalCompra;
	}

	@Override
	public String toString() {
		return this.getNumNFCompra() + ", " + this.getSerieNFCompra();
	}

}
