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
import com.sistema.rips.pyp.dominio.DominioRipsAf;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.primefaces.model.SortOrder;
import com.sistema.rips.pyp.negocio.RipsAfIface;


public class lazyRipsAf extends LazyDataModel<DominioRipsAf> implements Serializable {
private static final long serialVersionUID = 1L;
    
    private List<DominioRipsAf> datasource;
    private RipsAfIface service1;
    
     public lazyRipsAf(RipsAfIface service) {
        this.service1=service;
    }
    
    public lazyRipsAf(List<DominioRipsAf> datasource) {
        this.datasource = datasource;
    }
    
    @Override
    public DominioRipsAf getRowData(String rowKey) {
        Integer id = Integer.valueOf(rowKey);

        for(DominioRipsAf car : datasource) {
           
            
            if(id.equals(car.getCont()))
                return car;
        }
 
        return null;
    }
 
    @Override
    public Object getRowKey(DominioRipsAf car) {
        return car.getCont();
    }
    
    @Override
	public List<DominioRipsAf> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
            
          
        try {
            
            this.datasource= this.service1.getListaPagination(first,pageSize,filters);
            
        } catch (Exception ex) {
            Logger.getLogger(lazyRipsAf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         //rowCount
        int dataSize = datasource.size();
		
        try {
            
            this.setRowCount(this.service1.rowCount(filters));
        } catch (Exception ex) {
            Logger.getLogger(lazyRipsAf.class.getName()).log(Level.SEVERE, null, ex);
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
