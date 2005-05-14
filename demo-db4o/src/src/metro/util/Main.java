/*
 * Main.java
 *
 * Created on 19 de febrero de 2005, 13:10
 */

package metro.util;

/**
 * Esto es una chapuza para arracar la aplicacion desde una clased de
 * este proyecto.
 * En producción se arrancaría el Main de Swing directamente y las 
 * clases de este proyecto (y los demas) estarían en un .jar en el
 * classpath.
 *
 * @author  jose
 */
public class Main extends com.application.runner.Main2{
    
    /** Creates a new instance of Main */
    public Main() {
        //super("app2.xml", "CasoUso001");
         super("app2.xml");
    }
    
    public static void main(String[] args){
        Main m=new Main();
                //super("app2.xml","CasoUso001");
          }
}
