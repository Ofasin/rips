/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.dominio;

import java.util.List;


public class DominioRuta extends DominioGeneric {

   
    private Long idRuta;
    private String codRuta;
    private String descrpRuta;
    private String sexo;
    private Short edadini;
    private Short edadfin;
    private String codeps;
    private String programa;
    private List<DominioRutadetll> rutadetllList;

    public DominioRuta() {
    }

    public DominioRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public String getCodRuta() {
        return codRuta;
    }

    public void setCodRuta(String codRuta) {
        this.codRuta = codRuta;
    }

    public String getDescrpRuta() {
        return descrpRuta;
    }

    public void setDescrpRuta(String descrpRuta) {
        this.descrpRuta = descrpRuta;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Short getEdadini() {
        return edadini;
    }

    public void setEdadini(Short edadini) {
        this.edadini = edadini;
    }

    public Short getEdadfin() {
        return edadfin;
    }

    public void setEdadfin(Short edadfin) {
        this.edadfin = edadfin;
    }

    public String getCodeps() {
        return codeps;
    }

    public void setCodeps(String codeps) {
        this.codeps = codeps;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

  
    public List<DominioRutadetll> getRutadetllList() {
        return rutadetllList;
    }

    public void setRutadetllList(List<DominioRutadetll> rutadetllList) {
        this.rutadetllList = rutadetllList;
    }

   
    
}
