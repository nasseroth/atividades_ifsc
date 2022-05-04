package br.com.nasser.model.bo;

import br.com.nasser.model.bo.Marca;
import br.com.nasser.model.bo.Tamanho;
import br.com.nasser.model.bo.TipoProduto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Float> valProduto;
    public static volatile SingularAttribute<Produto, Marca> marca_idmarca;
    public static volatile SingularAttribute<Produto, TipoProduto> tipoProduto_idtipoProduto;
    public static volatile SingularAttribute<Produto, Integer> idproduto;
    public static volatile SingularAttribute<Produto, Tamanho> tamanho_idtamanho;
    public static volatile SingularAttribute<Produto, String> descricaoProduto;

}