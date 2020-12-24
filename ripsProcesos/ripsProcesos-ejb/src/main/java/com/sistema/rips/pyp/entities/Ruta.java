/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Heidelber
 */
@Entity
@Table(name = "ruta", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ruta.findAll", query = "SELECT r FROM Ruta r")
    , @NamedQuery(name = "Ruta.findByIdRuta", query = "SELECT r FROM Ruta r WHERE r.idRuta = :idRuta")
    , @NamedQuery(name = "Ruta.findByCodRuta", query = "SELECT r FROM Ruta r WHERE r.codRuta = :codRuta")
    , @NamedQuery(name = "Ruta.findByDescrpRuta", query = "SELECT r FROM Ruta r WHERE r.descrpRuta = :descrpRuta")
    , @NamedQuery(name = "Ruta.findBySexo", query = "SELECT r FROM Ruta r WHERE r.sexo = :sexo")
    , @NamedQuery(name = "Ruta.findByEdadini", query = "SELECT r FROM Ruta r WHERE r.edadini = :edadini")
    , @NamedQuery(name = "Ruta.findByEdadfin", query = "SELECT r FROM Ruta r WHERE r.edadfin = :edadfin")
    , @NamedQuery(name = "Ruta.findByCodeps", query = "SELECT r FROM Ruta r WHERE r.codeps = :codeps")
    , @NamedQuery(name = "Ruta.findByPrograma", query = "SELECT r FROM Ruta r WHERE r.programa = :programa")})
public class Ruta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ruta_generator")
    @SequenceGenerator(name="ruta_generator", sequenceName = "sec_ruta", allocationSize=1)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ruta")
    private Long idRuta;
    @Size(max = 5)
    @Column(name = "cod_ruta")
    private String codRuta;
    @Size(max = 255)
    @Column(name = "descrp_ruta")
    private String descrpRuta;
    @Size(max = 1)
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "edadini")
    private Short edadini;
    @Column(name = "edadfin")
    private Short edadfin;
    @Size(max = 10)
    @Column(name = "codeps")
    private String codeps;
    @Size(max = 20)
    @Column(name = "programa")
    private String programa;
    @OneToMany(mappedBy = "idruta")
    private List<Rutadetll> rutadetllList;

    public Ruta() {
    }

    public Ruta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public String getCodRuta() {
        return codRuta;
    }

    public void setCodRuta(String codRuta) {
        this.codRuta = codRuta;
    }

    public String getDescrpRuta() {
        return descrpRuta;
    }

    public void setDescrpRuta(String descrpRuta) {
        this.descrpRuta = descrpRuta;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Short getEdadini() {
        return edadini;
    }

    public void setEdadini(Short edadini) {
        this.edadini = edadini;
    }

    public Short getEdadfin() {
        return edadfin;
    }

    public void setEdadfin(Short edadfin) {
        this.edadfin = edadfin;
    }

    public String getCodeps() {
        return codeps;
    }

    public void setCodeps(String codeps) {
        this.codeps = codeps;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @XmlTransient
    public List<Rutadetll> getRutadetllList() {
        return rutadetllList;
    }

    public void setRutadetllList(List<Rutadetll> rutadetllList) {
        this.rutadetllList = rutadetllList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRuta != null ? idRuta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ruta)) {
            return false;
        }
        Ruta other = (Ruta) object;
        if ((this.idRuta == null && other.idRuta != null) || (this.idRuta != null && !this.idRuta.equals(other.idRuta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.Ruta[ idRuta=" + idRuta + " ]";
    }
    
}
