package br.com.nasser.model.bo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente extends Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcliente;

	@Column
	@Temporal(TemporalType.DATE)
	private Date dtNascCliente;

	@Column
	private String cpfCliente;

	@Column
	private String rgCliente;

	@Column
	private String foneCliente;

	@Column
	private String fone2Cliente;

	@Column(name = "endereco_idcep")
	@OneToOne
	private Endereco endereco;

	public Cliente() {
	}

	public Cliente(int idcliente, Date dtNascCliente, String cpfCliente, String rgCliente, String foneCliente,
			String fone2Cliente, Endereco endereco) {
		super();
		this.idcliente = idcliente;
		this.dtNascCliente = dtNascCliente;
		this.cpfCliente = cpfCliente;
		this.rgCliente = rgCliente;
		this.foneCliente = foneCliente;
		this.fone2Cliente = fone2Cliente;
		this.endereco = endereco;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public Date getDtNascCliente() {
		return dtNascCliente;
	}

	public void setDtNascCliente(Date dtNascCliente) {
		this.dtNascCliente = dtNascCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getRgCliente() {
		return rgCliente;
	}

	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}

	public String getFoneCliente() {
		return foneCliente;
	}

	public void setFoneCliente(String foneCliente) {
		this.foneCliente = foneCliente;
	}

	public String getFone2Cliente() {
		return fone2Cliente;
	}

	public void setFone2Cliente(String fone2Cliente) {
		this.fone2Cliente = fone2Cliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return this.getCpfCliente() + ", " + this.getRgCliente();
	}

}
