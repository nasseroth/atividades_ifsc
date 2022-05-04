package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ItensVenda implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iditensVenda;

	@Column(name = "venda_idvenda")
	@ManyToOne
	@JoinColumn(name = "venda_idvenda", referencedColumnName = "id")
	private Venda venda;

	@Column(name = "caracteristicaProduto_idCaracteristicaProduto")
	@OneToOne
	private CaracteristicaProduto caracteristicaProduto;

	@Column
	private float valunitarioProduto;

	@Column
	private float qtdProduto;

	public ItensVenda() {
	}

	public ItensVenda(int iditensVenda, Venda venda, CaracteristicaProduto caracteristicaProduto,
			float valunitarioProduto, float qtdProduto) {
		super();
		this.iditensVenda = iditensVenda;
		this.venda = venda;
		this.caracteristicaProduto = caracteristicaProduto;
		this.valunitarioProduto = valunitarioProduto;
		this.qtdProduto = qtdProduto;
	}

	public int getIditensVenda() {
		return iditensVenda;
	}

	public void setIditensVenda(int iditensVenda) {
		this.iditensVenda = iditensVenda;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public CaracteristicaProduto getCaracteristicaProduto() {
		return caracteristicaProduto;
	}

	public void setCaracteristicaProduto(CaracteristicaProduto caracteristicaProduto) {
		this.caracteristicaProduto = caracteristicaProduto;
	}

	public float getValunitarioProduto() {
		return valunitarioProduto;
	}

	public void setValunitarioProduto(float valunitarioProduto) {
		this.valunitarioProduto = valunitarioProduto;
	}

	public float getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(float qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	@Override
	public String toString() {
		return this.getValunitarioProduto() + ", " + this.getQtdProduto();
	}

}
