/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.easytasks.persistencia.persistencia;

import com.easytasks.dataTransferObjects.DtoUsuario;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alumnoFI
 */
@Stateless
@LocalBean
public class PersistenciaSB {

    @PersistenceContext
    private EntityManager em;
    
    //NO PONER EN ESTE SESSION BEAN LOS METODOS PARA EL MANTENIMIENTO DE TODAS LAS ENTIDADES. POR EJEMPLO, PONER SOLO DE USUARIOS
    //Y PROYECTOS. EN OTRO PONER PARA GUARDAR TAREAS Y ACTIVIDADES Y OTRO CONTEXTOS Y ETIQUETAS
    
    public void guardarUsuario(DtoUsuario u){
        //Usuario u deberia guardar, osea que tengo que transformar el Dto recibido en la entididad
        em.persist(u);
    }
}
