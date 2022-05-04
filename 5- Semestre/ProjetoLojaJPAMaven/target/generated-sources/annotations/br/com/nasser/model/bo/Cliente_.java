package br.com.nasser.model.bo;

import br.com.nasser.model.bo.Endereco;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(Cliente.class)
public class Cliente_ extends Pessoa_ {

    public static volatile SingularAttribute<Cliente, Date> dtNascCliente;
    public static volatile SingularAttribute<Cliente, String> cpfCliente;
    public static volatile SingularAttribute<Cliente, String> rgCliente;
    public static volatile SingularAttribute<Cliente, String> foneCliente;
    public static volatile SingularAttribute<Cliente, String> fone2Cliente;
    public static volatile SingularAttribute<Cliente, Endereco> endereco_idcep;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;

}