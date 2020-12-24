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
@Table(name = "rips_ah", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsAh.findAll", query = "SELECT r FROM RipsAh r")
    , @NamedQuery(name = "RipsAh.findByIdAh", query = "SELECT r FROM RipsAh r WHERE r.idAh = :idAh")
    , @NamedQuery(name = "RipsAh.findByCodipsi", query = "SELECT r FROM RipsAh r WHERE r.codipsi = :codipsi")
    , @NamedQuery(name = "RipsAh.findByTipdoc", query = "SELECT r FROM RipsAh r WHERE r.tipdoc = :tipdoc")
    , @NamedQuery(name = "RipsAh.findByViaingr", query = "SELECT r FROM RipsAh r WHERE r.viaingr = :viaingr")
    , @NamedQuery(name = "RipsAh.findByFecingr", query = "SELECT r FROM RipsAh r WHERE r.fecingr = :fecingr")
    , @NamedQuery(name = "RipsAh.findByHoraingr", query = "SELECT r FROM RipsAh r WHERE r.horaingr = :horaingr")
    , @NamedQuery(name = "RipsAh.findByNumaut", query = "SELECT r FROM RipsAh r WHERE r.numaut = :numaut")
    , @NamedQuery(name = "RipsAh.findByCauext", query = "SELECT r FROM RipsAh r WHERE r.cauext = :cauext")
    , @NamedQuery(name = "RipsAh.findByDiagppalingr", query = "SELECT r FROM RipsAh r WHERE r.diagppalingr = :diagppalingr")
    , @NamedQuery(name = "RipsAh.findByDiagppalegrs", query = "SELECT r FROM RipsAh r WHERE r.diagppalegrs = :diagppalegrs")
    , @NamedQuery(name = "RipsAh.findByDiag1egrs", query = "SELECT r FROM RipsAh r WHERE r.diag1egrs = :diag1egrs")
    , @NamedQuery(name = "RipsAh.findByDiag2egrs", query = "SELECT r FROM RipsAh r WHERE r.diag2egrs = :diag2egrs")
    , @NamedQuery(name = "RipsAh.findByDiag3egrs", query = "SELECT r FROM RipsAh r WHERE r.diag3egrs = :diag3egrs")
    , @NamedQuery(name = "RipsAh.findByDiagcompl", query = "SELECT r FROM RipsAh r WHERE r.diagcompl = :diagcompl")
    , @NamedQuery(name = "RipsAh.findByFecegrs", query = "SELECT r FROM RipsAh r WHERE r.fecegrs = :fecegrs")
    , @NamedQuery(name = "RipsAh.findByHoraegrs", query = "SELECT r FROM RipsAh r WHERE r.horaegrs = :horaegrs")})
public class RipsAh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ah")
    private Long idAh;
    @Size(max = 20)
    @Column(name = "codipsi")
    private String codipsi;
    @Size(max = 3)
    @Column(name = "tipdoc")
    private String tipdoc;
    @Size(max = 2)
    @Column(name = "viaingr")
    private String viaingr;
    @Column(name = "fecingr")
    @Temporal(TemporalType.DATE)
    private Date fecingr;
    @Size(max = 20)
    @Column(name = "horaingr")
    private String horaingr;
    @Size(max = 40)
    @Column(name = "numaut")
    private String numaut;
    @Size(max = 2)
    @Column(name = "cauext")
    private String cauext;
    @Size(max = 4)
    @Column(name = "diagppalingr")
    private String diagppalingr;
    @Size(max = 4)
    @Column(name = "diagppalegrs")
    private String diagppalegrs;
    @Size(max = 4)
    @Column(name = "diag1egrs")
    private String diag1egrs;
    @Size(max = 4)
    @Column(name = "diag2egrs")
    private String diag2egrs;
    @Size(max = 4)
    @Column(name = "diag3egrs")
    private String diag3egrs;
    @Size(max = 4)
    @Column(name = "diagcompl")
    private String diagcompl;
    @Column(name = "fecegrs")
    @Temporal(TemporalType.DATE)
    private Date fecegrs;
    @Size(max = 20)
    @Column(name = "horaegrs")
    private String horaegrs;
    @JoinColumn(name = "numfac", referencedColumnName = "num_fact")
    @ManyToOne
    private RipsAf numfac;
    @JoinColumn(name = "documento", referencedColumnName = "documento")
    @ManyToOne
    private RipsUs documento;

    public RipsAh() {
    }

    public RipsAh(Long idAh) {
        this.idAh = idAh;
    }

    public Long getIdAh() {
        return idAh;
    }

    public void setIdAh(Long idAh) {
        this.idAh = idAh;
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

    public String getViaingr() {
        return viaingr;
    }

    public void setViaingr(String viaingr) {
        this.viaingr = viaingr;
    }

    public Date getFecingr() {
        return fecingr;
    }

    public void setFecingr(Date fecingr) {
        this.fecingr = fecingr;
    }

    public String getHoraingr() {
        return horaingr;
    }

    public void setHoraingr(String horaingr) {
        this.horaingr = horaingr;
    }

    public String getNumaut() {
        return numaut;
    }

    public void setNumaut(String numaut) {
        this.numaut = numaut;
    }

    public String getCauext() {
        return cauext;
    }

    public void setCauext(String cauext) {
        this.cauext = cauext;
    }

    public String getDiagppalingr() {
        return diagppalingr;
    }

    public void setDiagppalingr(String diagppalingr) {
        this.diagppalingr = diagppalingr;
    }

    public String getDiagppalegrs() {
        return diagppalegrs;
    }

    public void setDiagppalegrs(String diagppalegrs) {
        this.diagppalegrs = diagppalegrs;
    }

    public String getDiag1egrs() {
        return diag1egrs;
    }

    public void setDiag1egrs(String diag1egrs) {
        this.diag1egrs = diag1egrs;
    }

    public String getDiag2egrs() {
        return diag2egrs;
    }

    public void setDiag2egrs(String diag2egrs) {
        this.diag2egrs = diag2egrs;
    }

    public String getDiag3egrs() {
        return diag3egrs;
    }

    public void setDiag3egrs(String diag3egrs) {
        this.diag3egrs = diag3egrs;
    }

    public String getDiagcompl() {
        return diagcompl;
    }

    public void setDiagcompl(String diagcompl) {
        this.diagcompl = diagcompl;
    }

    public Date getFecegrs() {
        return fecegrs;
    }

    public void setFecegrs(Date fecegrs) {
        this.fecegrs = fecegrs;
    }

    public String getHoraegrs() {
        return horaegrs;
    }

    public void setHoraegrs(String horaegrs) {
        this.horaegrs = horaegrs;
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
        hash += (idAh != null ? idAh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsAh)) {
            return false;
        }
        RipsAh other = (RipsAh) object;
        if ((this.idAh == null && other.idAh != null) || (this.idAh != null && !this.idAh.equals(other.idAh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsAh[ idAh=" + idAh + " ]";
    }
    
}
