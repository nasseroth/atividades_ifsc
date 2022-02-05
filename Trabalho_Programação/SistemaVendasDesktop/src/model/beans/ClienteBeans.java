package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class ClienteBeans {

    private int idCliente;
    private String nomeCliente;
    private String biCliente;
    private String enderecoCliente;
    private String codCliente;
    private String estadoCliente;

    public ClienteBeans() {
    }

    public ClienteBeans(int idCliente, String nomeCliente, String biCliente, String enderecoCliente, String codCliente, String estadoCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.biCliente = biCliente;
        this.enderecoCliente = enderecoCliente;
        this.codCliente = codCliente;
        this.estadoCliente = estadoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getBiCliente() {
        return biCliente;
    }

    public void setBiCliente(String biCliente) {
        this.biCliente = biCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

}
