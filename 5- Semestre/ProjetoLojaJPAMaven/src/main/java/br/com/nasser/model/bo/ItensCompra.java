package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItensCompra implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iditensCompra;

	@Column(name = "compra_idcompra")
	@ManyToOne
	@JoinColumn(name = "compra_idcompra", referencedColumnName = "id")
	private Compra compra;

	@Column(name = "caracteristicaProduto_idCaracteristicaProduto")
	private CaracteristicaProduto caracteristicaProduto;

	@Column
	private float qtdProduto;

	@Column
	private float valunitarioProduto;

	public ItensCompra() {
	}

	public ItensCompra(int iditensCompra, Compra compra, CaracteristicaProduto caracteristicaProduto, float qtdProduto,
			float valunitarioProduto) {
		super();
		this.iditensCompra = iditensCompra;
		this.compra = compra;
		this.caracteristicaProduto = caracteristicaProduto;
		this.qtdProduto = qtdProduto;
		this.valunitarioProduto = valunitarioProduto;
	}

	public int getIditensCompra() {
		return iditensCompra;
	}

	public void setIditensCompra(int iditensCompra) {
		this.iditensCompra = iditensCompra;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public CaracteristicaProduto getCaracteristicaProduto() {
		return caracteristicaProduto;
	}

	public void setCaracteristicaProduto(CaracteristicaProduto caracteristicaProduto) {
		this.caracteristicaProduto = caracteristicaProduto;
	}

	public float getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(float qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public float getValunitarioProduto() {
		return valunitarioProduto;
	}

	public void setValunitarioProduto(float valunitarioProduto) {
		this.valunitarioProduto = valunitarioProduto;
	}

	@Override
	public String toString() {
		return this.getQtdProduto() + ", " + this.getValunitarioProduto();
	}

}
