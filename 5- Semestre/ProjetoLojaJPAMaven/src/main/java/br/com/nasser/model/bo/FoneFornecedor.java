package br.com.nasser.model.bo;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class FoneFornecedor {

	@Column
	private String foneFornecedor;

	@Column(name = "fornecedor_idfornecedor")
	@ManyToOne
	private Fornecedor fornecedor;

	public FoneFornecedor() {
	}

	public FoneFornecedor(String foneFornecedor, Fornecedor fornecedor) {
		super();
		this.foneFornecedor = foneFornecedor;
		this.fornecedor = fornecedor;
	}

	public String getFoneFornecedor() {
		return foneFornecedor;
	}

	public void setFoneFornecedor(String foneFornecedor) {
		this.foneFornecedor = foneFornecedor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public String toString() {
		return this.getFoneFornecedor();
	}

}
