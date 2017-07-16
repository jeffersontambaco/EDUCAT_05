/*
 * Entidad que almacena la informacion de alumno en una capacitacion
 */
package espe.edu.ec.educat.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Jefferson Tambaco
 */
@Entity
@Table(name = "capacitacion_alumno")

public class CapacitacionAlumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CapacitacionAlumnoPK capacitacionAlumnoPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "NOTA_FINAL", nullable = false, precision = 4, scale = 2)
    /*
    * Atributo que almacena la nota final que obtuvo un alumno en la capacitacion
    */
    private BigDecimal notaFinal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ESTADO", nullable = false, length = 3)
     /*
    * Atributo que almacena el estado del alumno en la capacitacion, estos 
    * pueden ser: Inscrito,Matriculado,Aprobado, Reprobado y Reprobado por 
    * Faltas (INS-MAT-APR-REP-RPF)
    */
    private String estado;
    @JoinColumn(name = "COD_ALUMNO", referencedColumnName = "COD_ALUMNO", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
     /*
    * Llave primaria que corresponde al codigo del alumno
    */
    private Alumno alumno;
    @JoinColumn(name = "COD_CAPACITACION", referencedColumnName = "COD_CAPACITACION", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    /*
    * Llave primaria que corresponde a capacitacion
    */
    private Capacitacion capacitacion;

    public CapacitacionAlumno() {
    }

    public CapacitacionAlumno(CapacitacionAlumnoPK capacitacionAlumnoPK) {
        this.capacitacionAlumnoPK = capacitacionAlumnoPK;
    }

    public CapacitacionAlumno(CapacitacionAlumnoPK capacitacionAlumnoPK, BigDecimal notaFinal, String estado) {
        this.capacitacionAlumnoPK = capacitacionAlumnoPK;
        this.notaFinal = notaFinal;
        this.estado = estado;
    }

    public CapacitacionAlumno(int codCapacitacion, String codAlumno) {
        this.capacitacionAlumnoPK = new CapacitacionAlumnoPK(codCapacitacion, codAlumno);
    }

    public CapacitacionAlumnoPK getCapacitacionAlumnoPK() {
        return capacitacionAlumnoPK;
    }

    public void setCapacitacionAlumnoPK(CapacitacionAlumnoPK capacitacionAlumnoPK) {
        this.capacitacionAlumnoPK = capacitacionAlumnoPK;
    }

    public BigDecimal getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(BigDecimal notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (capacitacionAlumnoPK != null ? capacitacionAlumnoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CapacitacionAlumno)) {
            return false;
        }
        CapacitacionAlumno other = (CapacitacionAlumno) object;
        if ((this.capacitacionAlumnoPK == null && other.capacitacionAlumnoPK != null) || (this.capacitacionAlumnoPK != null && !this.capacitacionAlumnoPK.equals(other.capacitacionAlumnoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.edu.conjunta.model.CapacitacionAlumno[ capacitacionAlumnoPK=" + capacitacionAlumnoPK + " ]";
    }
    
}
