/*
 * Estacion.java
 *
 * Created on 19 de febrero de 2005, 12:16
 */

package metro.model;

import java.util.ArrayList;

/**
 *
 * @author  jose
 */
public class Estacion {
    
    private String nombre;
    private int superficie;
    private int numLineas;
    private int longPasillos;
    private int longAndenes;
    private ArrayList vestibulos;
    
    /** Creates a new instance of Estacion */
    public Estacion() {
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getSuperficie() {
        return superficie;
    }
    
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    
    public int getNumLineas() {
        return numLineas;
    }
    
    public void setNumLineas(int numLineas) {
        this.numLineas = numLineas;
    }
    
    public int getLongPasillos() {
        return longPasillos;
    }
    
    public void setLongPasillos(int longPasillos) {
        this.longPasillos = longPasillos;
    }
    
    public int getLongAndenes() {
        return longAndenes;
    }
    
    public void setLongAndenes(int longAndenes) {
        this.longAndenes = longAndenes;
    }

    public ArrayList getVestibulos() {
        return vestibulos;
    }

    public void setVestibulos(ArrayList vestibulos) {
        this.vestibulos = vestibulos;
    }
    
}
