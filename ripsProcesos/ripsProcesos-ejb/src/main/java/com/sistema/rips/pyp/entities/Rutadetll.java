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
@Table(name = "rutadetll", catalog = "rips", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rutadetll.findAll", query = "SELECT r FROM Rutadetll r")
    , @NamedQuery(name = "Rutadetll.findByIdrutdet", query = "SELECT r FROM Rutadetll r WHERE r.idrutdet = :idrutdet")
    , @NamedQuery(name = "Rutadetll.findByDescractvd", query = "SELECT r FROM Rutadetll r WHERE r.descractvd = :descractvd")
    , @NamedQuery(name = "Rutadetll.findByCupsactvd", query = "SELECT r FROM Rutadetll r WHERE r.cupsactvd = :cupsactvd")
    , @NamedQuery(name = "Rutadetll.findByFinactvd", query = "SELECT r FROM Rutadetll r WHERE r.finactvd = :finactvd")
    , @NamedQuery(name = "Rutadetll.findByArchivo", query = "SELECT r FROM Rutadetll r WHERE r.archivo = :archivo")
    , @NamedQuery(name = "Rutadetll.findByDiagpp", query = "SELECT r FROM Rutadetll r WHERE r.diagpp = :diagpp")
    , @NamedQuery(name = "Rutadetll.findByDiag1", query = "SELECT r FROM Rutadetll r WHERE r.diag1 = :diag1")
    , @NamedQuery(name = "Rutadetll.findByTipserv", query = "SELECT r FROM Rutadetll r WHERE r.tipserv = :tipserv")
    , @NamedQuery(name = "Rutadetll.findByDiag2", query = "SELECT r FROM Rutadetll r WHERE r.diag2 = :diag2")
    , @NamedQuery(name = "Rutadetll.findByDiag3", query = "SELECT r FROM Rutadetll r WHERE r.diag3 = :diag3")})
public class Rutadetll implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rutdetll_generator")
    @SequenceGenerator(name="rutdetll_generator", sequenceName = "sec_rutdetll", allocationSize=1)
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrutdet")
    private Long idrutdet;
    @Size(max = 255)
    @Column(name = "descractvd")
    private String descractvd;
    @Size(max = 10)
    @Column(name = "cupsactvd")
    private String cupsactvd;
    @Size(max = 2)
    @Column(name = "finactvd")
    private String finactvd;
    @Size(max = 2)
    @Column(name = "archivo")
    private String archivo;
    @Size(max = 4)
    @Column(name = "diagpp")
    private String diagpp;
    @Size(max = 4)
    @Column(name = "diag1")
    private String diag1;
    @Column(name = "tipserv")
    private Short tipserv;
    @Size(max = 4)
    @Column(name = "diag2")
    private String diag2;
    @Size(max = 4)
    @Column(name = "diag3")
    private String diag3;
    @JoinColumn(name = "idruta", referencedColumnName = "id_ruta")
    @ManyToOne
    private Ruta idruta;

    public Rutadetll() {
    }

    public Rutadetll(Long idrutdet) {
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

    public Ruta getIdruta() {
        return idruta;
    }

    public void setIdruta(Ruta idruta) {
        this.idruta = idruta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrutdet != null ? idrutdet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rutadetll)) {
            return false;
        }
        Rutadetll other = (Rutadetll) object;
        if ((this.idrutdet == null && other.idrutdet != null) || (this.idrutdet != null && !this.idrutdet.equals(other.idrutdet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rips.pyp.sistema.entities.Rutadetll[ idrutdet=" + idrutdet + " ]";
    }
    
}
