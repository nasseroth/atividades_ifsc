package br.com.nasser.model.bo;

import br.com.nasser.model.bo.Cliente;
import br.com.nasser.model.bo.CondicaoPagamento;
import br.com.nasser.model.bo.Vendedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(Venda.class)
public class Venda_ { 

    public static volatile SingularAttribute<Venda, Integer> idvenda;
    public static volatile SingularAttribute<Venda, String> dtVenda;
    public static volatile SingularAttribute<Venda, String> serieVenda;
    public static volatile SingularAttribute<Venda, Integer> diaVencimentoParcela;
    public static volatile SingularAttribute<Venda, Vendedor> vendedor_idvendedor;
    public static volatile SingularAttribute<Venda, Float> valTotalVenda;
    public static volatile SingularAttribute<Venda, Cliente> cliente_idcliente;
    public static volatile SingularAttribute<Venda, Float> valDescontoVenda;
    public static volatile SingularAttribute<Venda, String> hrVenda;
    public static volatile SingularAttribute<Venda, CondicaoPagamento> condicaoPagamento_idcondicaoPagamento;

}