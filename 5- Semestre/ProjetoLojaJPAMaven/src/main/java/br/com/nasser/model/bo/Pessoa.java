package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public abstract class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column
	private String nome;

	@Column
	private String compleEndereco;

	@Column
	private String cep;

	@Column
	private String email;

	@Column
	private String status;

	public Pessoa() {
	}

	public Pessoa(String nome, String compleEndereco, String cep, String email, String status) {
		this.nome = nome;
		this.compleEndereco = compleEndereco;
		this.cep = cep;
		this.email = email;
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCompleEndereco() {
		return compleEndereco;
	}

	public void setCompleEndereco(String compleEndereco) {
		this.compleEndereco = compleEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return this.getNome() + ", " + this.getEmail();
	}

}
