package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class VendedorBeans {

    private int idVendedor;
    private String nomeUsuario;
    private String codVendedor;
    private String biVendedor;
    private String nomeVendedor;
    private String telefoneVendedor;
    private String estadoVendedor;

    public VendedorBeans() {
    }

    public VendedorBeans(int idVendedor, String nomeUsuario, String codVendedor,
            String biVendedor, String nomeVendedor, String telefoneVendedor, String estadoVendedor) {
        this.idVendedor = idVendedor;
        this.nomeUsuario = nomeUsuario;
        this.codVendedor = codVendedor;
        this.biVendedor = biVendedor;
        this.nomeVendedor = nomeVendedor;
        this.telefoneVendedor = telefoneVendedor;
        this.estadoVendedor = estadoVendedor;

    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(String codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getBiVendedor() {
        return biVendedor;
    }

    public void setBiVendedor(String biVendedor) {
        this.biVendedor = biVendedor;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getTelefoneVendedor() {
        return telefoneVendedor;
    }

    public void setTelefoneVendedor(String telefoneVendedor) {
        this.telefoneVendedor = telefoneVendedor;
    }

    public String getEstadoVendedor() {
        return estadoVendedor;
    }

    public void setEstadoVendedor(String estadoVendedor) {
        this.estadoVendedor = estadoVendedor;
    }

}
