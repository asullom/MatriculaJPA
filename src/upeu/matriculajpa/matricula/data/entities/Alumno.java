/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.matriculajpa.matricula.data.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asullom
 */
@Entity
@Table(name = "alumno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a"),
    @NamedQuery(name = "Alumno.findByAlumnoId", query = "SELECT a FROM Alumno a WHERE a.alumnoId = :alumnoId"),
    @NamedQuery(name = "Alumno.findByCodigo", query = "SELECT a FROM Alumno a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Alumno.findByNombre", query = "SELECT a FROM Alumno a WHERE a.nombre = :nombre")})
public class Alumno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "alumno_id")
    private Integer alumnoId;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "nombre")
    private String nombre;

    public Alumno() {
    }

    public Alumno(Integer alumnoId) {
        this.alumnoId = alumnoId;
    }

    public Alumno(Integer alumnoId, String codigo) {
        this.alumnoId = alumnoId;
        this.codigo = codigo;
    }

    public Integer getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Integer alumnoId) {
        this.alumnoId = alumnoId;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alumnoId != null ? alumnoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.alumnoId == null && other.alumnoId != null) || (this.alumnoId != null && !this.alumnoId.equals(other.alumnoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "upeu.matriculajpa.matricula.data.entities.Alumno[ alumnoId=" + alumnoId + " ]";
    }
    
}
