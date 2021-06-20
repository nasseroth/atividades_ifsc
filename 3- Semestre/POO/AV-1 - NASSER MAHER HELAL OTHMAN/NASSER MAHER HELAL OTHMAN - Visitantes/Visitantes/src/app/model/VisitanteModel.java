package app.model;

public class VisitanteModel {
	
	private String nome;
	
	private String fone;
	
	private String cidade;
	
	private String bairro;
	
	private Character sexo;
	
	private String profissao;
	
	private Integer anoNascimento;
	
	public VisitanteModel() {
		super();
	}
	
	public VisitanteModel(String nome, String fone, String cidade, String bairro, Character sexo, String profissao,
			Integer anoNascimento) {
		super();
		this.nome = nome;
		this.fone = fone;
		this.cidade = cidade;
		this.bairro = bairro;
		this.sexo = sexo;
		this.profissao = profissao;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	

}
