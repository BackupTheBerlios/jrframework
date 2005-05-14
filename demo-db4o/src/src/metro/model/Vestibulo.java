/*
 * Vestibulo.java
 *
 * Created on 19 de febrero de 2005, 12:16
 */

package metro.model;

import java.util.ArrayList;

/**
 *
 * @author  jose
 */
public class Vestibulo {
    
    private String nombre;
    private ArrayList maquinas;
    
    /** Creates a new instance of Vestibulo */
    public Vestibulo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList maquinas) {
        this.maquinas = maquinas;
    }
    
}
