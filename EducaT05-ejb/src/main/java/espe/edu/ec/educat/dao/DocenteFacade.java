/*
@(#)CursoFacade.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
*/
/**
 *Clase DocenteFacade generada a partir de la clase de entidad 
 * Docente
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.Docente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @version 1.0
 * @author Alejandro Torres
 */
@Stateless
public class DocenteFacade extends AbstractFacade<Docente> {

    @PersistenceContext(unitName = "ec.edu.espe.edu.conjunta_probar-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DocenteFacade() {
        super(Docente.class);
    }
    
}
