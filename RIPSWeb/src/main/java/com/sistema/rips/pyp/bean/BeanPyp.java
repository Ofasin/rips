/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.bean;

/**
 *
 * @author Heidelber
 */

import com.sistema.rips.pyp.dominio.DominioRipsUs;
import com.sistema.rips.pyp.bean.modelolazy.lazyPyp;
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
import com.sistema.rips.pyp.negocio.pypOdontlgIface;
public class BeanPyp extends BeanGeneric{

    private final static Logger log = Logger.getLogger(BeanRipsAf.class);
    private DominioRipsUs ripsUs;
    private pypOdontlgIface service;
    private LazyDataModel<DominioRipsUs> listaModel;
    private List<DominioRipsUs> listaRipsUs;    
    /**
     * @return the ripsUs
     */
    public DominioRipsUs getRipsUs() {
        return ripsUs;
    }

    /**
     * @param ripsUs the ripsUs to set
     */
    public void setRipsUs(DominioRipsUs ripsUs) {
        this.ripsUs = ripsUs;
    }

    /**
     * @return the service
     */
    public pypOdontlgIface getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(pypOdontlgIface service) {
        this.service = service;
    }

    /**
     * @return the listaModel
     */
    public LazyDataModel<DominioRipsUs> getListaModel() {
        return listaModel;
    }

    /**
     * @param listaModel the listaModel to set
     */
    public void setListaModel(LazyDataModel<DominioRipsUs> listaModel) {
        this.listaModel = listaModel;
    }

    /**
     * @return the listaRipsUs
     */
    public List<DominioRipsUs> getListaRipsUs() {
        return listaRipsUs;
    }

    /**
     * @param listaRipsUs the listaRipsUs to set
     */
    public void setListaRipsUs(List<DominioRipsUs> listaRipsUs) {
        this.listaRipsUs = listaRipsUs;
    }

    @Override
    public void llenaLista() {
       listaModel = new lazyPyp(getService());
    setListaModel(listaModel);
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
