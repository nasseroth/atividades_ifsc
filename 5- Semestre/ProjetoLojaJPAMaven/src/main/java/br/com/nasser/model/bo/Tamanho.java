package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tamanho implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTamanho;

	@Column
	private String descricaoTamanho;

	public Tamanho() {
	}

	public Tamanho(int idTamanho, String descricaoTamanho) {
		this.idTamanho = idTamanho;
		this.descricaoTamanho = descricaoTamanho;
	}

	public int getIdTamanho() {
		return idTamanho;
	}

	public void setIdTamanho(int idTamanho) {
		this.idTamanho = idTamanho;
	}

	public String getDescricaoTamanho() {
		return descricaoTamanho;
	}

	public void setDescricaoTamanho(String descricaoTamanho) {
		this.descricaoTamanho = descricaoTamanho;
	}

	@Override
	public String toString() {
		return this.getIdTamanho() + ", " + this.getDescricaoTamanho();
	}

}
