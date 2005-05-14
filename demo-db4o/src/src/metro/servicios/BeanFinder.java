/*
 * BeanFinder.java
 *
 * Created on 19 de febrero de 2005, 13:18
 */

package metro.servicios;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.beans.BeanInfo;
import java.beans.MethodDescriptor;
import java.util.ArrayList;
import metro.model.Estacion;

/**
 *
 * @author  jose
 */
public class BeanFinder implements com.application.Servicio {
    
    String DATABASE="/java/database";
    
    String bean;
    MethodDescriptor finder;
    BeanInfo info;
    Object ejbBean;
    
    com.application.Contexto ctx;
    
    public String toString(){
        return "BeanFinder ("+bean+")";
    }
    
    /** Creates a new instance of BeanFinder */
    public BeanFinder() {
        System.out.println("BeanFinder Creado");
    }
    
    public void setContext(com.application.Contexto ctx){
        this.ctx=ctx;
    }
    
    public void setBean(String s){
        bean=s;
    }
    
    public void execute(){
        //  System.out.println("Buscando: en "+bean+" con nombre="+nombre);
         ObjectContainer db=Db4o.openFile(DATABASE);
        
        try{
           // String valor=(String)ctx.get("UnValor");

            Class c=Class.forName(bean);
            Object obj=c.newInstance();
            // buscaria  y dejaria el resultado en el contexto.
            ObjectSet result=db.get(obj);
            System.out.println("Encontrados "+result.size()+" "+bean);
            ctx.put("Clientes",toList(result));
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }catch(InstantiationException ex){
            ex.printStackTrace();
        }catch(IllegalAccessException ex){
            ex.printStackTrace();
        }  finally {
            db.close();
        }
        
    }
    
    
    public ArrayList toList(ObjectSet result){
        ArrayList list=new ArrayList();
        while(result.hasNext()){
                list.add(result.next());
            }
        return list;
    }
}
