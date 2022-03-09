package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class DetalheVendaBeans {

    private int idDetalheVenda;
    private VendaBeans venda;
    private CaracteristicaProdutoBeans caracteristicaProduto;
    private int quantidade;
    private double valorTotal;

    public DetalheVendaBeans() {
    }

    public int getIdDetalheVenda() {
        return idDetalheVenda;
    }

    public void setIdDetalheVenda(int idDetalheVenda) {
        this.idDetalheVenda = idDetalheVenda;
    }

    public VendaBeans getVenda() {
        return venda;
    }

    public void setVenda(VendaBeans venda) {
        this.venda = venda;
    }

    public CaracteristicaProdutoBeans getCaracteristicaProduto() {
        return caracteristicaProduto;
    }

    public void setCaracteristicaProduto(CaracteristicaProdutoBeans caracteristicaProduto) {
        this.caracteristicaProduto = caracteristicaProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }



}
