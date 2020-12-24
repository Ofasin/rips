/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.ejb;

/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 */

import com.sistema.rips.pyp.dominio.DominioRipsAf;
import com.sistema.rips.pyp.dominio.DominioRipsAc;
import com.sistema.rips.pyp.dominio.DominioRipsUs;
import com.sistema.rips.pyp.entities.RipsAc;
import com.sistema.rips.pyp.entities.RipsAf;
import com.sistema.rips.pyp.negocio.RipsAfIface;
import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

@Stateless(name = "ejbRipsAf")
public class SessionBeanRipsAf implements RipsAfIface{
    @PersistenceContext(unitName = "persistenceRIPS")
    EntityManager em;

    @Override
    public List<DominioRipsAf> getAll() throws Exception {
         List<RipsAf> entityRipsAf = new ArrayList<>();
        List<DominioRipsAf> listaDominio = new ArrayList<>();
        try {
                Session session = em.unwrap(Session.class);
                Criteria criteria = session.createCriteria(com.sistema.rips.pyp.entities.RipsAf.class);
                entityRipsAf= criteria.list();
                int cont = 1;
                if(entityRipsAf.size()>0){
                    for(RipsAf obj: entityRipsAf) {            
                    DominioRipsAf dominio = new DominioRipsAf();
                    
                    
                    //dominio.setIdtipeducacion(obj.getIdtipeducacion());
                   // dominio.setDescrptipeducacion(obj.getDescrptipeducacion());
                    
                    copyProperties(dominio, obj);
                    
                    dominio.setCont(cont++);
                    dominio.setStatus(true);
                    listaDominio.add(dominio);
                    }
                }
                
             
        } catch (Exception e) {
            e.printStackTrace();
            DominioRipsAf dominio = new DominioRipsAf();
            dominio.setCont(1);
            dominio.setStatus(false);
            dominio.setMsg("Error de Transaccion : "+e.getMessage());
            listaDominio.add(dominio);
        }
        return listaDominio; 
    }

