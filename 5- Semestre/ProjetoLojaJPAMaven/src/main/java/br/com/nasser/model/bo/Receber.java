package br.com.nasser.model.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Receber implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idreceber;

	@Column(name = "venda_idvenda")
	@OneToOne
	private Venda venda;

	@Column
	private String dtHremissaoRec;

	@Column
	private float ValEmissaoRec;

	@Column
	private String dtVencimentoRec;

	@Column
	private String dtPgtoRec;

	@Column
	private float acrescimoRec;

	@Column
	private float descontoRec;

	@Column
	private float valPagoRec;

	@Column
	private String statusRec;

	public Receber() {
	}

	public Receber(int idreceber, Venda venda, String dtHremissaoRec, float valEmissaoRec, String dtVencimentoRec,
			String dtPgtoRec, float acrescimoRec, float descontoRec, float valPagoRec, String statusRec) {
		super();
		this.idreceber = idreceber;
		this.venda = venda;
		this.dtHremissaoRec = dtHremissaoRec;
		ValEmissaoRec = valEmissaoRec;
		this.dtVencimentoRec = dtVencimentoRec;
		this.dtPgtoRec = dtPgtoRec;
		this.acrescimoRec = acrescimoRec;
		this.descontoRec = descontoRec;
		this.valPagoRec = valPagoRec;
		this.statusRec = statusRec;
	}

	public int getIdreceber() {
		return idreceber;
	}

	public void setIdreceber(int idreceber) {
		this.idreceber = idreceber;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public String getDtHremissaoRec() {
		return dtHremissaoRec;
	}

	public void setDtHremissaoRec(String dtHremissaoRec) {
		this.dtHremissaoRec = dtHremissaoRec;
	}

	public float getValEmissaoRec() {
		return ValEmissaoRec;
	}

	public void setValEmissaoRec(float valEmissaoRec) {
		ValEmissaoRec = valEmissaoRec;
	}

	public String getDtVencimentoRec() {
		return dtVencimentoRec;
	}

	public void setDtVencimentoRec(String dtVencimentoRec) {
		this.dtVencimentoRec = dtVencimentoRec;
	}

	public String getDtPgtoRec() {
		return dtPgtoRec;
	}

	public void setDtPgtoRec(String dtPgtoRec) {
		this.dtPgtoRec = dtPgtoRec;
	}

	public float getAcrescimoRec() {
		return acrescimoRec;
	}

	public void setAcrescimoRec(float acrescimoRec) {
		this.acrescimoRec = acrescimoRec;
	}

	public float getDescontoRec() {
		return descontoRec;
	}

	public void setDescontoRec(float descontoRec) {
		this.descontoRec = descontoRec;
	}

	public float getValPagoRec() {
		return valPagoRec;
	}

	public void setValPagoRec(float valPagoRec) {
		this.valPagoRec = valPagoRec;
	}

	public String getStatusRec() {
		return statusRec;
	}

	public void setStatusRec(String statusRec) {
		this.statusRec = statusRec;
	}

	@Override
	public String toString() {
		return this.getDtVencimentoRec() + ", " + this.getValPagoRec();
	}

}
