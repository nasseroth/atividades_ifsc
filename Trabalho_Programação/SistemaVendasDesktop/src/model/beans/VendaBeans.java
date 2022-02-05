package model.beans;

import java.util.Date;

/**
 *
 * @author Nasser-Othman
 */
public class VendaBeans {

    private int idVenda;
    private int idVendedor;
    private int idCliente;
    private String numeroVendas;
    private String dataVenda;
    private double valorVenda;
    private String estadoVenda;

    public VendaBeans() {
    }

    public VendaBeans(int idVenda, int idVendedor, int idCliente, String numeroVendas,
            String dataVenda, double valorVenda, String estadoVenda) {
        this.idVenda = idVenda;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
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

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
