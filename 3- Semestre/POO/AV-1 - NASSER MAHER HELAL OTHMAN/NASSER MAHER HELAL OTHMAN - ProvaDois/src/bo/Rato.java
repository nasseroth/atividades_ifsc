package bo;

public class Rato extends Animal {
	
	private Boolean temLeptospirose;

	public Rato() {
		super();
	}

	public Rato(Boolean temLeptospirose) {
		super();
		this.temLeptospirose = temLeptospirose;
	}

	public Boolean getTemLeptospirose() {
		return temLeptospirose;
	}

	public void setTemLeptospirose(Boolean temLeptospirose) {
		this.temLeptospirose = temLeptospirose;
	}

	@Override
	public Boolean fazBarulho() {
		return true;
	}

}
