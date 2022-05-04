package br.com.nasser.model.bo;

import br.com.nasser.model.bo.CaracteristicaProduto;
import br.com.nasser.model.bo.Compra;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(ItensCompra.class)
public class ItensCompra_ { 

    public static volatile SingularAttribute<ItensCompra, Float> qtdProduto;
    public static volatile SingularAttribute<ItensCompra, Float> valunitarioProduto;
    public static volatile SingularAttribute<ItensCompra, CaracteristicaProduto> caracteristicaProduto_idCaracteristicaProduto;
    public static volatile SingularAttribute<ItensCompra, Integer> iditensCompra;
    public static volatile SingularAttribute<ItensCompra, Compra> compra_idcompra;

}