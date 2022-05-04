package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproduto;

	@Column
	private float valProduto;
//    private String descricaoProduto;
//    private Marca marca_idmarca;
//    private TipoProduto tipoProduto_idtipoProduto;
//    private Tamanho tamanho_idtamanho;

	@Column
	private String descricaoProduto;

	@Column(name = "marca_idmarca")
	@OneToOne
	private Marca marca;

	@Column(name = "tipoProduto_idtipoProduto")
	@OneToOne
	private TipoProduto tipoProduto;

	@Column(name = "tamanho_idtamanho")
	@OneToOne
	private Tamanho tamanho;

	public Produto() {
	}

	public Produto(int idproduto, float valProduto, String descricaoProduto, Marca marca, TipoProduto tipoProduto,
			Tamanho tamanho) {
		super();
		this.idproduto = idproduto;
		this.valProduto = valProduto;
		this.descricaoProduto = descricaoProduto;
		this.marca = marca;
		this.tipoProduto = tipoProduto;
		this.tamanho = tamanho;
	}

	public int getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}

	public float getValProduto() {
		return valProduto;
	}

	public void setValProduto(float valProduto) {
		this.valProduto = valProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return this.getDescricaoProduto();
	}

}
