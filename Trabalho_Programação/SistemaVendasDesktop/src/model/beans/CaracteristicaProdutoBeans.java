package model.beans;

/**
 *
 * @author Nasser-Othman
 */
public class CaracteristicaProdutoBeans {

    private int idCaracteristicaProduto;
    private ProdutoBeans produto;
    private CorBeans cor;
    private String tamanhoProduto;
    private String barraProduto;
    private Double qtdEstoqueProduto;

    public CaracteristicaProdutoBeans() {
    }

    public CaracteristicaProdutoBeans(int idCaracteristicaProduto, ProdutoBeans produto, CorBeans cor, String tamanhoProduto, String barraProduto, Double qtdEstoqueProduto) {
        this.idCaracteristicaProduto = idCaracteristicaProduto;
        this.produto = produto;
        this.cor = cor;
        this.tamanhoProduto = tamanhoProduto;
        this.barraProduto = barraProduto;
        this.qtdEstoqueProduto = qtdEstoqueProduto;
    }

    public int getIdCaracteristicaProduto() {
        return idCaracteristicaProduto;
    }

    public void setIdCaracteristicaProduto(int idCaracteristicaProduto) {
        this.idCaracteristicaProduto = idCaracteristicaProduto;
    }

    public ProdutoBeans getProduto() {
        return produto;
    }

    public void setProduto(ProdutoBeans produto) {
        this.produto = produto;
    }

    public CorBeans getCor() {
        return cor;
    }

    public void setCor(CorBeans cor) {
        this.cor = cor;
    }

    public String getTamanhoProduto() {
        return tamanhoProduto;
    }

    public void setTamanhoProduto(String tamanhoProduto) {
        this.tamanhoProduto = tamanhoProduto;
    }

    public String getBarraProduto() {
        return barraProduto;
    }

    public void setBarraProduto(String barraProduto) {
        this.barraProduto = barraProduto;
    }

    public Double getQtdEstoqueProduto() {
        return qtdEstoqueProduto;
    }

    public void setQtdEstoqueProduto(Double qtdEstoqueProduto) {
        this.qtdEstoqueProduto = qtdEstoqueProduto;
    }



}
