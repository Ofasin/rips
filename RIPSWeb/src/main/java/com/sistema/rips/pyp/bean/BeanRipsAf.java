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


import com.sistema.rips.pyp.dominio.DominioRipsAf;
import com.sistema.rips.pyp.bean.modelolazy.lazyRipsAf;
import com.sistema.rips.pyp.bean.modelolazy.lazyRipsAc;
import com.sistema.rips.pyp.dominio.DominioRipsAc;
import com.sistema.rips.pyp.dominio.DominioRipsUs;
import com.sistema.rips.pyp.dominio.DominioRuta;
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
import com.sistema.rips.pyp.negocio.RipsAfIface;
import com.sistema.rips.pyp.negocio.RipsAcIface;
import com.sistema.rips.pyp.negocio.RipsUsIface;
import com.sistema.rips.pyp.negocio.RutaIface;
import java.math.BigInteger;

public class BeanRipsAf  extends BeanGeneric{

    
    
    private final static Logger log = Logger.getLogger(BeanRipsAf.class);
    private DominioRipsAf ripsAf;
    private DominioRuta rutaSel;
    private RipsAfIface service;
    private RipsAcIface serviceAc;
    private RutaIface serviceRuta;
    private RipsUsIface serviceUs;
    private LazyDataModel<DominioRipsAf> listaModel;
    private LazyDataModel<DominioRipsAc> listaModelAc;
    private List<DominioRipsAf> listaRipsAf;
    private List<DominioRipsAf> lista;
    private List<DominioRipsAc> listaRipsAc;
    private List<DominioRuta> listaRuta;
    private DominioRuta obj1;
    private int adolctsAc;
    private int adolctsUs;
    String finCons="";
     int edadA= 0;
     int edadB= 0;
     List<String> SexF = new ArrayList<>();
      List<String> SexM = new ArrayList<>();
      
       List<String> SexAmb=new ArrayList<>();
    /**
     * @return the listaModelAc
     */
    public LazyDataModel<DominioRipsAc> getListaModelAc() {
        return listaModelAc;
        
    }

    /**
     * @param listaModelAc the listaModelAc to set
     */
    public void setListaModelAc(LazyDataModel<DominioRipsAc> listaModelAc) {
        this.listaModelAc = listaModelAc;
    }
    
    
    
    
    /**
     * @return the ripsAf
     */
    
    
    public DominioRipsAf getRipsAf() {
        return ripsAf;
    }

   

    /**
     * @param ripsAf the ripsAf to set
     */
    public void setRipsAf(DominioRipsAf ripsAf) {
        this.ripsAf = ripsAf;
    }
    
     /**
     * @param listaRipsAc the listaRipsAc to set
     */
    public void setListaRipsAc(List<DominioRipsAc> listaRipsAc) {
        this.listaRipsAc = listaRipsAc;
    }
    
    /**
     * @return the listaRipsAc
     */
    public List<DominioRipsAc> getListaRipsAc() {
        return listaRipsAc;
    }

    

    /**
     * @return the service
     */
    public RipsAfIface getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(RipsAfIface service) {
        this.service = service;
    }

    /**
     * @return the listaModel
     */
    public LazyDataModel<DominioRipsAf> getListaModel() {
        return listaModel;
    }

    /**
     * @param listaModel the listaModel to set
     */
    public void setListaModel(LazyDataModel<DominioRipsAf> listaModel) {
        this.listaModel = listaModel;
    }

    /**
     * @return the listaRipsAf
     */
    public List<DominioRipsAf> getListaRipsAf() {
        return listaRipsAf;
    }

    /**
     * @param listaRipsAf the listaRipsAf to set
     */
    public void setListaRipsAf(List<DominioRipsAf> listaRipsAf) {
        this.listaRipsAf = listaRipsAf;
    }

