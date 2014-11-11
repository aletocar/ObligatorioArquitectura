/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.easytasks.negocio;

import com.easytasks.dataTransferObjects.DtoUsuario;
import com.easytasks.persistencia.persistencia.PersistenciaSB;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author alumnoFI
 */
@Stateless
@LocalBean
public class NegocioSB {

    @EJB
    private PersistenciaSB persistencia;
    //podria recibir un dto tambien
    public void agregarUsuario(DtoUsuario dtoU){
        persistencia.guardarUsuario(dtoU);
    }
}
