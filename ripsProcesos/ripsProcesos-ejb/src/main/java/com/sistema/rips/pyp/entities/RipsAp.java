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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
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
@Table(name = "rips_ap", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsAp.findAll", query = "SELECT r FROM RipsAp r")
    , @NamedQuery(name = "RipsAp.findByIdAp", query = "SELECT r FROM RipsAp r WHERE r.idAp = :idAp")
    , @NamedQuery(name = "RipsAp.findByCodipsi", query = "SELECT r FROM RipsAp r WHERE r.codipsi = :codipsi")
    , @NamedQuery(name = "RipsAp.findByTipdoc", query = "SELECT r FROM RipsAp r WHERE r.tipdoc = :tipdoc")
    , @NamedQuery(name = "RipsAp.findByFeccons", query = "SELECT r FROM RipsAp r WHERE r.feccons = :feccons")
    , @NamedQuery(name = "RipsAp.findByNumaut", query = "SELECT r FROM RipsAp r WHERE r.numaut = :numaut")
    , @NamedQuery(name = "RipsAp.findByCodproc", query = "SELECT r FROM RipsAp r WHERE r.codproc = :codproc")
    , @NamedQuery(name = "RipsAp.findByAmbproc", query = "SELECT r FROM RipsAp r WHERE r.ambproc = :ambproc")
    , @NamedQuery(name = "RipsAp.findByFinproc", query = "SELECT r FROM RipsAp r WHERE r.finproc = :finproc")
    , @NamedQuery(name = "RipsAp.findByPersnprocd", query = "SELECT r FROM RipsAp r WHERE r.persnprocd = :persnprocd")
    , @NamedQuery(name = "RipsAp.findByDiagpp", query = "SELECT r FROM RipsAp r WHERE r.diagpp = :diagpp")
    , @NamedQuery(name = "RipsAp.findByDiag1", query = "SELECT r FROM RipsAp r WHERE r.diag1 = :diag1")
    , @NamedQuery(name = "RipsAp.findByCompl", query = "SELECT r FROM RipsAp r WHERE r.compl = :compl")
    , @NamedQuery(name = "RipsAp.findByActoqr", query = "SELECT r FROM RipsAp r WHERE r.actoqr = :actoqr")
    , @NamedQuery(name = "RipsAp.findByVneto", query = "SELECT r FROM RipsAp r WHERE r.vneto = :vneto")})
public class RipsAp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ripsap_generator")
    @SequenceGenerator(name="ripsap_generator", sequenceName = "sec_ripsap", allocationSize=1)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ap")
    private Long idAp;
    @Size(max = 20)
    @Column(name = "codipsi")
    private String codipsi;
    @Size(max = 3)
    @Column(name = "tipdoc")
    private String tipdoc;
    @Column(name = "feccons")
    @Temporal(TemporalType.DATE)
    private Date feccons;
    @Size(max = 40)
    @Column(name = "numaut")
    private String numaut;
    @Size(max = 10)
    @Column(name = "codproc")
    private String codproc;
    @Size(max = 2)
    @Column(name = "ambproc")
    private String ambproc;
    @Size(max = 2)
    @Column(name = "finproc")
    private String finproc;
    @Size(max = 2)
    @Column(name = "persnprocd")
    private String persnprocd;
    @Size(max = 4)
    @Column(name = "diagpp")
    private String diagpp;
    @Size(max = 4)
    @Column(name = "diag1")
    private String diag1;
    @Size(max = 4)
    @Column(name = "compl")
    private String compl;
    @Size(max = 4)
    @Column(name = "actoqr")
    private String actoqr;
    @Size(max = 20)
    @Column(name = "vneto")
    private String vneto;
    @JoinColumn(name = "numfac", referencedColumnName = "num_fact")
    @ManyToOne
    private RipsAf numfac;
    @JoinColumn(name = "documento", referencedColumnName = "documento")
    @ManyToOne
    private RipsUs documento;

    public RipsAp() {
    }

    public RipsAp(Long idAp) {
        this.idAp = idAp;
    }

    public Long getIdAp() {
        return idAp;
    }

    public void setIdAp(Long idAp) {
        this.idAp = idAp;
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

    public Date getFeccons() {
        return feccons;
    }

    public void setFeccons(Date feccons) {
        this.feccons = feccons;
    }

    public String getNumaut() {
        return numaut;
    }

    public void setNumaut(String numaut) {
        this.numaut = numaut;
    }

    public String getCodproc() {
        return codproc;
    }

    public void setCodproc(String codproc) {
        this.codproc = codproc;
    }

    public String getAmbproc() {
        return ambproc;
    }

    public void setAmbproc(String ambproc) {
        this.ambproc = ambproc;
    }

    public String getFinproc() {
        return finproc;
    }

    public void setFinproc(String finproc) {
        this.finproc = finproc;
    }

    public String getPersnprocd() {
        return persnprocd;
    }

    public void setPersnprocd(String persnprocd) {
        this.persnprocd = persnprocd;
    }

    public String getDiagpp() {
        return diagpp;
    }

    public void setDiagpp(String diagpp) {
        this.diagpp = diagpp;
    }

    public String getDiag1() {
        return diag1;
    }

    public void setDiag1(String diag1) {
        this.diag1 = diag1;
    }

    public String getCompl() {
        return compl;
    }

    public void setCompl(String compl) {
        this.compl = compl;
    }

    public String getActoqr() {
        return actoqr;
    }

    public void setActoqr(String actoqr) {
        this.actoqr = actoqr;
    }

    public String getVneto() {
        return vneto;
    }

    public void setVneto(String vneto) {
        this.vneto = vneto;
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
        hash += (idAp != null ? idAp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsAp)) {
            return false;
        }
        RipsAp other = (RipsAp) object;
        if ((this.idAp == null && other.idAp != null) || (this.idAp != null && !this.idAp.equals(other.idAp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsAp[ idAp=" + idAp + " ]";
    }
    
}
