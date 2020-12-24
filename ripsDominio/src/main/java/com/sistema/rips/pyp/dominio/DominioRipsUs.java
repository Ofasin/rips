/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.dominio;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 */



public class DominioRipsUs extends DominioGeneric {

    private static final long serialVersionUID = 1L;
    
    private Long idUs;
    private String tipdoc;
    private String documento;
    private String codeps;
    private String tipUsu;
    private String apellido1;
    private String apellido2;
    private String nombre1;
    private String nombre2;
    private Date fecnac;
    private BigInteger edad;
    private BigInteger inedad;
    private String sexo;
    private String coddept;
    private String codmunc;
    private String zona;
    private List<DominioRipsAc> ripsAcList;

    public DominioRipsUs() {
    }

    public DominioRipsUs(Long idUs) {
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

  
    public List<DominioRipsAc> getRipsAcList() {
        return ripsAcList;
    }

    public void setRipsAcList(List<DominioRipsAc> ripsAcList) {
        this.ripsAcList = ripsAcList;
    }

    
    
}
