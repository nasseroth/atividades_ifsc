package br.com.nasser.model.bo;

import br.com.nasser.model.bo.Endereco;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(Fornecedor.class)
public class Fornecedor_ extends Pessoa_ {

    public static volatile SingularAttribute<Fornecedor, Integer> idfornecedor;
    public static volatile SingularAttribute<Fornecedor, String> cnpjFornecedor;
    public static volatile SingularAttribute<Fornecedor, Endereco> endereco_idcep;
    public static volatile SingularAttribute<Fornecedor, String> razaoSocialFornecedor;
    public static volatile SingularAttribute<Fornecedor, String> inscEstadualFornecedor;

}