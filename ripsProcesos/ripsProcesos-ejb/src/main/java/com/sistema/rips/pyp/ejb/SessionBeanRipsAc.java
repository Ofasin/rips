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

import com.sistema.rips.pyp.dominio.DominioRipsAc;
import com.sistema.rips.pyp.dominio.DominioRipsAf;
import com.sistema.rips.pyp.dominio.DominioRipsUs;
import com.sistema.rips.pyp.entities.RipsAc;
import com.sistema.rips.pyp.entities.RipsAf;
import com.sistema.rips.pyp.entities.RipsUs;

import com.sistema.rips.pyp.negocio.RipsAcIface;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.StandardBasicTypes;

@Stateless(name = "ejbRipsAc")
public class SessionBeanRipsAc implements RipsAcIface{
    @PersistenceContext(unitName = "persistenceRIPS")
    EntityManager em;
    String numFactr ="";

    @Override
    public List<DominioRipsAc> getAll() throws Exception {
        List<RipsAc> entityRipsAc = new ArrayList<>();
        List<DominioRipsAc> listaDominio = new ArrayList<>();
        try {
                Session session = em.unwrap(Session.class);
                Criteria criteria = session.createCriteria(com.sistema.rips.pyp.entities.RipsAc.class);
                entityRipsAc= criteria.list();
                int cont = 1;
                if(entityRipsAc.size()>0){
                    for(RipsAc obj: entityRipsAc) {            
                    DominioRipsAc dominio = new DominioRipsAc();
                    
                    
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
            DominioRipsAc dominio = new DominioRipsAc();
            dominio.setCont(1);
            dominio.setStatus(false);
            dominio.setMsg("Error de Transaccion : "+e.getMessage());
            listaDominio.add(dominio);
        }
        return listaDominio; 
    }
    
    

    @Override
    public List<DominioRipsAc> getListaPaginationByParam(int first, int pageSize, Map<String, Object> filters,DominioRipsAf ripsAf,List<String>sexLis,int edad1,int edad2,String finConsl) {
          List<RipsAc> entityRipsAc = new ArrayList<>();
        List<DominioRipsAc> listaDominio = new ArrayList<>();
        List<String> codCos=new ArrayList<>();
        codCos.add("890201");
        codCos.add("890301");
        codCos.add("890205");
        codCos.add("890305");
        
         numFactr = ripsAf.getNumFact();
       // String Sql="";
        try {
            String s = "SELECT us FROM RipsUs us WHERE us.codeps = :codeps1 AND us.estd='ACTIVO' AND us.edad BETWEEN(:edadA) AND (:edadB) AND us.sexo IN(:sex1) AND us.documento NOT IN(SELECT ac.documento FROM RipsAc ac WHERE ac.numfac.numFact IN(:numFact1) AND ac.fincons = :finconsl )) ORDER BY RAND()" ;
                 
            String ac ="SELECT ac FROM RipsAc ac  WHERE ac.numfac.numFact =:numFact1 AND EXTRACT(YEAR FROM age(date(ac.feccons),date(ac.documento.fecnac) )) BETWEEN(:edadA) AND (:edadB) AND ac.documento.sexo IN(:sex1) AND ac.fincons = :finconsl AND ac.codcons  IN(:codCosl)";
            
            
             Map<String, Object> filtrs = filters;
            String key="";
            String vlr="";
           
           
          if (!filtrs.isEmpty()) {
                
                Iterator it = filtrs.entrySet().iterator(); 
                while (it.hasNext()) { 
                    Map.Entry e = (Map.Entry)it.next(); 
                    key=(String) e.getKey();
                    vlr=(String) e.getValue();
                   ac=ac+" AND "+key+" LIKE ('%"+vlr+"%') ";
                } 
            }
            
            Query q = em.createQuery(ac);
            q.setParameter("numFact1", numFactr)
            .setParameter("finconsl", finConsl)
            .setParameter("sex1", sexLis)
            .setParameter("edadA", edad1)
            .setParameter("edadB", edad2)
            .setParameter("codCosl", codCos)
            .setFirstResult(first)
            .setMaxResults(pageSize);
            
            
           // criteria.addOrder(Order.asc("id_fact"));
             entityRipsAc=q.getResultList();
        
            int cont = first+1;
            int pos = 0;
            
            if(entityRipsAc.size()>0){
                    for(RipsAc obj1: entityRipsAc) {    
                        
                   DominioRipsAc dominioRipsAc = new DominioRipsAc();
                   
                   
                   dominioRipsAc.setCauextcons(obj1.getCauextcons());
                   dominioRipsAc.setCodcons(obj1.getCodcons());
                   dominioRipsAc.setCodipsi(obj1.getCodipsi());
                   dominioRipsAc.setCoopag(obj1.getCoopag());
                   dominioRipsAc.setDiag1(obj1.getDiag1());
                   dominioRipsAc.setDiag2(obj1.getDiag2());
                   dominioRipsAc.setDiag3(obj1.getDiag3());
                   dominioRipsAc.setDiagppal(obj1.getDiagppal());
                   dominioRipsAc.setDiag1(obj1.getDiag1());
                   dominioRipsAc.setDiag2(obj1.getDiag2());
                   dominioRipsAc.setDiag3(obj1.getDiag3());
                   dominioRipsAc.setFeccons(obj1.getFeccons());
                   dominioRipsAc.setFincons(obj1.getFincons());
                   dominioRipsAc.setIdCons(obj1.getIdCons());
                   dominioRipsAc.setNumaut(obj1.getNumaut());
                   dominioRipsAc.setTipdiag(obj1.getTipdiag());
                   dominioRipsAc.setTipdoc(obj1.getTipdoc());
                   dominioRipsAc.setValor(obj1.getValor());
                   dominioRipsAc.setVneto(obj1.getVneto());
                   
                   DominioRipsUs dominioRipsUs  = new DominioRipsUs();
                   dominioRipsUs.setCodeps(obj1.getDocumento().getCodeps());
                   dominioRipsUs.setDocumento(obj1.getDocumento().getDocumento());
                   dominioRipsUs.setApellido1(obj1.getDocumento().getApellido1());
                   dominioRipsUs.setApellido2(obj1.getDocumento().getApellido2());
                   dominioRipsUs.setFecnac(obj1.getDocumento().getFecnac());
                   dominioRipsUs.setIdUs(obj1.getDocumento().getIdUs());
                   dominioRipsUs.setNombre1(obj1.getDocumento().getNombre1());
                   dominioRipsUs.setNombre2(obj1.getDocumento().getNombre2());
                   dominioRipsUs.setSexo(obj1.getDocumento().getSexo());
                   dominioRipsUs.setTipdoc(obj1.getDocumento().getTipdoc());
                  
                  
                      
          SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacmt = sdf.format(dominioRipsUs.getFecnac());
            
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
            String fechaConslt = sdf2.format(obj1.getFeccons());
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNac = LocalDate.parse(fechaNacmt, fmt);
            LocalDate fechaCons = LocalDate.parse(fechaConslt, fmt2);
            Period periodo = Period.between(fechaNac, fechaCons);
            
            
            dominioRipsUs.setEdad(BigInteger.valueOf(periodo.getYears()));
            
            
                   dominioRipsAc.setDocumento(dominioRipsUs);
                   
                   DominioRipsAf dominioRipsAf =new DominioRipsAf();
                   dominioRipsAf.setNumFact(obj1.getNumfac().getNumFact());
                   
                   dominioRipsAc.setNumfac(dominioRipsAf);
                   
                   
                  // listaDominioAc.add(dominioRipsAc);
                   
                    dominioRipsAc.setCont(cont++);
                    dominioRipsAc.setPosicion(pos++);
                    dominioRipsAc.setStatus(true);
                    listaDominio.add(dominioRipsAc);
                    }
                }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsAc dominio = new DominioRipsAc();
            dominio.setStatus(false);
            dominio.setMsg("Error de transaccion : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
        return listaDominio;
    }

    @Override
    public int rowCount(Map<String, Object> filters,DominioRipsAf ripsAf,List<String>sexLis,int edad1,int edad2,String finConsl) {
      numFactr = ripsAf.getNumFact();
      List<String> codCos=new ArrayList<>();
        codCos.add("890201");
        codCos.add("890301");
        codCos.add("890205");
        codCos.add("890305");
       try {
           
           /*
            Session session = this.em.unwrap(Session.class);
            Criteria criteria;
            criteria = session.createCriteria(com.sistema.rips.pyp.entities.RipsAc.class);
            criteria.setFetchMode("numfac", FetchMode.JOIN);
            criteria.createAlias("numfac", "cAf");
            criteria.setFetchMode("cAf", FetchMode.JOIN);
            criteria.add(Restrictions.eq("cAf.numFact", numFactr));
            
            */
           
           String ac ="SELECT ac FROM RipsAc ac  WHERE ac.numfac.numFact =:numFact1 AND EXTRACT(YEAR FROM age(date(ac.feccons),date(ac.documento.fecnac) )) BETWEEN(:edadA) AND (:edadB) AND ac.documento.sexo IN(:sex1) AND ac.fincons = :finconsl AND ac.codcons IN(:codCosl)";
           
            Map<String, Object> filtrs = filters;
            String key="";
            String vlr="";
           
           
          if (!filtrs.isEmpty()) {
                
                Iterator it = filtrs.entrySet().iterator(); 
                while (it.hasNext()) { 
                    Map.Entry e = (Map.Entry)it.next(); 
                    key=(String) e.getKey();
                    vlr=(String) e.getValue();
                   ac=ac+" AND "+key+" LIKE ('%"+vlr+"%') ";
                } 
            }
           
           
            Query q = em.createQuery(ac);
            q.setParameter("numFact1", numFactr)
            .setParameter("finconsl", finConsl)
            .setParameter("sex1", sexLis)
            .setParameter("edadA", edad1)
            .setParameter("edadB", edad2)
            .setParameter("codCosl", codCos);
           
           
            
            
            
            //criteria.add(Restrictions.ilike(key,  vlr, MatchMode.ANYWHERE));
            return q.getResultList().size();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public DominioRipsAc getById(DominioRipsAc obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRipsAc guardar(DominioRipsAc obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRipsAc actualizar(DominioRipsAc obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRipsAc borrar(DominioRipsAc obj) throws Exception {
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
    
   

    @Override
    public DominioRipsUs getPrueva(List<String>sexLis,int edad1,int edad2,String finConsl) throws Exception {
        
        numFactr="EZEQ-6967";
        try{ 
             String ac ="SELECT ac FROM RipsAc ac  WHERE ac.numfac.numFact =:numFact1 AND EXTRACT(YEAR FROM age(date(ac.feccons),date(ac.documento.fecnac) )) BETWEEN :edadA AND :edadB AND ac.documento.sexo IN(:sex1) AND ac.fincons = :finconsl";
            
            int t1=12;
            int t2=12;
            
            
            Query q = em.createQuery(ac);
            q.setParameter("numFact1", numFactr)
            .setParameter("finconsl", finConsl)
            .setParameter("sex1", sexLis)
            .setParameter("edadA", t1)
            .setParameter("edadB", t2);
            
            
         DominioRipsUs ripsUs=new DominioRipsUs();
                          
                          ripsUs.setMsg("Conto en getTotalCons2() : "+String.valueOf(q.getResultList().size()));
                          return ripsUs;
        
        
        }catch (Exception e) {
                    e.printStackTrace();
                    System.err.println();
                   
                    DominioRipsUs ripsUs=new DominioRipsUs();
                          
                          ripsUs.setMsg("Error : "+e.getMessage().toString());
                          return ripsUs;
                      }
    }
}
