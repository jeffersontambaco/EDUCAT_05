


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
