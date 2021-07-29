package bo;

public abstract class Animal {

	private String nome;

	private Integer idade;

	private Character sexo;
	
	private Double peso;

	public abstract Boolean fazBarulho();

	public Animal() {
		super();
	}

	public Animal(String nome, Integer idade, Character sexo, Double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}


}
