package br.com.nasser.model.bo;

import br.com.nasser.model.bo.Bairro;
import br.com.nasser.model.bo.Cidade;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(Endereco.class)
public class Endereco_ { 

    public static volatile SingularAttribute<Endereco, String> cepCep;
    public static volatile SingularAttribute<Endereco, Cidade> cidade;
    public static volatile SingularAttribute<Endereco, Integer> idCep;
    public static volatile SingularAttribute<Endereco, Bairro> bairro;
    public static volatile SingularAttribute<Endereco, String> logradouroCep;

}