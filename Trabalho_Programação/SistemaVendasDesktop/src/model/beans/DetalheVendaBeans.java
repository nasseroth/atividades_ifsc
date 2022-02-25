package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class DetalheVendaBeans {

    private int idDetalheVenda;
    private VendaBeans venda;
    private ProdutoBeans produto;
    private int quantidade;
    private double valorTotal;

    public DetalheVendaBeans() {
    }

    public DetalheVendaBeans(int idDetalheVenda, VendaBeans venda, ProdutoBeans produto, int quantidade, double valorTotal) {
        this.idDetalheVenda = idDetalheVenda;
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
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

    public ProdutoBeans getProduto() {
        return produto;
    }

    public void setProduto(ProdutoBeans produto) {
        this.produto = produto;
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
