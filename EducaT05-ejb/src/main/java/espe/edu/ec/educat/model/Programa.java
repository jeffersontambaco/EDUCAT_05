/*
@(#)ProgramaCursoPK.java     1.0 02/07/2017
*
*Copyright 2017 Grupo_05 All rights reserved.
*Grupo_05 Propietary. Use is subject to license terms
 * The MIT License
 *
 * 
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 **/
/**
 * Entidad que almacena la información de los Programas que tiene el instituto.
 */

package espe.edu.ec.educat.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @version 1.0
 * @author Alejandro Torres
 */
@Entity
@Table(name = "programa")
@NamedQueries({
    @NamedQuery(name = "Programa.findAll", query = "SELECT p FROM Programa p")})
public class Programa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "COD_PROGRAMA", nullable = false, length = 8)
    /*
    * llave primaria de 8 caracteres que identifica al programa que ofrece el 
    * instituto
    */
    private String codPrograma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE", nullable = false, length = 100)
    /*
    * atributo que almacena el nombre del programa que ofrece el instituto
    */
    private String nombre;
    @Size(max = 4000)
    @Column(name = "DESCRIPCION", length = 4000)
    /*
    * atributo que almacena una breve descripcion del programa
    */
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DURACION", nullable = false)
    /*
    * atributo que almacena la duracion del programa en horas
    */
    private short duracion;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.DATE)
    /*
    * Atributo que almacena la informacion de la fecha en la que inicio el 
    * programa
    */
    private Date fechaInicio;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.DATE)
    /*
    * Atributo que almacena la fecha en la que el programa ha terminado
    */
    private Date fechaFin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programa")
    private List<ProgramaCurso> programaCursoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "programa")
    private List<ProgramaAlumno> programaAlumnoList;

    public Programa() {
    }

    public Programa(String codPrograma) {
        this.codPrograma = codPrograma;
    }

    public Programa(String codPrograma, String nombre, short duracion) {
        this.codPrograma = codPrograma;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getCodPrograma() {
        return codPrograma;
    }

    public void setCodPrograma(String codPrograma) {
        this.codPrograma = codPrograma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getDuracion() {
        return duracion;
    }

    public void setDuracion(short duracion) {
        this.duracion = duracion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<ProgramaCurso> getProgramaCursoList() {
        return programaCursoList;
    }

    public void setProgramaCursoList(List<ProgramaCurso> programaCursoList) {
        this.programaCursoList = programaCursoList;
    }

    public List<ProgramaAlumno> getProgramaAlumnoList() {
        return programaAlumnoList;
    }

    public void setProgramaAlumnoList(List<ProgramaAlumno> programaAlumnoList) {
        this.programaAlumnoList = programaAlumnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPrograma != null ? codPrograma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Programa)) {
            return false;
        }
        Programa other = (Programa) object;
        if ((this.codPrograma == null && other.codPrograma != null) || (this.codPrograma != null && !this.codPrograma.equals(other.codPrograma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.edu.conjunta.model.Programa[ codPrograma=" + codPrograma + " ]";
    }
    
}
