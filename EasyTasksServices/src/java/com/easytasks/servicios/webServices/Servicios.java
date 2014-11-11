
package com.easytasks.servicios.webServices;

import com.easytasks.dataTransferObjects.DtoUsuario;
import com.easytasks.negocio.NegocioSB;
import java.util.Set;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Application;

/**
 *
 * @author alumnoFI
 */
@Stateful
@javax.ws.rs.ApplicationPath("webresources")
public class Servicios extends Application {
    
    @EJB
    private NegocioSB negocio;
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    @Consumes("application/json")
    public void agregarUsuario(DtoUsuario dtoU)
    {
        negocio.agregarUsuario(dtoU);
    }
    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.easytasks.servicios.webServices.GenericResource.class);
    }
    
}
