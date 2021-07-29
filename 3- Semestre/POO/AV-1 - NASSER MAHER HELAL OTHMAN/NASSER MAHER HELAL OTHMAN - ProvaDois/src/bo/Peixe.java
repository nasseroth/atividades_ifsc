package bo;

public class Peixe extends Animal {

	private Boolean temEscama;
	
	public Peixe() {
		super();
	}

	public Peixe(Boolean temEscama) {
		super();
		this.temEscama = temEscama;
	}

	public Boolean getTemEscama() {
		return temEscama;
	}

	public void setTemEscama(Boolean temEscama) {
		this.temEscama = temEscama;
	}

	@Override
	public Boolean fazBarulho() {
		return false;
	}
}
