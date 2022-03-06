package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class CorBeans {

    private int idCor;
    private String nomeCor;

    public CorBeans() {
    }

    public CorBeans(int idCor) {
        this.idCor = idCor;
    }

    public CorBeans(int idCor, String nomeCor) {
        this.idCor = idCor;
        this.nomeCor = nomeCor;
    }

    public int getIdCor() {
        return idCor;
    }

    public void setIdCor(int idCor) {
        this.idCor = idCor;
    }

    public String getNomeCor() {
        return nomeCor;
    }

    public void setNomeCor(String nomeCor) {
        this.nomeCor = nomeCor;
    }

}
