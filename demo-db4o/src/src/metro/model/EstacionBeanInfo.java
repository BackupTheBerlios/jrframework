/*
 * EstacionBeanInfo.java
 *
 * Created on 19 de febrero de 2005, 14:23
 */

package metro.model;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 *
 * @author  jose
 */
public class EstacionBeanInfo extends SimpleBeanInfo{
    
    /** Creates a new instance of EstacionBeanInfo */
    public EstacionBeanInfo() {
        super();
    }
    
    public PropertyDescriptor[] getPropertyDescriptors() {
       try {
        PropertyDescriptor[] props={
            new PropertyDescriptor("Nombre",Estacion.class,"getNombre","setNombre"),
            new PropertyDescriptor("Superficie",Estacion.class),
            new PropertyDescriptor("LongPasillos",Estacion.class),
            new PropertyDescriptor("LongAndenes",Estacion.class),
            new PropertyDescriptor("Numero Lineas",Estacion.class,"getNumLineas","setNumLineas")
        };
        
        return props;
       }catch(IntrospectionException ex){
           ex.printStackTrace();
           return null;
       }
    }
    
    
}
