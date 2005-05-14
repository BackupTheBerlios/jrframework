/*
 * Populate.java
 *
 * Created on 19 de febrero de 2005, 12:24
 */

package metro.util;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import metro.model.Estacion;
import metro.model.Maquina;
import metro.model.Vestibulo;

/**
 * Clase de utilidad para rellenar la base de datos.
 *
 * @author  jose
 */
public class Populate {
    
    String DATABASE="database";
    
    String[] estaciones={"Sol", "Avenida de America", "Bilbao", "Opera",
    "Banco","Conde de Casal","San Bernardo"};
    
    String[] mm={"SIEMENS-E34","GE3456","XX-6456"};
    int cont=0;
    
    int maxVestibulos=3;
    int maxMaquinas=5;
    
static     Random random=new Random();
    
    /** Creates a new instance of Populate */
    public Populate() {
        ObjectContainer db=Db4o.openFile(DATABASE);
        try {
            for(int i=0;i<estaciones.length;i++){
                Estacion e=creaEstacion(i);
                db.set(e);
            }
            
            // do something with db4o
        }
        finally {
            db.close();
        }
    }
    
    public static void main(String[]args){
       Populate p=new Populate();        
       
    }
    
    Estacion creaEstacion(int id){
        Estacion e=new Estacion();
        e.setNombre(estaciones[id]);
        e.setSuperficie(rand(200,400));
        e.setNumLineas(rand(1,4));
        e.setLongPasillos(rand(300,500));
        e.setLongAndenes(rand(300,500));
        int nVest=rand(1,maxVestibulos);
        ArrayList lista=new ArrayList(nVest);
        for(int i=0;i<nVest;i++){
            Vestibulo v=creaVest(estaciones[id],i);
            lista.add(v);
        }
        e.setVestibulos(lista);
        return e;
    }
    
    Vestibulo creaVest(String nEst,int id){
        Vestibulo v=new Vestibulo();
        v.setNombre(nEst+id);
        int nMaq=rand(1,maxMaquinas);
        ArrayList lista=new ArrayList(nMaq);
        for(int i=0;i<nMaq;i++){
            Maquina m=creaMaquina();
            lista.add(m);
        }
        v.setMaquinas(lista);
        
        return v;
    }
    
    Maquina creaMaquina(){
        Maquina m=new Maquina();
        m.setId(cont++);
        m.setModelo(mm[rand(0,mm.length)]);
        m.setOperaciones(rand(5000,30000));
        return m;
    }
    
    static int rand(int min,int max){
        int n= (random.nextInt()%(max-min))+min;
        return (n>0? n: -n );
    }
    
    long rand(long min,long max){
        long n= (random.nextLong()%(max-min))+min;
        return (n>0? n: -n );
    }
    
    Date rand(Date min,Date max){
        long d1=min.getTime();
        long d2=min.getTime();
        return new Date(rand(d1,d2));
    }
    
}
