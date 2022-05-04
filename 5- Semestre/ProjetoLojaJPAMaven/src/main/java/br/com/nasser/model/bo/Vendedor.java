package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vendedor extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idvendedor;

	@Column
	private String cpfVendedor;

	@Column
	private String foneVendedor;

	@Column
	private String fone2Vendedor;

	@Column
	private float PercentComissaoVenda;

	@Column
	private float percentComissaoRecebto;

	@Column(name = "endereco_idcep")
	@OneToOne
	private Endereco endereco;

	public Vendedor() {
	}

	public Vendedor(int idvendedor, String cpfVendedor, String foneVendedor, String fone2Vendedor,
			float percentComissaoVenda, float percentComissaoRecebto, Endereco endereco) {
		super();
		this.idvendedor = idvendedor;
		this.cpfVendedor = cpfVendedor;
		this.foneVendedor = foneVendedor;
		this.fone2Vendedor = fone2Vendedor;
		PercentComissaoVenda = percentComissaoVenda;
		this.percentComissaoRecebto = percentComissaoRecebto;
		this.endereco = endereco;
	}

	public int getIdvendedor() {
		return idvendedor;
	}

	public void setIdvendedor(int idvendedor) {
		this.idvendedor = idvendedor;
	}

	public String getCpfVendedor() {
		return cpfVendedor;
	}

	public void setCpfVendedor(String cpfVendedor) {
		this.cpfVendedor = cpfVendedor;
	}

	public String getFoneVendedor() {
		return foneVendedor;
	}

	public void setFoneVendedor(String foneVendedor) {
		this.foneVendedor = foneVendedor;
	}

	public String getFone2Vendedor() {
		return fone2Vendedor;
	}

	public void setFone2Vendedor(String fone2Vendedor) {
		this.fone2Vendedor = fone2Vendedor;
	}

	public float getPercentComissaoVenda() {
		return PercentComissaoVenda;
	}

	public void setPercentComissaoVenda(float percentComissaoVenda) {
		PercentComissaoVenda = percentComissaoVenda;
	}

	public float getPercentComissaoRecebto() {
		return percentComissaoRecebto;
	}

	public void setPercentComissaoRecebto(float percentComissaoRecebto) {
		this.percentComissaoRecebto = percentComissaoRecebto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return this.getCpfVendedor() + ", " + this.getFoneVendedor();
	}

}
