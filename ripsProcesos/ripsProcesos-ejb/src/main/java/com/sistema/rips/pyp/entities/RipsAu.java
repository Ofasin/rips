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
@Table(name = "rips_au", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsAu.findAll", query = "SELECT r FROM RipsAu r")
    , @NamedQuery(name = "RipsAu.findByIdAu", query = "SELECT r FROM RipsAu r WHERE r.idAu = :idAu")
    , @NamedQuery(name = "RipsAu.findByCodipsi", query = "SELECT r FROM RipsAu r WHERE r.codipsi = :codipsi")
    , @NamedQuery(name = "RipsAu.findByTipdoc", query = "SELECT r FROM RipsAu r WHERE r.tipdoc = :tipdoc")
    , @NamedQuery(name = "RipsAu.findByFecingr", query = "SELECT r FROM RipsAu r WHERE r.fecingr = :fecingr")
    , @NamedQuery(name = "RipsAu.findByHoraingr", query = "SELECT r FROM RipsAu r WHERE r.horaingr = :horaingr")
    , @NamedQuery(name = "RipsAu.findByNumaut", query = "SELECT r FROM RipsAu r WHERE r.numaut = :numaut")
    , @NamedQuery(name = "RipsAu.findByCauext", query = "SELECT r FROM RipsAu r WHERE r.cauext = :cauext")
    , @NamedQuery(name = "RipsAu.findByDiagppalegrs", query = "SELECT r FROM RipsAu r WHERE r.diagppalegrs = :diagppalegrs")
    , @NamedQuery(name = "RipsAu.findByDiag1egrs", query = "SELECT r FROM RipsAu r WHERE r.diag1egrs = :diag1egrs")
    , @NamedQuery(name = "RipsAu.findByDiag2egrs", query = "SELECT r FROM RipsAu r WHERE r.diag2egrs = :diag2egrs")
    , @NamedQuery(name = "RipsAu.findByDiag3egrs", query = "SELECT r FROM RipsAu r WHERE r.diag3egrs = :diag3egrs")
    , @NamedQuery(name = "RipsAu.findByDestegrs", query = "SELECT r FROM RipsAu r WHERE r.destegrs = :destegrs")
    , @NamedQuery(name = "RipsAu.findByEstdegrs", query = "SELECT r FROM RipsAu r WHERE r.estdegrs = :estdegrs")
    , @NamedQuery(name = "RipsAu.findByDiagmrt", query = "SELECT r FROM RipsAu r WHERE r.diagmrt = :diagmrt")
    , @NamedQuery(name = "RipsAu.findByFecegrs", query = "SELECT r FROM RipsAu r WHERE r.fecegrs = :fecegrs")
    , @NamedQuery(name = "RipsAu.findByHoraegrs", query = "SELECT r FROM RipsAu r WHERE r.horaegrs = :horaegrs")})
public class RipsAu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_au")
    private Long idAu;
    @Size(max = 20)
    @Column(name = "codipsi")
    private String codipsi;
    @Size(max = 3)
    @Column(name = "tipdoc")
    private String tipdoc;
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
    @Size(max = 40)
    @Column(name = "destegrs")
    private String destegrs;
    @Size(max = 40)
    @Column(name = "estdegrs")
    private String estdegrs;
    @Size(max = 4)
    @Column(name = "diagmrt")
    private String diagmrt;
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

    public RipsAu() {
    }

    public RipsAu(Long idAu) {
        this.idAu = idAu;
    }

    public Long getIdAu() {
        return idAu;
    }

    public void setIdAu(Long idAu) {
        this.idAu = idAu;
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

    public String getDestegrs() {
        return destegrs;
    }

    public void setDestegrs(String destegrs) {
        this.destegrs = destegrs;
    }

    public String getEstdegrs() {
        return estdegrs;
    }

    public void setEstdegrs(String estdegrs) {
        this.estdegrs = estdegrs;
    }

    public String getDiagmrt() {
        return diagmrt;
    }

    public void setDiagmrt(String diagmrt) {
        this.diagmrt = diagmrt;
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
        hash += (idAu != null ? idAu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsAu)) {
            return false;
        }
        RipsAu other = (RipsAu) object;
        if ((this.idAu == null && other.idAu != null) || (this.idAu != null && !this.idAu.equals(other.idAu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsAu[ idAu=" + idAu + " ]";
    }
    
}
