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
import com.sistema.rips.pyp.dominio.DominioRipsAc;
import com.sistema.rips.pyp.dominio.DominioRipsAf;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.primefaces.model.SortOrder;
import com.sistema.rips.pyp.negocio.RipsAcIface;
import java.math.BigInteger;
import java.util.ArrayList;


public class lazyRipsAc extends LazyDataModel<DominioRipsAc> implements Serializable {
private static final long serialVersionUID = 1L;
    
    private List<DominioRipsAc> datasource;
    private RipsAcIface service1;
    DominioRipsAf ripsAf;
    String finCons="";
     int edadA= 0;
     int edadB= 0;
     List<String> Sex = new ArrayList<>();
    
     public lazyRipsAc(RipsAcIface service,DominioRipsAf ripsAf1,List<String>sexLis,int edad1,int edad2,String finConsl) {
        this.service1=service;
        this.ripsAf=ripsAf1;
        this.Sex=sexLis;
        this.edadA=edad1;
        this.edadB=edad2;
        this.finCons=finConsl;
    }
    
    public lazyRipsAc(List<DominioRipsAc> datasource) {
        this.datasource = datasource;
    }
    
    @Override
    public DominioRipsAc getRowData(String rowKey) {
        Integer id = Integer.valueOf(rowKey);

        for(DominioRipsAc car : datasource) {
           
            
            if(id.equals(car.getCont()))
                return car;
        }
 
        return null;
    }
 
    @Override
    public Object getRowKey(DominioRipsAc car) {
        return car.getCont();
    }
    
    @Override
	public List<DominioRipsAc> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
            
          
        try {
            
            System.out.println("ripsAf = "+ripsAf.getNumFact());
            this.datasource= this.service1.getListaPaginationByParam(first,pageSize,filters,ripsAf,Sex,edadA,edadB,finCons);
            
        } catch (Exception ex) {
            Logger.getLogger(lazyRipsAc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         //rowCount
        int dataSize = datasource.size();
		
        try {
            
            this.setRowCount(this.service1.rowCount(filters,ripsAf,Sex,edadA,edadB,finCons));
        } catch (Exception ex) {
            Logger.getLogger(lazyRipsAc.class.getName()).log(Level.SEVERE, null, ex);
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
