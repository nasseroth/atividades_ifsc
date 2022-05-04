package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Fornecedor extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idfornecedor;

	@Column
	private String razaoSocialFornecedor;

	@Column
	private String cnpjFornecedor;

	@Column
	private String inscEstadualFornecedor;

	@Column(name = "endereco_idcep")
	@OneToOne
	private Endereco endereco;

	public Fornecedor() {
	}

	public Fornecedor(int idfornecedor, String razaoSocialFornecedor, String cnpjFornecedor,
			String inscEstadualFornecedor, Endereco endereco) {
		super();
		this.idfornecedor = idfornecedor;
		this.razaoSocialFornecedor = razaoSocialFornecedor;
		this.cnpjFornecedor = cnpjFornecedor;
		this.inscEstadualFornecedor = inscEstadualFornecedor;
		this.endereco = endereco;
	}

	public int getIdfornecedor() {
		return idfornecedor;
	}

	public void setIdfornecedor(int idfornecedor) {
		this.idfornecedor = idfornecedor;
	}

	public String getRazaoSocialFornecedor() {
		return razaoSocialFornecedor;
	}

	public void setRazaoSocialFornecedor(String razaoSocialFornecedor) {
		this.razaoSocialFornecedor = razaoSocialFornecedor;
	}

	public String getCnpjFornecedor() {
		return cnpjFornecedor;
	}

	public void setCnpjFornecedor(String cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
	}

	public String getInscEstadualFornecedor() {
		return inscEstadualFornecedor;
	}

	public void setInscEstadualFornecedor(String inscEstadualFornecedor) {
		this.inscEstadualFornecedor = inscEstadualFornecedor;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return this.getRazaoSocialFornecedor() + ", " + this.getCnpjFornecedor() + ", "
				+ this.getInscEstadualFornecedor();
	}

}
