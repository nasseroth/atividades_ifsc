package model.beans;

import java.util.Date;

/**
 *
 * @author Nasser-Othman
 */
public class VendaBeans {

    private int idVenda;
    private VendedorBeans vendedor;
    private ClienteBeans cliente;
    private String numeroVendas;
    private String dataVenda;
    private double valorVenda;
    private String estadoVenda;

    public VendaBeans() {
    }

    public VendaBeans(int idVenda) {
        this.idVenda = idVenda;
    }

    public VendaBeans(int idVenda, VendedorBeans vendedor, ClienteBeans cliente, String numeroVendas, String dataVenda, double valorVenda, String estadoVenda) {
        this.idVenda = idVenda;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.numeroVendas = numeroVendas;
        this.dataVenda = dataVenda;
        this.valorVenda = valorVenda;
        this.estadoVenda = estadoVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public VendedorBeans getVendedor() {
        return vendedor;
    }

    public void setVendedor(VendedorBeans vendedor) {
        this.vendedor = vendedor;
    }

    public ClienteBeans getCliente() {
        return cliente;
    }

    public void setCliente(ClienteBeans cliente) {
        this.cliente = cliente;
    }

    public String getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(String numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getEstadoVenda() {
        return estadoVenda;
    }

    public void setEstadoVenda(String estadoVenda) {
        this.estadoVenda = estadoVenda;
    }

}
