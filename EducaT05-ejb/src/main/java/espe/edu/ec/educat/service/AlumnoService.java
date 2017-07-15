/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.educat.service;

import espe.edu.ec.educat.dao.AlumnoFacade;
import espe.edu.ec.educat.model.Alumno;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author jeffe
 */
@Stateless
@LocalBean
public class AlumnoService {
   @EJB
    private AlumnoFacade alumnofacade;

    public List<Alumno> obtenerAlumno() {

        return this.alumnofacade.findAll();
    }
}
