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
@Table(name = "rips_at", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsAt.findAll", query = "SELECT r FROM RipsAt r")
    , @NamedQuery(name = "RipsAt.findByIdAt", query = "SELECT r FROM RipsAt r WHERE r.idAt = :idAt")
    , @NamedQuery(name = "RipsAt.findByCodipsi", query = "SELECT r FROM RipsAt r WHERE r.codipsi = :codipsi")
    , @NamedQuery(name = "RipsAt.findByTipdoc", query = "SELECT r FROM RipsAt r WHERE r.tipdoc = :tipdoc")
    , @NamedQuery(name = "RipsAt.findByNumaut", query = "SELECT r FROM RipsAt r WHERE r.numaut = :numaut")
    , @NamedQuery(name = "RipsAt.findByTipserv", query = "SELECT r FROM RipsAt r WHERE r.tipserv = :tipserv")
    , @NamedQuery(name = "RipsAt.findByCodserv", query = "SELECT r FROM RipsAt r WHERE r.codserv = :codserv")
    , @NamedQuery(name = "RipsAt.findByNombserv", query = "SELECT r FROM RipsAt r WHERE r.nombserv = :nombserv")
    , @NamedQuery(name = "RipsAt.findByCantd", query = "SELECT r FROM RipsAt r WHERE r.cantd = :cantd")
    , @NamedQuery(name = "RipsAt.findByValorund", query = "SELECT r FROM RipsAt r WHERE r.valorund = :valorund")
    , @NamedQuery(name = "RipsAt.findByVneto", query = "SELECT r FROM RipsAt r WHERE r.vneto = :vneto")})
public class RipsAt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ripsat_generator")
    @SequenceGenerator(name="ripsat_generator", sequenceName = "sec_ripsat", allocationSize=1)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_at")
    private Long idAt;
    @Size(max = 20)
    @Column(name = "codipsi")
    private String codipsi;
    @Size(max = 3)
    @Column(name = "tipdoc")
    private String tipdoc;
    @Size(max = 40)
    @Column(name = "numaut")
    private String numaut;
    @Size(max = 2)
    @Column(name = "tipserv")
    private String tipserv;
    @Size(max = 20)
    @Column(name = "codserv")
    private String codserv;
    @Size(max = 200)
    @Column(name = "nombserv")
    private String nombserv;
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

    public RipsAt() {
    }

    public RipsAt(Long idAt) {
        this.idAt = idAt;
    }

    public Long getIdAt() {
        return idAt;
    }

    public void setIdAt(Long idAt) {
        this.idAt = idAt;
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

    public String getTipserv() {
        return tipserv;
    }

    public void setTipserv(String tipserv) {
        this.tipserv = tipserv;
    }

    public String getCodserv() {
        return codserv;
    }

    public void setCodserv(String codserv) {
        this.codserv = codserv;
    }

    public String getNombserv() {
        return nombserv;
    }

    public void setNombserv(String nombserv) {
        this.nombserv = nombserv;
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
        hash += (idAt != null ? idAt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsAt)) {
            return false;
        }
        RipsAt other = (RipsAt) object;
        if ((this.idAt == null && other.idAt != null) || (this.idAt != null && !this.idAt.equals(other.idAt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsAt[ idAt=" + idAt + " ]";
    }
    
}
