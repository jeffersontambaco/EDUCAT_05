/*
@(#)CapacitacionAlumnoFacade.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Clase CapacitacionAlumnoFacade generada a partir de la clase de entidad 
 * CapacitacionAlumno
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.CapacitacionAlumno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @version 1.0
 * @author Jefferson Tambaco
 */
@Stateless
public class CapacitacionAlumnoFacade extends AbstractFacade<CapacitacionAlumno> {

    @PersistenceContext(unitName = "ec.edu.espe.edu.conjunta_probar-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CapacitacionAlumnoFacade() {
        super(CapacitacionAlumno.class);
    }
    
}
