/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "rips_ac", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsAc.findAll", query = "SELECT r FROM RipsAc r")
    , @NamedQuery(name = "RipsAc.findByIdCons", query = "SELECT r FROM RipsAc r WHERE r.idCons = :idCons")
    , @NamedQuery(name = "RipsAc.findByCodipsi", query = "SELECT r FROM RipsAc r WHERE r.codipsi = :codipsi")
    , @NamedQuery(name = "RipsAc.findByTipdoc", query = "SELECT r FROM RipsAc r WHERE r.tipdoc = :tipdoc")
    , @NamedQuery(name = "RipsAc.findByFeccons", query = "SELECT r FROM RipsAc r WHERE r.feccons = :feccons")
    , @NamedQuery(name = "RipsAc.findByNumaut", query = "SELECT r FROM RipsAc r WHERE r.numaut = :numaut")
    , @NamedQuery(name = "RipsAc.findByCodcons", query = "SELECT r FROM RipsAc r WHERE r.codcons = :codcons")
    , @NamedQuery(name = "RipsAc.findByFincons", query = "SELECT r FROM RipsAc r WHERE r.fincons = :fincons")
    , @NamedQuery(name = "RipsAc.findByCauextcons", query = "SELECT r FROM RipsAc r WHERE r.cauextcons = :cauextcons")
    , @NamedQuery(name = "RipsAc.findByDiagppal", query = "SELECT r FROM RipsAc r WHERE r.diagppal = :diagppal")
    , @NamedQuery(name = "RipsAc.findByDiag1", query = "SELECT r FROM RipsAc r WHERE r.diag1 = :diag1")
    , @NamedQuery(name = "RipsAc.findByDiag2", query = "SELECT r FROM RipsAc r WHERE r.diag2 = :diag2")
    , @NamedQuery(name = "RipsAc.findByDiag3", query = "SELECT r FROM RipsAc r WHERE r.diag3 = :diag3")
    , @NamedQuery(name = "RipsAc.findByTipdiag", query = "SELECT r FROM RipsAc r WHERE r.tipdiag = :tipdiag")
    , @NamedQuery(name = "RipsAc.findByValor", query = "SELECT r FROM RipsAc r WHERE r.valor = :valor")
    , @NamedQuery(name = "RipsAc.findByCoopag", query = "SELECT r FROM RipsAc r WHERE r.coopag = :coopag")
    , @NamedQuery(name = "RipsAc.findByVneto", query = "SELECT r FROM RipsAc r WHERE r.vneto = :vneto")})
public class RipsAc implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ripsac_generator")
    @SequenceGenerator(name="ripsac_generator", sequenceName = "sec_ripsac", allocationSize=1)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_cons")
    private Long idCons;
    
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
    @Column(name = "codcons")
    private String codcons;
    
    @Size(max = 2)
    @Column(name = "fincons")
    private String fincons;
    
    @Size(max = 2)
    @Column(name = "cauextcons")
    private String cauextcons;
    
    @Size(max = 4)
    @Column(name = "diagppal")
    private String diagppal;
    
    @Size(max = 4)
    @Column(name = "diag1")
    private String diag1;
    
    @Size(max = 4)
    @Column(name = "diag2")
    private String diag2;
    
    @Size(max = 4)
    @Column(name = "diag3")
    private String diag3;
    
    @Size(max = 4)
    @Column(name = "tipdiag")
    private String tipdiag;
    
    @Size(max = 20)
    @Column(name = "valor")
    private String valor;
    
    @Size(max = 20)
    @Column(name = "coopag")
    private String coopag;
    
    @Size(max = 20)
    @Column(name = "vneto")
    private String vneto;
    
    @JoinColumn(name = "numfac", referencedColumnName = "num_fact")
    @ManyToOne
    private RipsAf numfac;
    
    @JoinColumn(name = "documento", referencedColumnName = "documento")
    @ManyToOne
    private RipsUs documento;

    public RipsAc() {
    }

    public RipsAc(Long idCons) {
        this.idCons = idCons;
    }

    public Long getIdCons() {
        return idCons;
    }

    public void setIdCons(Long idCons) {
        this.idCons = idCons;
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

    public String getCodcons() {
        return codcons;
    }

    public void setCodcons(String codcons) {
        this.codcons = codcons;
    }

    public String getFincons() {
        return fincons;
    }

    public void setFincons(String fincons) {
        this.fincons = fincons;
    }

    public String getCauextcons() {
        return cauextcons;
    }

    public void setCauextcons(String cauextcons) {
        this.cauextcons = cauextcons;
    }

    public String getDiagppal() {
        return diagppal;
    }

    public void setDiagppal(String diagppal) {
        this.diagppal = diagppal;
    }

    public String getDiag1() {
        return diag1;
    }

    public void setDiag1(String diag1) {
        this.diag1 = diag1;
    }

    public String getDiag2() {
        return diag2;
    }

    public void setDiag2(String diag2) {
        this.diag2 = diag2;
    }

    public String getDiag3() {
        return diag3;
    }

    public void setDiag3(String diag3) {
        this.diag3 = diag3;
    }

    public String getTipdiag() {
        return tipdiag;
    }

    public void setTipdiag(String tipdiag) {
        this.tipdiag = tipdiag;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCoopag() {
        return coopag;
    }

    public void setCoopag(String coopag) {
        this.coopag = coopag;
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
        hash += (idCons != null ? idCons.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsAc)) {
            return false;
        }
        RipsAc other = (RipsAc) object;
        if ((this.idCons == null && other.idCons != null) || (this.idCons != null && !this.idCons.equals(other.idCons))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsAc[ idCons=" + idCons + " ]";
    }
    
}
