package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class CidadeBeans {

    private int idCliente;
    private String descricaoCidade;
    private String ufCidade;

    public CidadeBeans() {
    }

    public CidadeBeans(int idCliente, String descricaoCidade, String ufCidade) {
        this.idCliente = idCliente;
        this.descricaoCidade = descricaoCidade;
        this.ufCidade = ufCidade;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDescricaoCidade() {
        return descricaoCidade;
    }

    public void setDescricaoCidade(String descricaoCidade) {
        this.descricaoCidade = descricaoCidade;
    }

    public String getUfCidade() {
        return ufCidade;
    }

    public void setUfCidade(String ufCidade) {
        this.ufCidade = ufCidade;
    }

}
