/*
 * Maquina.java
 *
 * Created on 19 de febrero de 2005, 12:16
 */

package metro.model;

import java.util.Date;

/**
 *
 * @author  jose
 */
public class Maquina {
    
    private int id;
    private String modelo;
    private Date  fechaInstalacion;
    private Date  fechaUltRevision;
    private int   operaciones;
    
    /** Creates a new instance of Maquina */
    public Maquina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(Date fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }

    public Date getFechaUltRevision() {
        return fechaUltRevision;
    }

    public void setFechaUltRevision(Date fechaUltRevision) {
        this.fechaUltRevision = fechaUltRevision;
    }

    public int getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(int operaciones) {
        this.operaciones = operaciones;
    }
    
}
