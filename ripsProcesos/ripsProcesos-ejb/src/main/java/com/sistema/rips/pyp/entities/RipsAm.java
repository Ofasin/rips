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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Heidelber
 */
@Entity
@Table(name = "rips_am", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsAm.findAll", query = "SELECT r FROM RipsAm r")
    , @NamedQuery(name = "RipsAm.findByIdAm", query = "SELECT r FROM RipsAm r WHERE r.idAm = :idAm")
    , @NamedQuery(name = "RipsAm.findByCodipsi", query = "SELECT r FROM RipsAm r WHERE r.codipsi = :codipsi")
    , @NamedQuery(name = "RipsAm.findByTipdoc", query = "SELECT r FROM RipsAm r WHERE r.tipdoc = :tipdoc")
    , @NamedQuery(name = "RipsAm.findByNumaut", query = "SELECT r FROM RipsAm r WHERE r.numaut = :numaut")
    , @NamedQuery(name = "RipsAm.findByCodmedct", query = "SELECT r FROM RipsAm r WHERE r.codmedct = :codmedct")
    , @NamedQuery(name = "RipsAm.findByTipmedct", query = "SELECT r FROM RipsAm r WHERE r.tipmedct = :tipmedct")
    , @NamedQuery(name = "RipsAm.findByNomgenmedct", query = "SELECT r FROM RipsAm r WHERE r.nomgenmedct = :nomgenmedct")
    , @NamedQuery(name = "RipsAm.findByFormfarmmedct", query = "SELECT r FROM RipsAm r WHERE r.formfarmmedct = :formfarmmedct")
    , @NamedQuery(name = "RipsAm.findByConctrmedct", query = "SELECT r FROM RipsAm r WHERE r.conctrmedct = :conctrmedct")
    , @NamedQuery(name = "RipsAm.findByUndmedct", query = "SELECT r FROM RipsAm r WHERE r.undmedct = :undmedct")
    , @NamedQuery(name = "RipsAm.findByCantd", query = "SELECT r FROM RipsAm r WHERE r.cantd = :cantd")
    , @NamedQuery(name = "RipsAm.findByValorund", query = "SELECT r FROM RipsAm r WHERE r.valorund = :valorund")
    , @NamedQuery(name = "RipsAm.findByVneto", query = "SELECT r FROM RipsAm r WHERE r.vneto = :vneto")})
public class RipsAm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ripsam_generator")
    @SequenceGenerator(name="ripsam_generator", sequenceName = "sec_ripsam", allocationSize=1)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_am")
    private Long idAm;
    @Size(max = 20)
    @Column(name = "codipsi")
    private String codipsi;
    @Size(max = 3)
    @Column(name = "tipdoc")
    private String tipdoc;
    @Size(max = 40)
    @Column(name = "numaut")
    private String numaut;
    @Size(max = 40)
    @Column(name = "codmedct")
    private String codmedct;
    @Size(max = 2)
    @Column(name = "tipmedct")
    private String tipmedct;
    @Size(max = 200)
    @Column(name = "nomgenmedct")
    private String nomgenmedct;
    @Size(max = 50)
    @Column(name = "formfarmmedct")
    private String formfarmmedct;
    @Size(max = 50)
    @Column(name = "conctrmedct")
    private String conctrmedct;
    @Size(max = 50)
    @Column(name = "undmedct")
    private String undmedct;
    @Size(max = 20)
    @Column(name = "cantd")
    private String cantd;
    @Size(max = 20)
    @Column(name = "valorund")
    private String valorund;
    @Size(max = 20)
    @Column(name = "vneto")
    private String vneto;
    @JoinColumn(name = "numfac", referencedColumnName = "num_fact")
    @ManyToOne
    private RipsAf numfac;
    @JoinColumn(name = "documento", referencedColumnName = "documento")
    @ManyToOne
    private RipsUs documento;

    public RipsAm() {
    }

    public RipsAm(Long idAm) {
        this.idAm = idAm;
    }

    public Long getIdAm() {
        return idAm;
    }

    public void setIdAm(Long idAm) {
        this.idAm = idAm;
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

    public String getNumaut() {
        return numaut;
    }

    public void setNumaut(String numaut) {
        this.numaut = numaut;
    }

    public String getCodmedct() {
        return codmedct;
    }

    public void setCodmedct(String codmedct) {
        this.codmedct = codmedct;
    }

    public String getTipmedct() {
        return tipmedct;
    }

    public void setTipmedct(String tipmedct) {
        this.tipmedct = tipmedct;
    }

    public String getNomgenmedct() {
        return nomgenmedct;
    }

    public void setNomgenmedct(String nomgenmedct) {
        this.nomgenmedct = nomgenmedct;
    }

    public String getFormfarmmedct() {
        return formfarmmedct;
    }

    public void setFormfarmmedct(String formfarmmedct) {
        this.formfarmmedct = formfarmmedct;
    }

    public String getConctrmedct() {
        return conctrmedct;
    }

    public void setConctrmedct(String conctrmedct) {
        this.conctrmedct = conctrmedct;
    }

    public String getUndmedct() {
        return undmedct;
    }

    public void setUndmedct(String undmedct) {
        this.undmedct = undmedct;
    }

    public String getCantd() {
        return cantd;
    }

    public void setCantd(String cantd) {
        this.cantd = cantd;
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

    public RipsUs getDocumento() {
        return documento;
    }

    public void setDocumento(RipsUs documento) {
        this.documento = documento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAm != null ? idAm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsAm)) {
            return false;
        }
        RipsAm other = (RipsAm) object;
        if ((this.idAm == null && other.idAm != null) || (this.idAm != null && !this.idAm.equals(other.idAm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsAm[ idAm=" + idAm + " ]";
    }
    
}
