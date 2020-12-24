/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.bean.modelolazy;

/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 */

import java.io.Serializable;
import org.primefaces.model.LazyDataModel;
import com.sistema.rips.pyp.dominio.DominioRipsUs;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.primefaces.model.SortOrder;
import com.sistema.rips.pyp.negocio.pypOdontlgIface;

public class lazyPyp extends LazyDataModel<DominioRipsUs> implements Serializable{
   private static final long serialVersionUID = 1L;
    
    private List<DominioRipsUs> datasource;
    private pypOdontlgIface service1;
    
     public lazyPyp(pypOdontlgIface service) {
        this.service1=service;
    }
    
    public lazyPyp(List<DominioRipsUs> datasource) {
        this.datasource = datasource;
    }
    
    @Override
    public DominioRipsUs getRowData(String rowKey) {
        Integer id = Integer.valueOf(rowKey);

        for(DominioRipsUs car : datasource) {
           
            
            if(id.equals(car.getCont()))
                return car;
        }
 
        return null;
    }
 
    @Override
    public Object getRowKey(DominioRipsUs car) {
        return car.getCont();
    }
    
    @Override
	public List<DominioRipsUs> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
            DominioRipsUs usMsg = new DominioRipsUs();
          
        try {
            
            this.datasource= this.service1.getListaOdont(first,pageSize);
            usMsg=this.service1.getTotalCons2();
            
        } catch (Exception ex) {
            Logger.getLogger(lazyPyp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         //rowCount
        int dataSize = datasource.size();
		
        try {
            
            this.setRowCount(this.service1.getCount());
        } catch (Exception ex) {
            Logger.getLogger(lazyPyp.class.getName()).log(Level.SEVERE, null, ex);
        }
		 //paginate
        if(dataSize > pageSize) {
            try {
                return datasource.subList(first, first + pageSize);
            }
            catch(IndexOutOfBoundsException e) {
                return datasource.subList(first, first + (dataSize % pageSize));
            }
        }
        else {
            return datasource;
        }
	} 
}
