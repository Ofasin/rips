/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "rips_us1", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RipsUs1.findAll", query = "SELECT r FROM RipsUs1 r")
    , @NamedQuery(name = "RipsUs1.findByIdUs", query = "SELECT r FROM RipsUs1 r WHERE r.idUs = :idUs")
    , @NamedQuery(name = "RipsUs1.findByTipdoc", query = "SELECT r FROM RipsUs1 r WHERE r.tipdoc = :tipdoc")
    , @NamedQuery(name = "RipsUs1.findByDocumento", query = "SELECT r FROM RipsUs1 r WHERE r.documento = :documento")
    , @NamedQuery(name = "RipsUs1.findByCodeps", query = "SELECT r FROM RipsUs1 r WHERE r.codeps = :codeps")
    , @NamedQuery(name = "RipsUs1.findByTipUsu", query = "SELECT r FROM RipsUs1 r WHERE r.tipUsu = :tipUsu")
    , @NamedQuery(name = "RipsUs1.findByApellido1", query = "SELECT r FROM RipsUs1 r WHERE r.apellido1 = :apellido1")
    , @NamedQuery(name = "RipsUs1.findByApellido2", query = "SELECT r FROM RipsUs1 r WHERE r.apellido2 = :apellido2")
    , @NamedQuery(name = "RipsUs1.findByNombre1", query = "SELECT r FROM RipsUs1 r WHERE r.nombre1 = :nombre1")
    , @NamedQuery(name = "RipsUs1.findByNombre2", query = "SELECT r FROM RipsUs1 r WHERE r.nombre2 = :nombre2")
    , @NamedQuery(name = "RipsUs1.findByFecnac", query = "SELECT r FROM RipsUs1 r WHERE r.fecnac = :fecnac")
    , @NamedQuery(name = "RipsUs1.findByEdad", query = "SELECT r FROM RipsUs1 r WHERE r.edad = :edad")
    , @NamedQuery(name = "RipsUs1.findByInedad", query = "SELECT r FROM RipsUs1 r WHERE r.inedad = :inedad")
    , @NamedQuery(name = "RipsUs1.findBySexo", query = "SELECT r FROM RipsUs1 r WHERE r.sexo = :sexo")
    , @NamedQuery(name = "RipsUs1.findByCoddept", query = "SELECT r FROM RipsUs1 r WHERE r.coddept = :coddept")
    , @NamedQuery(name = "RipsUs1.findByCodmunc", query = "SELECT r FROM RipsUs1 r WHERE r.codmunc = :codmunc")
    , @NamedQuery(name = "RipsUs1.findByZona", query = "SELECT r FROM RipsUs1 r WHERE r.zona = :zona")})
public class RipsUs1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
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

    public RipsUs1() {
    }

    public RipsUs1(Long idUs) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUs != null ? idUs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RipsUs1)) {
            return false;
        }
        RipsUs1 other = (RipsUs1) object;
        if ((this.idUs == null && other.idUs != null) || (this.idUs != null && !this.idUs.equals(other.idUs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.RipsUs1[ idUs=" + idUs + " ]";
    }
    
}
