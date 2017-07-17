/*
 * The MIT License
 *
 * Copyright 2017 Jonathan.
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
 */


package espe.edu.ec.educat.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author diegoyandun
 */
@Entity
@Table(name = "programa_curso")
@NamedQueries({
    @NamedQuery(name = "ProgramaCurso.findAll", query = "SELECT p FROM ProgramaCurso p")})
public class ProgramaCurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
   
    protected ProgramaCursoPK programaCursoPK;
     /**
     * Atributo que almacena el orden del curso en un programa
     */
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDEN", nullable = false)
    private short orden;
    /**
     * Atributo que almacena el estado de un programa, 
     * este puede ser activo o inactivo (ACT - INA)
     */
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;
    /**
     * Llave primaria, foránea de 8 caracteres que hereda de la Tabla Curso 
     */
    @JoinColumn(name = "COD_CURSO", referencedColumnName = "COD_CURSO", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Curso curso;
    /**
     * Llave primaria, foránea de 8 caracteres que hereda de la Tabla Programa
     */
    @JoinColumn(name = "COD_PROGRAMA", referencedColumnName = "COD_PROGRAMA", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Programa programa;

    public ProgramaCurso() {
    }

    public ProgramaCurso(ProgramaCursoPK programaCursoPK) {
        this.programaCursoPK = programaCursoPK;
    }

    public ProgramaCurso(ProgramaCursoPK programaCursoPK, short orden, String estado) {
        this.programaCursoPK = programaCursoPK;
        this.orden = orden;
        this.estado = estado;
    }

    public ProgramaCurso(String codPrograma, String codCurso) {
        this.programaCursoPK = new ProgramaCursoPK(codPrograma, codCurso);
    }

    public ProgramaCursoPK getProgramaCursoPK() {
        return programaCursoPK;
    }

    public void setProgramaCursoPK(ProgramaCursoPK programaCursoPK) {
        this.programaCursoPK = programaCursoPK;
    }

    public short getOrden() {
        return orden;
    }

    public void setOrden(short orden) {
        this.orden = orden;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programaCursoPK != null ? programaCursoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramaCurso)) {
            return false;
        }
        ProgramaCurso other = (ProgramaCurso) object;
        if ((this.programaCursoPK == null && other.programaCursoPK != null) || (this.programaCursoPK != null && !this.programaCursoPK.equals(other.programaCursoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.edu.conjunta.model.ProgramaCurso[ programaCursoPK=" + programaCursoPK + " ]";
    }
    
}
