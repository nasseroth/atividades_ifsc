package bo;

public class Gato extends Animal {

	private String raca;
	
	public Gato() {
		super();
	}

	public Gato(String raca) {
		super();
		this.raca = raca;
	}

	@Override
	public Boolean fazBarulho() {
		return true;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void miar(){
		System.out.println("Miauuuu!");
	}
	
}
