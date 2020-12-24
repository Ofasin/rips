/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.dominio;


public class DominioRutadetll extends DominioGeneric {

    private static final long serialVersionUID = 1L;
   
    private Long idrutdet;
    private String descractvd;
    private String cupsactvd;
    private String finactvd;
    private String archivo;
    private String diagpp;
    private String diag1;
    private Short tipserv;
    private String diag2;
    private String diag3;
    private DominioRuta idruta;

    public DominioRutadetll() {
    }

    public DominioRutadetll(Long idrutdet) {
        this.idrutdet = idrutdet;
    }

    public Long getIdrutdet() {
        return idrutdet;
    }

    public void setIdrutdet(Long idrutdet) {
        this.idrutdet = idrutdet;
    }

    public String getDescractvd() {
        return descractvd;
    }

    public void setDescractvd(String descractvd) {
        this.descractvd = descractvd;
    }

    public String getCupsactvd() {
        return cupsactvd;
    }

    public void setCupsactvd(String cupsactvd) {
        this.cupsactvd = cupsactvd;
    }

    public String getFinactvd() {
        return finactvd;
    }

    public void setFinactvd(String finactvd) {
        this.finactvd = finactvd;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getDiagpp() {
        return diagpp;
    }

    public void setDiagpp(String diagpp) {
        this.diagpp = diagpp;
    }

    public String getDiag1() {
        return diag1;
    }

    public void setDiag1(String diag1) {
        this.diag1 = diag1;
    }

    public Short getTipserv() {
        return tipserv;
    }

    public void setTipserv(Short tipserv) {
        this.tipserv = tipserv;
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

    public DominioRuta getIdruta() {
        return idruta;
    }

    public void setIdruta(DominioRuta idruta) {
        this.idruta = idruta;
    }

   
}
