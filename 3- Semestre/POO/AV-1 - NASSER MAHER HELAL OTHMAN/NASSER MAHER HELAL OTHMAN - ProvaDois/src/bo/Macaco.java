package bo;

public class Macaco extends Animal {

	private Boolean narizGrande;
	
	public Macaco() {
		super();
	}

	public Macaco(Boolean narizGrande) {
		super();
		this.narizGrande = narizGrande;
	}

	public Boolean getNarizGrande() {
		return narizGrande;
	}

	public void setNarizGrande(Boolean narizGrande) {
		this.narizGrande = narizGrande;
	}

	@Override
	public Boolean fazBarulho() {
		return true;
	}

}
