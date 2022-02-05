package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class DetalheVendaBeans {

    private int idDetalheVenda;
    private int idVenda;
    private int idProduto;
    private int quantidade;
    private double valorTotal;

    public DetalheVendaBeans() {
    }

    public DetalheVendaBeans(int idDetalheVenda, int idVenda, int idProduto,
            int quantidade, double valorTotal) {
        this.idDetalheVenda = idDetalheVenda;
        this.idVenda = idVenda;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    public int getIdDetalheVenda() {
        return idDetalheVenda;
    }

    public void setIdDetalheVenda(int idDetalheVenda) {
        this.idDetalheVenda = idDetalheVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
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
