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
@Table(name = "rips_ct", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsCt.findAll", query = "SELECT r FROM RipsCt r")
    , @NamedQuery(name = "RipsCt.findByIdCt", query = "SELECT r FROM RipsCt r WHERE r.idCt = :idCt")
    , @NamedQuery(name = "RipsCt.findByNumfac", query = "SELECT r FROM RipsCt r WHERE r.numfac = :numfac")
    , @NamedQuery(name = "RipsCt.findByFecrem", query = "SELECT r FROM RipsCt r WHERE r.fecrem = :fecrem")
    , @NamedQuery(name = "RipsCt.findByNomarch", query = "SELECT r FROM RipsCt r WHERE r.nomarch = :nomarch")
    , @NamedQuery(name = "RipsCt.findByCantdregstr", query = "SELECT r FROM RipsCt r WHERE r.cantdregstr = :cantdregstr")})
public class RipsCt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ct")
    private Long idCt;
    @Size(max = 50)
    @Column(name = "numfac")
    private String numfac;
    @Column(name = "fecrem")
    @Temporal(TemporalType.DATE)
    private Date fecrem;
    @Size(max = 40)
    @Column(name = "nomarch")
    private String nomarch;
    @Size(max = 10)
    @Column(name = "cantdregstr")
    private String cantdregstr;

    public RipsCt() {
    }

    public RipsCt(Long idCt) {
        this.idCt = idCt;
    }

    public Long getIdCt() {
        return idCt;
    }

    public void setIdCt(Long idCt) {
        this.idCt = idCt;
    }

    public String getNumfac() {
        return numfac;
    }

    public void setNumfac(String numfac) {
        this.numfac = numfac;
    }

    public Date getFecrem() {
        return fecrem;
    }

    public void setFecrem(Date fecrem) {
        this.fecrem = fecrem;
    }

    public String getNomarch() {
        return nomarch;
    }

    public void setNomarch(String nomarch) {
        this.nomarch = nomarch;
    }

    public String getCantdregstr() {
        return cantdregstr;
    }

    public void setCantdregstr(String cantdregstr) {
        this.cantdregstr = cantdregstr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCt != null ? idCt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsCt)) {
            return false;
        }
        RipsCt other = (RipsCt) object;
        if ((this.idCt == null && other.idCt != null) || (this.idCt != null && !this.idCt.equals(other.idCt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsCt[ idCt=" + idCt + " ]";
    }
    
}
