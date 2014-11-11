
package com.easytasks.dataTransferObjects;

import java.util.ArrayList;
import java.util.List;

public class DtoUsuario {
    private Long id;
    private String nombre;
    private String nombreUsuario;
    private String mail;
    private String contraseña;
    private List<DtoUsuario> contactos;

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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<DtoUsuario> getContactos() {
        return contactos;
    }

    public void setContactos(List<DtoUsuario> contactos) {
        this.contactos = contactos;
    }

    public DtoUsuario() {
        this.contactos = new ArrayList<DtoUsuario>();
    }
}
