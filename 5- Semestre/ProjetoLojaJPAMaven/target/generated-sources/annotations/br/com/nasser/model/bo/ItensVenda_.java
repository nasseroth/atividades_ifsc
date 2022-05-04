package br.com.nasser.model.bo;

import br.com.nasser.model.bo.CaracteristicaProduto;
import br.com.nasser.model.bo.Venda;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(ItensVenda.class)
public class ItensVenda_ { 

    public static volatile SingularAttribute<ItensVenda, Venda> venda_idvenda;
    public static volatile SingularAttribute<ItensVenda, Float> valunitarioProduto;
    public static volatile SingularAttribute<ItensVenda, Float> qtdProduto;
    public static volatile SingularAttribute<ItensVenda, CaracteristicaProduto> caracteristicaProduto_idCaracteristicaProduto;
    public static volatile SingularAttribute<ItensVenda, Integer> iditensVenda;

}