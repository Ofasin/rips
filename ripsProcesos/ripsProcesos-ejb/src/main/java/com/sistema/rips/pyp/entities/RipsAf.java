/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Heidelber
 */
@Entity
@Table(name = "rips_af", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsAf.findAll", query = "SELECT r FROM RipsAf r")
    , @NamedQuery(name = "RipsAf.findByIdFact", query = "SELECT r FROM RipsAf r WHERE r.idFact = :idFact")
    , @NamedQuery(name = "RipsAf.findByCodips", query = "SELECT r FROM RipsAf r WHERE r.codips = :codips")
    , @NamedQuery(name = "RipsAf.findByNomips", query = "SELECT r FROM RipsAf r WHERE r.nomips = :nomips")
    , @NamedQuery(name = "RipsAf.findByTipIde", query = "SELECT r FROM RipsAf r WHERE r.tipIde = :tipIde")
    , @NamedQuery(name = "RipsAf.findByIdent", query = "SELECT r FROM RipsAf r WHERE r.ident = :ident")
    , @NamedQuery(name = "RipsAf.findByNumFact", query = "SELECT r FROM RipsAf r WHERE r.numFact = :numFact")
    , @NamedQuery(name = "RipsAf.findByFecRadc", query = "SELECT r FROM RipsAf r WHERE r.fecRadc = :fecRadc")
    , @NamedQuery(name = "RipsAf.findByFecIni", query = "SELECT r FROM RipsAf r WHERE r.fecIni = :fecIni")
    , @NamedQuery(name = "RipsAf.findByFecFin", query = "SELECT r FROM RipsAf r WHERE r.fecFin = :fecFin")
    , @NamedQuery(name = "RipsAf.findByCodeps", query = "SELECT r FROM RipsAf r WHERE r.codeps = :codeps")
    , @NamedQuery(name = "RipsAf.findByNomeps", query = "SELECT r FROM RipsAf r WHERE r.nomeps = :nomeps")
    , @NamedQuery(name = "RipsAf.findByNumContr", query = "SELECT r FROM RipsAf r WHERE r.numContr = :numContr")
    , @NamedQuery(name = "RipsAf.findByPlanBenf", query = "SELECT r FROM RipsAf r WHERE r.planBenf = :planBenf")
    , @NamedQuery(name = "RipsAf.findByNumPol", query = "SELECT r FROM RipsAf r WHERE r.numPol = :numPol")
    , @NamedQuery(name = "RipsAf.findByCoopg", query = "SELECT r FROM RipsAf r WHERE r.coopg = :coopg")
    , @NamedQuery(name = "RipsAf.findByVlrComs", query = "SELECT r FROM RipsAf r WHERE r.vlrComs = :vlrComs")
    , @NamedQuery(name = "RipsAf.findByVlrDesc", query = "SELECT r FROM RipsAf r WHERE r.vlrDesc = :vlrDesc")
    , @NamedQuery(name = "RipsAf.findByVlrNeto", query = "SELECT r FROM RipsAf r WHERE r.vlrNeto = :vlrNeto")})
public class RipsAf implements Serializable {
     @OneToMany(mappedBy = "cFact", cascade = CascadeType.ALL)
    private List<Frt4505> frt4505List;
     
    @OneToMany(mappedBy = "numfac", cascade = CascadeType.ALL)
    private List<RipsAn> ripsAnList;
    @OneToMany(mappedBy = "numfac", cascade = CascadeType.ALL)
    private List<RipsAm> ripsAmList;
    @OneToMany(mappedBy = "numfac", cascade = CascadeType.ALL)
    private List<RipsAp> ripsApList;
    @OneToMany(mappedBy = "numfac", cascade = CascadeType.ALL)
    private List<RipsAu> ripsAuList;
    @OneToMany(mappedBy = "numfac", cascade = CascadeType.ALL)
    private List<RipsAt> ripsAtList;
    @OneToMany(mappedBy = "numfac", cascade = CascadeType.ALL)
    private List<RipsAd> ripsAdList;
    @OneToMany(mappedBy = "numfac", cascade = CascadeType.ALL)
    private List<RipsAh> ripsAhList;

