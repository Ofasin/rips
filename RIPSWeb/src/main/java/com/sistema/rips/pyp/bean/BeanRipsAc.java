/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.bean;

/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 */


import com.sistema.rips.pyp.dominio.DominioRipsAc;
import com.sistema.rips.pyp.bean.modelolazy.lazyRipsAc;
import com.sistema.rips.pyp.globals.Global;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import com.sistema.rips.pyp.negocio.RipsAcIface;


public class BeanRipsAc extends BeanGeneric{
    
private final static Logger log = Logger.getLogger(BeanRipsAc.class);
    private DominioRipsAc ripsAc;
    private RipsAcIface service;
    private LazyDataModel<DominioRipsAc> listaModel;
    private List<DominioRipsAc> listaRipsAc;
    private List<DominioRipsAc> lista;
    
    /**
     * @return the ripsAc
     */
    public DominioRipsAc getRipsAc() {
        return ripsAc;
    }

    /**
     * @param ripsAc the ripsAc to set
     */
    public void setRipsAc(DominioRipsAc ripsAc) {
        this.ripsAc = ripsAc;
    }

    /**
     * @return the service
     */
    public RipsAcIface getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(RipsAcIface service) {
        this.service = service;
    }

    /**
     * @return the listaModel
     */
    public LazyDataModel<DominioRipsAc> getListaModel() {
        return listaModel;
    }

    /**
     * @param listaModel the listaModel to set
     */
    public void setListaModel(LazyDataModel<DominioRipsAc> listaModel) {
        this.listaModel = listaModel;
    }

    /**
     * @return the listaRipsAc
     */
    public List<DominioRipsAc> getListaRipsAc() {
        return listaRipsAc;
    }

    /**
     * @param listaRipsAc the listaRipsAc to set
     */
    public void setListaRipsAc(List<DominioRipsAc> listaRipsAc) {
        this.listaRipsAc = listaRipsAc;
    }

    /**
     * @return the lista
     */
    public List<DominioRipsAc> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<DominioRipsAc> lista) {
        this.lista = lista;
    }
    
     @PostConstruct
    public void llenaRipsAc() {
        try {
            setLista(service.getAll());
        } catch(Exception e) {
            Global.addMsgErr("Error  ", e.getMessage());
            log.error("ERROR llenaRipsAc : "+e);
        }
    }

    @Override
    public void llenaLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(ActionEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateRow(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(RowEditEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ActionEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onUpdateInsertRow(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAllSelect(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
