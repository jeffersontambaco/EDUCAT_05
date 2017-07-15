/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.educat.dao;

import espe.edu.ec.educat.model.Capacitacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jeffe
 */
@Stateless
public class CapacitacionFacade extends AbstractFacade<Capacitacion> {

    @PersistenceContext(unitName = "ec.edu.espe.edu.conjunta_probar-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CapacitacionFacade() {
        super(Capacitacion.class);
    }
    
}