    private static final long serialVersionUID = 1L;
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ripsaf_generator")
    @SequenceGenerator(name="ripsaf_generator", sequenceName = "sec_ripsaf", allocationSize=1)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_fact")
    private Long idFact;
    @Size(max = 20)
    @Column(name = "codips")
    private String codips;
    @Size(max = 100)
    @Column(name = "nomips")
    private String nomips;
    @Size(max = 5)
    @Column(name = "tip_ide")
    private String tipIde;
    @Size(max = 50)
    @Column(name = "ident")
    private String ident;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "num_fact")
    private String numFact;
    @Column(name = "fec_radc")
    @Temporal(TemporalType.DATE)
    private Date fecRadc;
    @Column(name = "fec_ini")
    @Temporal(TemporalType.DATE)
    private Date fecIni;
    @Column(name = "fec_fin")
    @Temporal(TemporalType.DATE)
    private Date fecFin;
    @Size(max = 10)
    @Column(name = "codeps")
    private String codeps;
    @Size(max = 100)
    @Column(name = "nomeps")
    private String nomeps;
    @Size(max = 50)
    @Column(name = "num_contr")
    private String numContr;
    @Size(max = 50)
    @Column(name = "plan_benf")
    private String planBenf;
    @Size(max = 50)
    @Column(name = "num_pol")
    private String numPol;
    @Size(max = 50)
    @Column(name = "coopg")
    private String coopg;
    @Size(max = 50)
    @Column(name = "vlr_coms")
    private String vlrComs;
    @Size(max = 50)
    @Column(name = "vlr_desc")
    private String vlrDesc;
    @Size(max = 50)
    @Column(name = "vlr_neto")
    private String vlrNeto;
    
    @OneToMany(mappedBy = "numfac", cascade = CascadeType.ALL)
    private List<RipsAc> ripsAcList;

    public RipsAf() {
    }

    public RipsAf(Long idFact) {
        this.idFact = idFact;
    }

    public RipsAf(Long idFact, String numFact) {
        this.idFact = idFact;
        this.numFact = numFact;
    }

    public Long getIdFact() {
        return idFact;
    }

    public void setIdFact(Long idFact) {
        this.idFact = idFact;
    }

    public String getCodips() {
        return codips;
    }

    public void setCodips(String codips) {
        this.codips = codips;
    }

    public String getNomips() {
        return nomips;
    }

    public void setNomips(String nomips) {
        this.nomips = nomips;
    }

    public String getTipIde() {
        return tipIde;
    }

    public void setTipIde(String tipIde) {
        this.tipIde = tipIde;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getNumFact() {
        return numFact;
    }

    public void setNumFact(String numFact) {
        this.numFact = numFact;
    }

    public Date getFecRadc() {
        return fecRadc;
    }

    public void setFecRadc(Date fecRadc) {
        this.fecRadc = fecRadc;
    }

    public Date getFecIni() {
        return fecIni;
    }

    public void setFecIni(Date fecIni) {
        this.fecIni = fecIni;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public String getCodeps() {
        return codeps;
    }

    public void setCodeps(String codeps) {
        this.codeps = codeps;
    }

    public String getNomeps() {
        return nomeps;
    }

    public void setNomeps(String nomeps) {
        this.nomeps = nomeps;
    }

    public String getNumContr() {
        return numContr;
    }

    public void setNumContr(String numContr) {
        this.numContr = numContr;
    }

    public String getPlanBenf() {
        return planBenf;
    }

    public void setPlanBenf(String planBenf) {
        this.planBenf = planBenf;
    }

    public String getNumPol() {
        return numPol;
    }

    public void setNumPol(String numPol) {
        this.numPol = numPol;
    }

    public String getCoopg() {
        return coopg;
    }

    public void setCoopg(String coopg) {
        this.coopg = coopg;
    }

    public String getVlrComs() {
        return vlrComs;
    }

    public void setVlrComs(String vlrComs) {
        this.vlrComs = vlrComs;
    }

    public String getVlrDesc() {
        return vlrDesc;
    }

    public void setVlrDesc(String vlrDesc) {
        this.vlrDesc = vlrDesc;
    }

    public String getVlrNeto() {
        return vlrNeto;
    }

    public void setVlrNeto(String vlrNeto) {
        this.vlrNeto = vlrNeto;
    }

    @XmlTransient
    public List<RipsAc> getRipsAcList() {
        return ripsAcList;
    }

    public void setRipsAcList(List<RipsAc> ripsAcList) {
        this.ripsAcList = ripsAcList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFact != null ? idFact.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsAf)) {
            return false;
        }
        RipsAf other = (RipsAf) object;
        if ((this.idFact == null && other.idFact != null) || (this.idFact != null && !this.idFact.equals(other.idFact))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsAf[ idFact=" + idFact + " ]";
    }

    @XmlTransient
    public List<RipsAn> getRipsAnList() {
        return ripsAnList;
    }

    public void setRipsAnList(List<RipsAn> ripsAnList) {
        this.ripsAnList = ripsAnList;
    }

    @XmlTransient
    public List<RipsAm> getRipsAmList() {
        return ripsAmList;
    }

    public void setRipsAmList(List<RipsAm> ripsAmList) {
        this.ripsAmList = ripsAmList;
    }

    @XmlTransient
    public List<RipsAp> getRipsApList() {
        return ripsApList;
    }

    public void setRipsApList(List<RipsAp> ripsApList) {
        this.ripsApList = ripsApList;
    }

    @XmlTransient
    public List<RipsAu> getRipsAuList() {
        return ripsAuList;
    }

    public void setRipsAuList(List<RipsAu> ripsAuList) {
        this.ripsAuList = ripsAuList;
    }

    @XmlTransient
    public List<RipsAt> getRipsAtList() {
        return ripsAtList;
    }

    public void setRipsAtList(List<RipsAt> ripsAtList) {
        this.ripsAtList = ripsAtList;
    }

    @XmlTransient
    public List<RipsAd> getRipsAdList() {
        return ripsAdList;
    }

    public void setRipsAdList(List<RipsAd> ripsAdList) {
        this.ripsAdList = ripsAdList;
    }

    @XmlTransient
    public List<RipsAh> getRipsAhList() {
        return ripsAhList;
    }

    public void setRipsAhList(List<RipsAh> ripsAhList) {
        this.ripsAhList = ripsAhList;
    }
    
     @XmlTransient
    public List<Frt4505> getFrt4505List() {
        return frt4505List;
    }

    public void setFrt4505List(List<Frt4505> frt4505List) {
        this.frt4505List = frt4505List;
    }
}
