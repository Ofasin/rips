/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "rips_us", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsUs.findAll", query = "SELECT r FROM RipsUs r")
    , @NamedQuery(name = "RipsUs.findByIdUs", query = "SELECT r FROM RipsUs r WHERE r.idUs = :idUs")
    , @NamedQuery(name = "RipsUs.findByTipdoc", query = "SELECT r FROM RipsUs r WHERE r.tipdoc = :tipdoc")
    , @NamedQuery(name = "RipsUs.findByDocumento", query = "SELECT r FROM RipsUs r WHERE r.documento = :documento")
    , @NamedQuery(name = "RipsUs.findByCodeps", query = "SELECT r FROM RipsUs r WHERE r.codeps = :codeps")
    , @NamedQuery(name = "RipsUs.findByTipUsu", query = "SELECT r FROM RipsUs r WHERE r.tipUsu = :tipUsu")
    , @NamedQuery(name = "RipsUs.findByApellido1", query = "SELECT r FROM RipsUs r WHERE r.apellido1 = :apellido1")
    , @NamedQuery(name = "RipsUs.findByApellido2", query = "SELECT r FROM RipsUs r WHERE r.apellido2 = :apellido2")
    , @NamedQuery(name = "RipsUs.findByNombre1", query = "SELECT r FROM RipsUs r WHERE r.nombre1 = :nombre1")
    , @NamedQuery(name = "RipsUs.findByNombre2", query = "SELECT r FROM RipsUs r WHERE r.nombre2 = :nombre2")
    , @NamedQuery(name = "RipsUs.findByFecnac", query = "SELECT r FROM RipsUs r WHERE r.fecnac = :fecnac")
    , @NamedQuery(name = "RipsUs.findByEdad", query = "SELECT r FROM RipsUs r WHERE r.edad = :edad")
    , @NamedQuery(name = "RipsUs.findByInedad", query = "SELECT r FROM RipsUs r WHERE r.inedad = :inedad")
    , @NamedQuery(name = "RipsUs.findBySexo", query = "SELECT r FROM RipsUs r WHERE r.sexo = :sexo")
    , @NamedQuery(name = "RipsUs.findByCoddept", query = "SELECT r FROM RipsUs r WHERE r.coddept = :coddept")
    , @NamedQuery(name = "RipsUs.findByCodmunc", query = "SELECT r FROM RipsUs r WHERE r.codmunc = :codmunc")
    , @NamedQuery(name = "RipsUs.findByZona", query = "SELECT r FROM RipsUs r WHERE r.zona = :zona")})
public class RipsUs implements Serializable {

    @Size(max = 20)
    @Column(name = "estd")
    private String estd;
    @OneToMany(mappedBy = "documento", cascade = CascadeType.ALL)
    private List<RipsAn> ripsAnList;
    @OneToMany(mappedBy = "documento", cascade = CascadeType.ALL)
    private List<RipsAm> ripsAmList;
    @OneToMany(mappedBy = "documento", cascade = CascadeType.ALL)
    private List<RipsAp> ripsApList;
    @OneToMany(mappedBy = "documento", cascade = CascadeType.ALL)
    private List<RipsAu> ripsAuList;
    @OneToMany(mappedBy = "documento", cascade = CascadeType.ALL)
    private List<RipsAt> ripsAtList;
    @OneToMany(mappedBy = "documento", cascade = CascadeType.ALL)
    private List<RipsAh> ripsAhList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ripsus_generator")
    @SequenceGenerator(name="ripsus_generator", sequenceName = "sec_ripsus", allocationSize=1)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_us")
    private Long idUs;
    @Size(max = 3)
    @Column(name = "tipdoc")
    private String tipdoc;
    @Size(max = 20)
    @Column(name = "documento")
    private String documento;
    @Size(max = 10)
    @Column(name = "codeps")
    private String codeps;
    @Size(max = 5)
    @Column(name = "tip_usu")
    private String tipUsu;
    @Size(max = 50)
    @Column(name = "apellido1")
    private String apellido1;
    @Size(max = 50)
    @Column(name = "apellido2")
    private String apellido2;
    @Size(max = 50)
    @Column(name = "nombre1")
    private String nombre1;
    @Size(max = 50)
    @Column(name = "nombre2")
    private String nombre2;
    @Column(name = "fecnac")
    @Temporal(TemporalType.DATE)
    private Date fecnac;
    @Column(name = "edad")
    private BigInteger edad;
    @Column(name = "inedad")
    private BigInteger inedad;
    @Size(max = 1)
    @Column(name = "sexo")
    private String sexo;
    @Size(max = 3)
    @Column(name = "coddept")
    private String coddept;
    @Size(max = 3)
    @Column(name = "codmunc")
    private String codmunc;
    @Size(max = 1)
    @Column(name = "zona")
    private String zona;
    @OneToMany(mappedBy = "documento", cascade = CascadeType.ALL)
    private List<RipsAc> ripsAcList;

    public RipsUs() {
    }

    public RipsUs(Long idUs) {
        this.idUs = idUs;
    }

    public Long getIdUs() {
        return idUs;
    }

    public void setIdUs(Long idUs) {
        this.idUs = idUs;
    }

    public String getTipdoc() {
        return tipdoc;
    }

    public void setTipdoc(String tipdoc) {
        this.tipdoc = tipdoc;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCodeps() {
        return codeps;
    }

    public void setCodeps(String codeps) {
        this.codeps = codeps;
    }

    public String getTipUsu() {
        return tipUsu;
    }

    public void setTipUsu(String tipUsu) {
        this.tipUsu = tipUsu;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public Date getFecnac() {
        return fecnac;
    }

    public void setFecnac(Date fecnac) {
        this.fecnac = fecnac;
    }

    public BigInteger getEdad() {
        return edad;
    }

    public void setEdad(BigInteger edad) {
        this.edad = edad;
    }

    public BigInteger getInedad() {
        return inedad;
    }

    public void setInedad(BigInteger inedad) {
        this.inedad = inedad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCoddept() {
        return coddept;
    }

    public void setCoddept(String coddept) {
        this.coddept = coddept;
    }

    public String getCodmunc() {
        return codmunc;
    }

    public void setCodmunc(String codmunc) {
        this.codmunc = codmunc;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
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
        hash += (idUs != null ? idUs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsUs)) {
            return false;
        }
        RipsUs other = (RipsUs) object;
        if ((this.idUs == null && other.idUs != null) || (this.idUs != null && !this.idUs.equals(other.idUs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsUs[ idUs=" + idUs + " ]";
    }

    public String getEstd() {
        return estd;
    }

    public void setEstd(String estd) {
        this.estd = estd;
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
    public List<RipsAh> getRipsAhList() {
        return ripsAhList;
    }

    public void setRipsAhList(List<RipsAh> ripsAhList) {
        this.ripsAhList = ripsAhList;
    }
    
}
