/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Heidelber
 */
@Entity
@Table(name = "rips_ad", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsAd.findAll", query = "SELECT r FROM RipsAd r")
    , @NamedQuery(name = "RipsAd.findById", query = "SELECT r FROM RipsAd r WHERE r.id = :id")
    , @NamedQuery(name = "RipsAd.findByCodipsi", query = "SELECT r FROM RipsAd r WHERE r.codipsi = :codipsi")
    , @NamedQuery(name = "RipsAd.findByCodcoco", query = "SELECT r FROM RipsAd r WHERE r.codcoco = :codcoco")
    , @NamedQuery(name = "RipsAd.findByCtd", query = "SELECT r FROM RipsAd r WHERE r.ctd = :ctd")
    , @NamedQuery(name = "RipsAd.findByValorund", query = "SELECT r FROM RipsAd r WHERE r.valorund = :valorund")
    , @NamedQuery(name = "RipsAd.findByVneto", query = "SELECT r FROM RipsAd r WHERE r.vneto = :vneto")})
public class RipsAd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Long id;
    @Size(max = 20)
    @Column(name = "codipsi")
    private String codipsi;
    @Size(max = 10)
    @Column(name = "codcoco")
    private String codcoco;
    @Size(max = 20)
    @Column(name = "ctd")
    private String ctd;
    @Size(max = 20)
    @Column(name = "valorund")
    private String valorund;
    @Size(max = 20)
    @Column(name = "vneto")
    private String vneto;
    @JoinColumn(name = "numfac", referencedColumnName = "num_fact")
    @ManyToOne
    private RipsAf numfac;

    public RipsAd() {
    }

    public RipsAd(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodipsi() {
        return codipsi;
    }

    public void setCodipsi(String codipsi) {
        this.codipsi = codipsi;
    }

    public String getCodcoco() {
        return codcoco;
    }

    public void setCodcoco(String codcoco) {
        this.codcoco = codcoco;
    }

    public String getCtd() {
        return ctd;
    }

    public void setCtd(String ctd) {
        this.ctd = ctd;
    }

    public String getValorund() {
        return valorund;
    }

    public void setValorund(String valorund) {
        this.valorund = valorund;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsAd)) {
            return false;
        }
        RipsAd other = (RipsAd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsAd[ id=" + id + " ]";
    }
    
}
