/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.educat.service;

import espe.edu.ec.educat.dao.CursoFacade;
import espe.edu.ec.educat.model.Curso;
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
public class CursoService {

   @EJB
    private CursoFacade cursoFacade;

    public List<Curso> obtenerCursos() {
        return this.cursoFacade.findAll();
    }
}
