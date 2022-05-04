package br.com.nasser.model.bo;

import br.com.nasser.model.bo.Cor;
import br.com.nasser.model.bo.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(CaracteristicaProduto.class)
public class CaracteristicaProduto_ { 

    public static volatile SingularAttribute<CaracteristicaProduto, Cor> cor_idcor;
    public static volatile SingularAttribute<CaracteristicaProduto, String> tamanhoProduto;
    public static volatile SingularAttribute<CaracteristicaProduto, Float> qtdEstoqueProduto;
    public static volatile SingularAttribute<CaracteristicaProduto, Produto> produto_idproduto;
    public static volatile SingularAttribute<CaracteristicaProduto, Integer> idCaracteristicaProduto;
    public static volatile SingularAttribute<CaracteristicaProduto, String> barraProduto;

}