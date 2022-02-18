package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class EnderecoBeans {

    private int idCep;
    private String cep;
    private String logradouroCep;
    private int idBairro; 
    private int idCidade;

    public EnderecoBeans() {
    }

    public EnderecoBeans(int idCep, String cep, String logradouroCep, int idBairro, int idCidade) {
        this.idCep = idCep;
        this.cep = cep;
        this.logradouroCep = logradouroCep;
        this.idBairro = idBairro;
        this.idCidade = idCidade;
    }

    public int getIdCep() {
        return idCep;
    }

    public void setIdCep(int idCep) {
        this.idCep = idCep;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouroCep() {
        return logradouroCep;
    }

    public void setLogradouroCep(String logradouroCep) {
        this.logradouroCep = logradouroCep;
    }

    public int getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(int idBairro) {
        this.idBairro = idBairro;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }
}
