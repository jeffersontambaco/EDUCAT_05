/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.edu.conjunta;

import espe.edu.ec.educat.model.Curso;
import espe.edu.ec.educat.service.CursoService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author jeffe
 */
@ManagedBean
@ViewScoped
public class CursoBean {
        @EJB
    private CursoService cursoservice;
    private List<Curso> cursos;

    @PostConstruct
    public void inicio() {
        this.cursos = this.cursoservice.obtenerCursos();
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
}
