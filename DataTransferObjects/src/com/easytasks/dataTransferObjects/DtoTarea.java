
package com.easytasks.dataTransferObjects;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DtoTarea {
    private Date fechaCreacion;
    private Date fechaLimite;
    private List<DtoRealizable> subtareas;

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public List<DtoRealizable> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<DtoRealizable> Subtareas) {
        this.subtareas = Subtareas;
    }

    public DtoTarea() {
        subtareas = new ArrayList<DtoRealizable>();
    }
}
