/*
 * TiposMoneda.java
 *
 * Created on 24 de abril de 2005, 23:53
 */

package metro.model;

/**
 *
 * @author jose
 */
public class TiposMoneda {
    
    private String tipoMoneda;
    private float  valor;
    private boolean reparto;
    private boolean billete;
    
    /** Creates a new instance of TiposMoneda */
    public TiposMoneda() {
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isReparto() {
        return reparto;
    }

    public void setReparto(boolean reparto) {
        this.reparto = reparto;
    }

    public boolean isBillete() {
        return billete;
    }

    public void setBillete(boolean billete) {
        this.billete = billete;
    }
    
}