    /**
     * @return the lista
     */
    public List<DominioRipsAf> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<DominioRipsAf> lista) {
        this.lista = lista;
    }
     public RipsAcIface getServiceAc() {
        return serviceAc;
    }

    public void setServiceAc(RipsAcIface serviceAc) {
        this.serviceAc = serviceAc;
    }
    
    public List<DominioRuta> getListaRuta() {
        return listaRuta;
    }

    public void setListaRuta(List<DominioRuta> listaRuta) {
        this.listaRuta = listaRuta;
    }
    
       public DominioRuta getRutaSel() {
        return rutaSel;
    }

    public void setRutaSel(DominioRuta rutaSel) {
        this.rutaSel = rutaSel;
    }

    public RutaIface getServiceRuta() {
        return serviceRuta;
    }

    public void setServiceRuta(RutaIface serviceRuta) {
        this.serviceRuta = serviceRuta;
    }
    
     public DominioRuta getObj1() {
        return obj1;
    }

    public void setObj1(DominioRuta obj1) {
        this.obj1 = obj1;
    }
    
     public int getAdolctsAc() {
        return adolctsAc;
    }

    public void setAdolctsAc(int adolctsAc) {
        this.adolctsAc = adolctsAc;
    }

    public int getAdolctsUs() {
        return adolctsUs;
    }

    public void setAdolctsUs(int adolctsUs) {
        this.adolctsUs = adolctsUs;
    }
    
    

    public RipsUsIface getServiceUs() {
        return serviceUs;
    }

    public void setServiceUs(RipsUsIface serviceUs) {
        this.serviceUs = serviceUs;
    }

    
    @PostConstruct
    public void llenaRipsAf() {
                SexF.add("F");
                SexM.add("M");
                
                SexAmb.add("F");
                SexAmb.add("M");
        try {
            setLista(service.getAll());
        } catch(Exception e) {
            Global.addMsgErr("Error  ", e.getMessage());
            log.error("ERROR llenaRipsAc : "+e);
        }
    }

    @Override
    public void llenaLista() {
        listaModel = new lazyRipsAf(getService());
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
        if(obj == null) {
            setTituloPantalla("Nuevo Registro");
            setShowSave(true);
            setShowUpdate(false);
            ripsAf = new DominioRipsAf();
            ripsAf.setPosicion((listaModel.getRowCount()%listaModel.getPageSize()));
            
        } else {
            ripsAf = (DominioRipsAf)obj;
            setTituloPantalla("Eps : "+ripsAf.getNomeps()+"\t Factura Numero : "+ripsAf.getNumFact());
            setShowSave(false);            
            setShowUpdate(true); 
            
           // setDatosConslAdolecencia();
            System.out.println(" estoy por aca");
          onShowRipsAcByRipsAf(ripsAf);
             
        }
        
     
    }
    

    @Override
    public void deleteAllSelect(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void showRipsAf(final SelectEvent event) {
        //setTituloPantalla("Consulta de Registro");
        ripsAf = (DominioRipsAf)event.getObject();
        ripsAf.setDisabled(true);
    }
     
     public void onShowRipsAcByRipsAf(Object obj) {
        //setTituloPantalla("onc");
        ripsAf = (DominioRipsAf)obj;
        rutaSel = new DominioRuta();
        Short a=12;
        Short b=17;
        rutaSel.setEdadini(a);
        rutaSel.setEdadfin(b);
        rutaSel.setPrograma("ADOLECENCIA");
        rutaSel.setCodeps(ripsAf.getCodeps());
        
        setDatosConslAdolecencia(this.rutaSel);
    }
     
     public void changeProveedor() {
         Global.addMsg("OJO ACA", "Prueva de SelectoneMenu Ruta : "+rutaSel.getDescrpRuta());
    }

    private void setDatosConslAdolecencia(Object obj) {
        setListaRipsAc(new ArrayList<>());
        setListaRuta(new ArrayList<>());
        finCons="05";
        obj1 =(DominioRuta) obj;
       edadA=obj1.getEdadini();
       edadB=obj1.getEdadfin();
        listaRuta = new ArrayList<>();
        
         try {
            
            listaRuta=(serviceRuta.getByPrograma(obj1));
             //setAdolctsUs(serviceUs.rowCountByRuta(obj1));
            
             
        } catch (Exception ex) {
            Global.addMsg("OJO ACA", "Error en Ruta : "+ex.getMessage());
        }
        
        try {
             System.err.println("prueva test 1.2.3...");
            //listaRuta=(serviceRuta.getByPrograma(obj1));
             //setAdolctsUs(serviceUs.rowCountByRuta(obj1));
             String tq=serviceUs.getPrueva(obj1);
             System.out.println("mensaje en GetPrueva="+tq);
             
        } catch (Exception ex) {
            Global.addMsg("OJO ACA", "Error en Ruta : "+ex.getMessage());
        }
            
            listaModelAc = new lazyRipsAc(getServiceAc(),ripsAf,SexAmb,edadA, edadB,finCons);
            
           
            setAdolctsAc(listaModelAc.getRowCount());
            
            // setListaRuta(listaRuta);
            
            setListaModelAc(listaModelAc);
            
              System.out.println("Total en Anh= "+getListaModelAc().getRowCount());
       
            
    }

   

 

    
   

   
    
}
