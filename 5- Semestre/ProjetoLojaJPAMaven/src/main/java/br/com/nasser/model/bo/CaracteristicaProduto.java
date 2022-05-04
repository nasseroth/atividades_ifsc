package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CaracteristicaProduto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCaracteristicaProduto;

	@Column(name = "produto_idproduto")
	@OneToOne
	private Produto produto;

	@Column(name = "cor_idcor")
	@OneToOne
	private Cor cor;

	@Column
	private String tamanhoProduto;

	@Column
	private String barraProduto;

	@Column
	private float qtdEstoqueProduto;

	public CaracteristicaProduto() {
	}

	public CaracteristicaProduto(int idCaracteristicaProduto, Produto produto, Cor cor, String tamanhoProduto,
			String barraProduto, float qtdEstoqueProduto) {
		super();
		this.idCaracteristicaProduto = idCaracteristicaProduto;
		this.produto = produto;
		this.cor = cor;
		this.tamanhoProduto = tamanhoProduto;
		this.barraProduto = barraProduto;
		this.qtdEstoqueProduto = qtdEstoqueProduto;
	}

	public int getIdCaracteristicaProduto() {
		return idCaracteristicaProduto;
	}

	public void setIdCaracteristicaProduto(int idCaracteristicaProduto) {
		this.idCaracteristicaProduto = idCaracteristicaProduto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public String getTamanhoProduto() {
		return tamanhoProduto;
	}

	public void setTamanhoProduto(String tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	}

	public String getBarraProduto() {
		return barraProduto;
	}

	public void setBarraProduto(String barraProduto) {
		this.barraProduto = barraProduto;
	}

	public float getQtdEstoqueProduto() {
		return qtdEstoqueProduto;
	}

	public void setQtdEstoqueProduto(float qtdEstoqueProduto) {
		this.qtdEstoqueProduto = qtdEstoqueProduto;
	}

	@Override
	public String toString() {
		return this.barraProduto;
	}

}
