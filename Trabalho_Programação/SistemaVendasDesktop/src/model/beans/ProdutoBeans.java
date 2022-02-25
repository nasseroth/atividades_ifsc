package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class ProdutoBeans {

    private int idProduto;
    private String nomeProduto;
    private double precoProduto;
    private int quantProduto;
    private String estadoProduto;

    public ProdutoBeans() {
    }

    public ProdutoBeans(int idProduto) {
        this.idProduto = idProduto;
    }

    public ProdutoBeans(int idProduto, String nomeProduto, double precoProduto, int quantProduto, String estadoProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantProduto = quantProduto;
        this.estadoProduto = estadoProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }

    public String getEstadoProduto() {
        return estadoProduto;
    }

    public void setEstadoProduto(String estadoProduto) {
        this.estadoProduto = estadoProduto;
    }

}
