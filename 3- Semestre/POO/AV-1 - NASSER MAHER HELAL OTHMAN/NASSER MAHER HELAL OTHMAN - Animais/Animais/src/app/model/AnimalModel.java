package app.model;

import app.enums.TipoAnimalEnum;

public class AnimalModel {
	
	private TipoAnimalEnum tipoAnimal;
	
	private Double peso;
	
	private Double altura;
	
	private Character sexo;
	
	private String bairroEncontrado;
	
	private String situacaoAnimal;
	
	private Integer idadeAproximada;

	public AnimalModel() {
		super();
	}

	public AnimalModel(TipoAnimalEnum tipoAnimal, Double peso, Double altura, Character sexo, String bairroEncontrado,
			String situacaoAnimal, Integer idadeAproximada) {
		super();
		this.tipoAnimal = tipoAnimal;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
		this.bairroEncontrado = bairroEncontrado;
		this.situacaoAnimal = situacaoAnimal;
		this.idadeAproximada = idadeAproximada;
	}

	public TipoAnimalEnum getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(TipoAnimalEnum tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String getBairroEncontrado() {
		return bairroEncontrado;
	}

	public void setBairroEncontrado(String bairroEncontrado) {
		this.bairroEncontrado = bairroEncontrado;
	}

	public String getSituacaoAnimal() {
		return situacaoAnimal;
	}

	public void setSituacaoAnimal(String situacaoAnimal) {
		this.situacaoAnimal = situacaoAnimal;
	}

	public Integer getIdadeAproximada() {
		return idadeAproximada;
	}

	public void setIdadeAproximada(Integer idadeAproximada) {
		this.idadeAproximada = idadeAproximada;
	}
	
	
}
