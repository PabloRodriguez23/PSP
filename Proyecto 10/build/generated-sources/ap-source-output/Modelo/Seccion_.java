package Modelo;

import Modelo.Producto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-02-29T17:11:58")
@StaticMetamodel(Seccion.class)
public class Seccion_ { 

    public static volatile SingularAttribute<Seccion, String> descripcion;
    public static volatile SingularAttribute<Seccion, BigDecimal> precioTotalProductos;
    public static volatile SingularAttribute<Seccion, String> id;
    public static volatile CollectionAttribute<Seccion, Producto> productoCollection;
    public static volatile SingularAttribute<Seccion, String> contraseña;

}