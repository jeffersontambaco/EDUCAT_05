/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.edu.conjunta;

import espe.edu.ec.educat.model.Docente;
import espe.edu.ec.educat.service.DocenteService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DocenteBean {
       @EJB
    private DocenteService docenteservice;
    private List<Docente> docentes;
    @PostConstruct
    public void inicio() {
        this.docentes=this.docenteservice.obtenerDocentes();
    }
       public List<Docente> getDocentes() {
        return docentes;
    }
    
}
