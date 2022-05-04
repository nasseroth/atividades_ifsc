package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCidade;

	@Column
	private String descricaoCidade;

	@Column
	private String ufCidade;

	public Cidade() {
	}

	public Cidade(int idCidade, String descricaoCidade) {
		this.idCidade = idCidade;
		this.descricaoCidade = descricaoCidade;
	}

	public Cidade(int idCidade, String descricaoCidade, String ufCidade) {
		this.idCidade = idCidade;
		this.descricaoCidade = descricaoCidade;
		this.ufCidade = ufCidade;
	}

	public int getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}

	public String getDescricaoCidade() {
		return descricaoCidade;
	}

	public void setDescricaoCidade(String descricaoCidade) {
		this.descricaoCidade = descricaoCidade;
	}

	public String getUfCidade() {
		return ufCidade;
	}

	public void setUfCidade(String ufCidade) {
		this.ufCidade = ufCidade;
	}

	@Override
	public String toString() {
		return this.getIdCidade() + ", " + this.getDescricaoCidade();
	}

}
