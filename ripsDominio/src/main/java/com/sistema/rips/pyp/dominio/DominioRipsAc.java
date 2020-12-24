/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.dominio;

import java.util.Date;



/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 */

public class DominioRipsAc extends DominioGeneric{

    private static final long serialVersionUID = 1L;
    
    
    private Long idCons;
    private String codipsi;
    private String tipdoc;
    private Date feccons;
    private String numaut;
    private String codcons;
    private String fincons;
    private String cauextcons;
    private String diagppal;
    private String diag1;
    private String diag2;
    private String diag3;
    private String tipdiag;
    private String valor;
    private String coopag;
    private String vneto;
    
    
    private DominioRipsAf numfac;
    
    
    private DominioRipsUs documento;

    public DominioRipsAc() {
    }

    public DominioRipsAc(Long idCons) {
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

    public DominioRipsAf getNumfac() {
        return numfac;
    }

    public void setNumfac(DominioRipsAf numfac) {
        this.numfac = numfac;
    }

    public DominioRipsUs getDocumento() {
        return documento;
    }

    public void setDocumento(DominioRipsUs documento) {
        this.documento = documento;
    }

    
}
