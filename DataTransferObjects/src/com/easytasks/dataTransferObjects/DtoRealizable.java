
package com.easytasks.dataTransferObjects;

import java.util.ArrayList;
import java.util.List;

public class DtoRealizable {
    private Long id;
    private String nombre;
    private int prioridad;
    private boolean completado;
    private List<DtoUsuario> listaResponsables;
    private List<DtoEtiqueta> listaEtiquetas;
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public List<DtoUsuario> getListaResponsables() {
        return listaResponsables;
    }

    public void setListaResponsables(List<DtoUsuario> listaResponsables) {
        this.listaResponsables = listaResponsables;
    }

    public List<DtoEtiqueta> getListaEtiquetas() {
        return listaEtiquetas;
    }

    public void setListaEtiquetas(List<DtoEtiqueta> listaEtiquetas) {
        this.listaEtiquetas = listaEtiquetas;
    }
    
    public DtoRealizable() {
        listaEtiquetas = new ArrayList<DtoEtiqueta>();
        listaResponsables = new ArrayList<DtoUsuario>();
    }    
}
