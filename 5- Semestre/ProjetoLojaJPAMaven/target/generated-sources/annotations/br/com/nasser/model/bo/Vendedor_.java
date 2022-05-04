package br.com.nasser.model.bo;

import br.com.nasser.model.bo.Endereco;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(Vendedor.class)
public class Vendedor_ extends Pessoa_ {

    public static volatile SingularAttribute<Vendedor, Integer> idvendedor;
    public static volatile SingularAttribute<Vendedor, String> cpfVendedor;
    public static volatile SingularAttribute<Vendedor, Endereco> endereco_idcep;
    public static volatile SingularAttribute<Vendedor, String> foneVendedor;
    public static volatile SingularAttribute<Vendedor, Float> percentComissaoRecebto;
    public static volatile SingularAttribute<Vendedor, String> fone2Vendedor;
    public static volatile SingularAttribute<Vendedor, Float> PercentComissaoVenda;

}