    @Override
    public List<DominioRipsAf> getListaPagination(int first, int pageSize, Map<String, Object> filters) {
         List<RipsAf> entityRipsAf = new ArrayList<>();
        List<DominioRipsAf> listaDominio = new ArrayList<>();
        
        try {
            Session session = this.em.unwrap(Session.class);
            Criteria criteria;
            criteria = session.createCriteria(com.sistema.rips.pyp.entities.RipsAf.class);
            criteria.setFirstResult(first)
            .setMaxResults(pageSize);
            Map<String, Object> filtrs = filters;
            String key="";
            String vlr="";
            
            if (!filtrs.isEmpty()) {
                
                Iterator it = filtrs.entrySet().iterator(); 
                while (it.hasNext()) { 
                    Map.Entry e = (Map.Entry)it.next(); 
                    key=(String) e.getKey();
                    vlr=(String) e.getValue();
                    
			criteria.add(Restrictions.ilike(key,  vlr, MatchMode.ANYWHERE));
                    
                    
                } 
            }
           // criteria.addOrder(Order.asc("id_fact"));
             entityRipsAf=criteria.list();
        
            int cont = first+1;
            int pos = 0;
            if(entityRipsAf.size()>0){
                    for(RipsAf obj: entityRipsAf) {            
                    DominioRipsAf dominio = new DominioRipsAf();
                    
                    
                    //dominio.setIdtipeducacion(obj.getIdtipeducacion());
                   // dominio.setDescrptipeducacion(obj.getDescrptipeducacion());
                   
                   
                    
                    
                   dominio.setCodeps(obj.getCodeps());
                   dominio.setCodips(obj.getCodips());
                   dominio.setCoopg(obj.getCoopg());
                   dominio.setFecFin(obj.getFecFin());
                   dominio.setFecIni(obj.getFecIni());
                   dominio.setFecRadc(obj.getFecRadc());
                   dominio.setIdFact(obj.getIdFact());
                   dominio.setIdent(obj.getIdent());
                   dominio.setNomeps(obj.getNomeps());
                   dominio.setNomips(obj.getNomips());
                   dominio.setNumContr(obj.getNumContr());
                   dominio.setNumFact(obj.getNumFact());
                   dominio.setNumPol(obj.getNumPol());
                   dominio.setPlanBenf(obj.getPlanBenf());
                   dominio.setTipIde(obj.getTipIde());
                   dominio.setVlrComs(obj.getVlrComs());
                   dominio.setVlrDesc(obj.getVlrDesc());
                   dominio.setVlrNeto(obj.getVlrNeto());
                   
                   /*
                   List<DominioRipsAc> listaDominioAc = new ArrayList<>();
                   
                   for(RipsAc obj1: obj.getRipsAcList()) {
                   DominioRipsAc dominioRipsAc = new DominioRipsAc();
                   
                   dominioRipsAc.setCauextcons(obj1.getCauextcons());
                   dominioRipsAc.setCodcons(obj1.getCodcons());
                   dominioRipsAc.setCodipsi(obj1.getCodipsi());
                   dominioRipsAc.setCoopag(obj1.getCoopag());
                   dominioRipsAc.setDiag1(obj1.getDiag1());
                   dominioRipsAc.setDiag2(obj1.getDiag2());
                   dominioRipsAc.setDiag3(obj1.getDiag3());
                   dominioRipsAc.setDiagppal(obj1.getDiagppal());
                   
                   DominioRipsUs dominioRipsUs  = new DominioRipsUs();
                   
                   dominioRipsUs.setApellido1(obj1.getDocumento().getApellido1());
                   dominioRipsUs.setApellido2(obj1.getDocumento().getApellido2());
                   dominioRipsUs.setCoddept(obj1.getDocumento().getCoddept());
                   dominioRipsUs.setCodeps(obj1.getDocumento().getCodeps());
                   dominioRipsUs.setCodmunc(obj1.getDocumento().getCodmunc());
                   dominioRipsUs.setDocumento(obj1.getDocumento().getDocumento());
                   dominioRipsUs.setEdad(obj1.getDocumento().getEdad());
                   dominioRipsUs.setFecnac(obj1.getDocumento().getFecnac());
                   dominioRipsUs.setIdUs(obj1.getDocumento().getIdUs());
                   dominioRipsUs.setInedad(obj1.getDocumento().getInedad());
                   dominioRipsUs.setNombre1(obj1.getDocumento().getNombre1());
                   dominioRipsUs.setNombre2(obj1.getDocumento().getNombre2());
                   dominioRipsUs.setSexo(obj1.getDocumento().getSexo());
                   dominioRipsUs.setTipUsu(obj1.getDocumento().getTipUsu());
                   dominioRipsUs.setTipdoc(obj1.getDocumento().getTipdoc());
                   dominioRipsUs.setZona(obj1.getDocumento().getZona());
                   
                   
                   dominioRipsAc.setDocumento(dominioRipsUs);
                   
                   
                   
                   //copyProperties(dominioRipsAc, obj1);
                   listaDominioAc.add(dominioRipsAc);
                   }*/
                   
                 //  dominio.setRipsAcList(listaDominioAc);
                  
                  //dominioRipsAc.setCauextcons(obj.getRipsAcList().);
                   
                   //copyProperties(dominio, obj);
                   
                   
                   
                    dominio.setCont(cont++);
                    dominio.setPosicion(pos++);
                    dominio.setStatus(true);
                    listaDominio.add(dominio);
                    }
                }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsAf dominio = new DominioRipsAf();
            dominio.setStatus(false);
            dominio.setMsg("Error de transaccion : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
        return listaDominio;
    }

    @Override
    public int rowCount(Map<String, Object> filters) {
         try {
            Session session = this.em.unwrap(Session.class);
            Criteria criteria;
            criteria = session.createCriteria(com.sistema.rips.pyp.entities.RipsAf.class);
             Map<String, Object> filtrs = filters;
            String key="";
            String vlr="";
            
            if (!filtrs.isEmpty()) {
                
                Iterator it = filtrs.entrySet().iterator(); 
                while (it.hasNext()) { 
                    Map.Entry e = (Map.Entry)it.next(); 
                    key=(String) e.getKey();
                    vlr=(String) e.getValue();
                   
			criteria.add(Restrictions.ilike(key,  vlr, MatchMode.ANYWHERE));
                    
                    
                } 
            }
            return criteria.list().size();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public DominioRipsAf getById(DominioRipsAf obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRipsAf guardar(DominioRipsAf obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRipsAf actualizar(DominioRipsAf obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRipsAf borrar(DominioRipsAf obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public static void copyProperties(Object to, Object from) {
        Method[] metodos = from.getClass().getMethods();
        Class<?>[] types = new Class[]{};
        Object[] args = new Object[]{};
        for(Method metodo: metodos) {
            String name = metodo.getName();
            Method metodoGetTo = null;
            Method metodoSetTo = null;
            Method metodoGetFrom = null;
            Object objFrom = null;
            Object objAux = null;
            String get = null;
            if(name.startsWith("set")) {
                try {
                    get = name.replaceFirst("set", "get");
                    metodoGetTo = to.getClass().getMethod(get, types);
                    metodoSetTo = to.getClass().getMethod(name, metodoGetTo.getReturnType());
                    metodoGetFrom = from.getClass().getMethod(get, types);
                    objFrom = metodoGetFrom.invoke(from, args);
                    metodoSetTo.invoke(to, objFrom);
                } catch(NoSuchMethodException nsme) {
                } catch(IllegalArgumentException ilegal) {
                    try {
                        objAux = metodoGetTo.getReturnType().newInstance();
                        copyProperties(objAux, objFrom);
                        metodoSetTo.invoke(to, objAux);
                    } catch(Exception ex) {
                    }
                } catch(Exception e) {
                }
            }
        }
    }
}
