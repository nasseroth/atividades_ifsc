package br.com.nasser.model.bo;

import br.com.nasser.model.bo.Venda;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(Receber.class)
public class Receber_ { 

    public static volatile SingularAttribute<Receber, Venda> venda_idvenda;
    public static volatile SingularAttribute<Receber, String> dtPgtoRec;
    public static volatile SingularAttribute<Receber, Float> descontoRec;
    public static volatile SingularAttribute<Receber, String> statusRec;
    public static volatile SingularAttribute<Receber, Integer> idreceber;
    public static volatile SingularAttribute<Receber, String> dtHremissaoRec;
    public static volatile SingularAttribute<Receber, Float> valPagoRec;
    public static volatile SingularAttribute<Receber, String> dtVencimentoRec;
    public static volatile SingularAttribute<Receber, Float> ValEmissaoRec;
    public static volatile SingularAttribute<Receber, Float> acrescimoRec;

}