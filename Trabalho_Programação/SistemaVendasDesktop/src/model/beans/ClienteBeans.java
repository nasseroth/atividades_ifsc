package model.beans;

import java.util.Date;


/**
 *
 * @author Nasser-Othman
 */
public class ClienteBeans {

    private int idCliente;
    private String nomeCliente;
    private Date dtNasCliente;
    private String cpfCliente;
    private String rgCliente;
    private String foneCliente;
    private String fone2Cliente;
    private String emailCliente;
    private String compleEnderecoCliente;
    private int idCep;

    public ClienteBeans() {
    }

    public ClienteBeans(int idCliente, String nomeCliente, Date dtNasCliente, String cpfCliente, String rgCliente, String foneCliente, String fone2Cliente, String emailCliente, String compleEnderecoCliente, int idCep) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.dtNasCliente = dtNasCliente;
        this.cpfCliente = cpfCliente;
        this.rgCliente = rgCliente;
        this.foneCliente = foneCliente;
        this.fone2Cliente = fone2Cliente;
        this.emailCliente = emailCliente;
        this.compleEnderecoCliente = compleEnderecoCliente;
        this.idCep = idCep;
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

    public Date getDtNasCliente() {
        return dtNasCliente;
    }

    public void setDtNasCliente(Date dtNasCliente) {
        this.dtNasCliente = dtNasCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getFoneCliente() {
        return foneCliente;
    }

    public void setFoneCliente(String foneCliente) {
        this.foneCliente = foneCliente;
    }

    public String getFone2Cliente() {
        return fone2Cliente;
    }

    public void setFone2Cliente(String fone2Cliente) {
        this.fone2Cliente = fone2Cliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getCompleEnderecoCliente() {
        return compleEnderecoCliente;
    }

    public void setCompleEnderecoCliente(String compleEnderecoCliente) {
        this.compleEnderecoCliente = compleEnderecoCliente;
    }

    public int getIdCep() {
        return idCep;
    }

    public void setIdCep(int idCep) {
        this.idCep = idCep;
    }

}
