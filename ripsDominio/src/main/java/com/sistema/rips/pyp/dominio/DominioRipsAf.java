/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 */

public class DominioRipsAf extends DominioGeneric{

    private static final long serialVersionUID = 1L;
     
    private Long idFact;
    private String codips;
    private String nomips;
    private String tipIde;
    private String ident;
    private String numFact;
    private Date fecRadc;
    private Date fecIni;
    private Date fecFin;
    private String codeps;
    private String nomeps;
    private String numContr;
    private String planBenf;
    private String numPol;
    private String coopg;
    private String vlrComs;
    private String vlrDesc;
    private String vlrNeto;
    
    private List<DominioRipsAc> ripsAcList;

    public DominioRipsAf() {
    }

    public DominioRipsAf(Long idFact) {
        this.idFact = idFact;
    }

    public DominioRipsAf(Long idFact, String numFact) {
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

    
    public List<DominioRipsAc> getRipsAcList() {
        return ripsAcList;
    }

    public void setRipsAcList(List<DominioRipsAc> ripsAcList) {
        this.ripsAcList = ripsAcList;
    }

   
}
