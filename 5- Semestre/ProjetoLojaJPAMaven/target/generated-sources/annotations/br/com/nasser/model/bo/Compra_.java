package br.com.nasser.model.bo;

import br.com.nasser.model.bo.CondicaoPagamento;
import br.com.nasser.model.bo.Fornecedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Integer> idcompra;
    public static volatile SingularAttribute<Compra, Integer> numNFCompra;
    public static volatile SingularAttribute<Compra, String> dtHRCompra;
    public static volatile SingularAttribute<Compra, Float> valorTotalCompra;
    public static volatile SingularAttribute<Compra, Fornecedor> fornecedor_idfornecedor;
    public static volatile SingularAttribute<Compra, Float> descontoCompra;
    public static volatile SingularAttribute<Compra, CondicaoPagamento> condicaoPagamento_idcondicaoPagamento;
    public static volatile SingularAttribute<Compra, String> serieNFCompra;

}