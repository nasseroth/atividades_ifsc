package br.com.nasser.model.bo;

import br.com.nasser.model.bo.Compra;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2022-04-26T22:06:40")
@StaticMetamodel(Pagar.class)
public class Pagar_ { 

    public static volatile SingularAttribute<Pagar, Float> acrescimoPagar;
    public static volatile SingularAttribute<Pagar, String> statusPagar;
    public static volatile SingularAttribute<Pagar, String> dtHrEmissaoPagar;
    public static volatile SingularAttribute<Pagar, Float> valemitidoPagar;
    public static volatile SingularAttribute<Pagar, String> dtVencimentoPagar;
    public static volatile SingularAttribute<Pagar, Integer> idpagar;
    public static volatile SingularAttribute<Pagar, Float> valPagoPagar;
    public static volatile SingularAttribute<Pagar, String> dtHrPgtoPagar;
    public static volatile SingularAttribute<Pagar, Compra> compra_idcompra;
    public static volatile SingularAttribute<Pagar, Float> descontoPagar;

}