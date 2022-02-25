package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class EnderecoBeans {

    private int idCep;
    private String cep;
    private String logradouroCep;
    private BairroBeans bairro; 
    private CidadeBeans cidade;

    public EnderecoBeans() {
    }

    public EnderecoBeans(int idCep) {
        this.idCep = idCep;
    }

    public EnderecoBeans(int idCep, String cep, String logradouroCep, BairroBeans bairro, CidadeBeans cidade) {
        this.idCep = idCep;
        this.cep = cep;
        this.logradouroCep = logradouroCep;
        this.bairro = bairro;
        this.cidade = cidade;
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

    public BairroBeans getBairro() {
        return bairro;
    }

    public void setBairro(BairroBeans bairro) {
        this.bairro = bairro;
    }

    public CidadeBeans getCidade() {
        return cidade;
    }

    public void setCidade(CidadeBeans cidade) {
        this.cidade = cidade;
    }


}
