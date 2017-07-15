/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.edu.conjunta;

import espe.edu.ec.educat.model.Alumno;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;



import espe.edu.ec.educat.service.AlumnoService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

public class IndexBean {

    @EJB
    private AlumnoService alumnoService;
    private List<Alumno> alumnos;

    @PostConstruct
    public void inicio() {
        this.alumnos = this.alumnoService.obtenerAlumno();
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

}
