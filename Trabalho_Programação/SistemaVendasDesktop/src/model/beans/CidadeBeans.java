package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class CidadeBeans {

    private int idCidade;
    private String nomeCidade;
    private String ufCidade;

    public CidadeBeans() {
    }

    public CidadeBeans(int idCidade, String nomeCidade, String ufCidade) {
        this.idCidade = idCidade;
        this.nomeCidade = nomeCidade;
        this.ufCidade = ufCidade;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public String getUfCidade() {
        return ufCidade;
    }

    public void setUfCidade(String ufCidade) {
        this.ufCidade = ufCidade;
    }
}
