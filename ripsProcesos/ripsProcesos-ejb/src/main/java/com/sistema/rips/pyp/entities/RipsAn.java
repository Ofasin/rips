/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Heidelber
 */
@Entity
@Table(name = "rips_an", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsAn.findAll", query = "SELECT r FROM RipsAn r")
    , @NamedQuery(name = "RipsAn.findByIdAn", query = "SELECT r FROM RipsAn r WHERE r.idAn = :idAn")
    , @NamedQuery(name = "RipsAn.findByCodipsi", query = "SELECT r FROM RipsAn r WHERE r.codipsi = :codipsi")
    , @NamedQuery(name = "RipsAn.findByTipdoc", query = "SELECT r FROM RipsAn r WHERE r.tipdoc = :tipdoc")
    , @NamedQuery(name = "RipsAn.findByFecnac", query = "SELECT r FROM RipsAn r WHERE r.fecnac = :fecnac")
    , @NamedQuery(name = "RipsAn.findByHoranac", query = "SELECT r FROM RipsAn r WHERE r.horanac = :horanac")
    , @NamedQuery(name = "RipsAn.findByEdadgest", query = "SELECT r FROM RipsAn r WHERE r.edadgest = :edadgest")
    , @NamedQuery(name = "RipsAn.findByCprentl", query = "SELECT r FROM RipsAn r WHERE r.cprentl = :cprentl")
    , @NamedQuery(name = "RipsAn.findBySexo", query = "SELECT r FROM RipsAn r WHERE r.sexo = :sexo")
    , @NamedQuery(name = "RipsAn.findByPgram", query = "SELECT r FROM RipsAn r WHERE r.pgram = :pgram")
    , @NamedQuery(name = "RipsAn.findByDiagpp", query = "SELECT r FROM RipsAn r WHERE r.diagpp = :diagpp")
    , @NamedQuery(name = "RipsAn.findByCaumrt", query = "SELECT r FROM RipsAn r WHERE r.caumrt = :caumrt")
    , @NamedQuery(name = "RipsAn.findByFecmrt", query = "SELECT r FROM RipsAn r WHERE r.fecmrt = :fecmrt")
    , @NamedQuery(name = "RipsAn.findByHoramrt", query = "SELECT r FROM RipsAn r WHERE r.horamrt = :horamrt")})
public class RipsAn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_an")
    private Long idAn;
    @Size(max = 20)
    @Column(name = "codipsi")
    private String codipsi;
    @Size(max = 3)
    @Column(name = "tipdoc")
    private String tipdoc;
    @Column(name = "fecnac")
    @Temporal(TemporalType.DATE)
    private Date fecnac;
    @Size(max = 10)
    @Column(name = "horanac")
    private String horanac;
    @Size(max = 2)
    @Column(name = "edadgest")
    private String edadgest;
    @Size(max = 2)
    @Column(name = "cprentl")
    private String cprentl;
    @Size(max = 1)
    @Column(name = "sexo")
    private String sexo;
    @Size(max = 50)
    @Column(name = "pgram")
    private String pgram;
    @Size(max = 4)
    @Column(name = "diagpp")
    private String diagpp;
    @Size(max = 2)
    @Column(name = "caumrt")
    private String caumrt;
    @Column(name = "fecmrt")
    @Temporal(TemporalType.DATE)
    private Date fecmrt;
    @Size(max = 10)
    @Column(name = "horamrt")
    private String horamrt;
    @JoinColumn(name = "numfac", referencedColumnName = "num_fact")
    @ManyToOne
    private RipsAf numfac;
    @JoinColumn(name = "documento", referencedColumnName = "documento")
    @ManyToOne
    private RipsUs documento;

    public RipsAn() {
    }

    public RipsAn(Long idAn) {
        this.idAn = idAn;
    }

    public Long getIdAn() {
        return idAn;
    }

    public void setIdAn(Long idAn) {
        this.idAn = idAn;
    }

    public String getCodipsi() {
        return codipsi;
    }

    public void setCodipsi(String codipsi) {
        this.codipsi = codipsi;
    }

    public String getTipdoc() {
        return tipdoc;
    }

    public void setTipdoc(String tipdoc) {
        this.tipdoc = tipdoc;
    }

    public Date getFecnac() {
        return fecnac;
    }

    public void setFecnac(Date fecnac) {
        this.fecnac = fecnac;
    }

    public String getHoranac() {
        return horanac;
    }

    public void setHoranac(String horanac) {
        this.horanac = horanac;
    }

    public String getEdadgest() {
        return edadgest;
    }

    public void setEdadgest(String edadgest) {
        this.edadgest = edadgest;
    }

    public String getCprentl() {
        return cprentl;
    }

    public void setCprentl(String cprentl) {
        this.cprentl = cprentl;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPgram() {
        return pgram;
    }

    public void setPgram(String pgram) {
        this.pgram = pgram;
    }

    public String getDiagpp() {
        return diagpp;
    }

    public void setDiagpp(String diagpp) {
        this.diagpp = diagpp;
    }

    public String getCaumrt() {
        return caumrt;
    }

    public void setCaumrt(String caumrt) {
        this.caumrt = caumrt;
    }

    public Date getFecmrt() {
        return fecmrt;
    }

    public void setFecmrt(Date fecmrt) {
        this.fecmrt = fecmrt;
    }

    public String getHoramrt() {
        return horamrt;
    }

    public void setHoramrt(String horamrt) {
        this.horamrt = horamrt;
    }

    public RipsAf getNumfac() {
        return numfac;
    }

    public void setNumfac(RipsAf numfac) {
        this.numfac = numfac;
    }

    public RipsUs getDocumento() {
        return documento;
    }

    public void setDocumento(RipsUs documento) {
        this.documento = documento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAn != null ? idAn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsAn)) {
            return false;
        }
        RipsAn other = (RipsAn) object;
        if ((this.idAn == null && other.idAn != null) || (this.idAn != null && !this.idAn.equals(other.idAn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsAn[ idAn=" + idAn + " ]";
    }
    
}
