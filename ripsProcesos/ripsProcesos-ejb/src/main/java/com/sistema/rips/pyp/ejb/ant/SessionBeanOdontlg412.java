/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.ejb.ant;

/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 * 
  
 
  
 * criteria.add(
  Restrictions.not(
    Restrictions.in("partType", new String[] {"0","4","5","6","7","a","b","c"})
  )
 */

import com.sistema.rips.pyp.dominio.DominioRipsAc;
import com.sistema.rips.pyp.dominio.DominioRipsAf;
import com.sistema.rips.pyp.dominio.DominioRipsUs;
import com.sistema.rips.pyp.entities.RipsAc;
import com.sistema.rips.pyp.entities.RipsAf;
import com.sistema.rips.pyp.entities.RipsUs;
import com.sistema.rips.pyp.entities.RipsAp;
import com.sistema.rips.pyp.entities.Frt4505;
import com.sistema.rips.pyp.entities.RipsAt;

import com.sistema.rips.pyp.negocio.RipsAcIface;
import com.sistema.rips.pyp.negocio.pypOdontlgIface;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

@Stateless(name = "ejbOdont")
public class SessionBeanOdontlg412 implements pypOdontlgIface{
    @PersistenceContext(unitName = "persistenceRIPS")
    EntityManager em;
     int total=0;
     String finCons="";
     BigInteger edadA= new BigInteger("0");
     BigInteger edadB= new BigInteger("0");
     String Eps ="CCF055";
     String facAct="IPSI0249";
     Long id =87240L;
     int cont1 =0;
      
     List<String> listaFactOdon = new ArrayList<>();
      List<String> listaFactContr = new ArrayList<>();
      List<String> listaFactura = new ArrayList<>();
      List<String> SexF = new ArrayList<>();
      List<String> SexM = new ArrayList<>();
      
       List<String> SexAmb=new ArrayList<>();
       
  RipsAf ripsAf= new RipsAf();   
Date fec;
List<RipsUs> entityRipsUs = new ArrayList<>();
        List<RipsAc> listRipsAc = new ArrayList<>();
        List<RipsAp> listRipsAp = new ArrayList<>();
        List<RipsAt> listRipsAt = new ArrayList<>();
        List<Frt4505> listFrt4505 = new ArrayList<>();
        List<DominioRipsUs> listaDominio = new ArrayList<>();

    @Override
    public List<DominioRipsUs> getListaOdont(int first, int pageSize) {
             int cont = first+1;
                int pos = 0;   
                SexF.add("F");
                SexM.add("M");
                
                SexAmb.add("F");
                SexAmb.add("M");
                
                listaFactura.add("IPSI0249");
                listaFactura.add("IPSI0246");
                listaFactura.add("IPSI0243");
                listaFactura.add("IPSI0240");
                listaFactura.add("IPSI0237");
                listaFactura.add("IPSI0234");
                listaFactura.add("IPSI0231");
                listaFactura.add("IPSI0228");
                listaFactura.add("IPSI0225");
                listaFactura.add("IPSI0222");
                listaFactura.add("IPSI0219");
                listaFactura.add("IPSI0216");
                
                
                
                
                
                
                

                
                
                
                
               
                
                
                listaFactContr.add("IPSI0222");
                listaFactContr.add("IPSI0219");
                listaFactContr.add("IPSI0216");
                listaFactContr.add("IPSI0213");
                listaFactContr.add("IPSI0210");
                
                
                listaFactOdon.add("IPSI0249");
                listaFactOdon.add("IPSI0246");
                listaFactOdon.add("IPSI0243");
                listaFactOdon.add("IPSI0240");
                
                
                
                
                
                

               
                
                
         /* String query1 = "SELECT c.numFact FROM RipsAf c WHERE c.numFact = "+facAct;      
       
        try {
            Query q1 = em.createQuery(query1);
                    q1.setMaxResults(1);
                   ripsAf =(RipsAf) q1.getSingleResult();
           
        } catch(Exception e) {
            //obj.setStatus(false);
           // obj.setMsg("Error de transaccion : \n"+e);
            System.out.println("Error"+e.getMessage());
        }*/
         
         
         
         
       
         
         try{
             Session session = em.unwrap(Session.class);
            ripsAf =(RipsAf) session.createCriteria(com.sistema.rips.pyp.entities.RipsAf.class)
                    .add(Restrictions.eq("numFact", facAct))
                    .setMaxResults(1)
                    .uniqueResult();
        //  ripsAf = em.find(RipsAf.class, ripsAf.getNumFact());
        
        
        } catch(Exception e) {
            System.out.println("Error de Transaccion : \n"+e.getMessage());
            
        }
          
         /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **PlanificacionHombres EDAD=19  49  SEX=M
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=3;
         finCons="03";
        edadA=new BigInteger("15");
         edadB=new BigInteger("49");
         
         
            
          if(total>0){
          
              cont1=getTotalCons(finCons,facAct,edadA,edadB,SexM,new String[]{"890201","890205"});
                 DominioRipsUs auxDomi = new DominioRipsUs();
                         auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("Planificacion1raVezHombre");
                 
                 auxDomi.setSexo(String.valueOf(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                 if(cont1<total){
                     
                  total=total-cont1;
                 try{
                     entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInproc(finCons,listaFactura,Eps,edadA,edadB,total,SexM);
                       
                       
                         if(entityRipsUs.size()>0){
                         
                         
                              
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           RipsAc ripsAc = new RipsAc();
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890201","Z308",obj1,fec,finCons,ripsAf);
                   
                   
                   
                   RipsAt ripsAt = new RipsAt();
                  ripsAt= com.sistema.rips.pyp.utils.Utils.getAT("PRESER001","PRESERVATIVO",obj1,ripsAf);
                   
                  /*
                   ripsAp.setCodproc("902213");
                   ripsAp.setDiagpp("Z017");
                   ripsAp.setDocumento(obj1);
                   ripsAp.setFeccons(fec);
                   ripsAp.setNumfac(ripsAf);
                   ripsAp.setTipdoc(obj1.getTipdoc());*/
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("PlanFamH");
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC53PlanificacionFamiliarPrimeraVez(fec);
                   frt.setC54SuministroDeMetodoAnticonceptivo(15);
                   
                   
                   
                   listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                   //listRipsAt.add(ripsAt);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                          
                          
               
                          
                }    
                     
                   } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
                 }
          }
        
         /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **PlanificacionControlHobres EDAD=19  49  SEX=F
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=0;
         finCons="03";
        edadA=new BigInteger("15");
         edadB=new BigInteger("49");
         
         
            
          if(total>0){
          
              cont1=getTotalCons(finCons,facAct,edadA,edadB,SexM,new String[]{"890201","890301","890205","890305"});
                    DominioRipsUs auxDomi = new DominioRipsUs();
                   auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("PlanificacionControlHombres");
                 
                 auxDomi.setSexo(String.valueOf(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                 if(cont1<total){
                     
                  total=total-cont1;
                 try{
                     entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInprocControl(finCons,listaFactContr,Eps,edadA,edadB,total,SexM);
                       
                       
                         if(entityRipsUs.size()>0){
                         
                         
                              
                       
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           RipsAc ripsAc = new RipsAc();
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890305","Z308",obj1,fec,finCons,ripsAf);
                   
                   
                   
                   RipsAt ripsAt = new RipsAt();
                  ripsAt= com.sistema.rips.pyp.utils.Utils.getAT("PRESER001","PRESERVATIVO",obj1,ripsAf);
                   
                  /*
                   ripsAp.setCodproc("902213");
                   ripsAp.setDiagpp("Z017");
                   ripsAp.setDocumento(obj1);
                   ripsAp.setFeccons(fec);
                   ripsAp.setNumfac(ripsAf);
                   ripsAp.setTipdoc(obj1.getTipdoc());*/
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("PlanFamContrHombres");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC53PlanificacionFamiliarPrimeraVez(fec);
                   frt.setC54SuministroDeMetodoAnticonceptivo(15);
                   
                   
                   
                   listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                 //  listRipsAt.add(ripsAt);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                          
                          
               
                          
                }    
                     
                   } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
                 }
          }  
         
         
         
         /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **PlanificacionMujer EDAD=19  49  SEX=F
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=5;
         finCons="03";
        edadA=new BigInteger("15");
         edadB=new BigInteger("49");
         
         
            
          if(total>0){
          
              cont1=getTotalCons(finCons,facAct,edadA,edadB,SexF,new String[]{"890201","890205"});
                 DominioRipsUs auxDomi = new DominioRipsUs();
                         auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("Planificacion1raVezMujer");
                 
                 auxDomi.setSexo(String.valueOf(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                 if(cont1<total){
                     
                  total=total-cont1;
                 try{
                     entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInproc(finCons,listaFactura,Eps,edadA,edadB,total,SexF);
                       
                       
                         if(entityRipsUs.size()>0){
                         
                         
                              
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           RipsAc ripsAc = new RipsAc();
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890201","Z308",obj1,fec,finCons,ripsAf);
                   
                   
                   
                   RipsAt ripsAt = new RipsAt();
                  ripsAt= com.sistema.rips.pyp.utils.Utils.getAT("PRESER001","PRESERVATIVO",obj1,ripsAf);
                   
                  /*
                   ripsAp.setCodproc("902213");
                   ripsAp.setDiagpp("Z017");
                   ripsAp.setDocumento(obj1);
                   ripsAp.setFeccons(fec);
                   ripsAp.setNumfac(ripsAf);
                   ripsAp.setTipdoc(obj1.getTipdoc());*/
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("PlanFamMujer");
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC53PlanificacionFamiliarPrimeraVez(fec);
                   frt.setC54SuministroDeMetodoAnticonceptivo(15);
                   
                   
                   
                   listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                   //listRipsAt.add(ripsAt);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                          
                          
               
                          
                }    
                     
                   } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
                 }
          }
        
                     
                  /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **PlanificacionControl EDAD=19  49  SEX=F
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=36;
         finCons="03";
        edadA=new BigInteger("15");
         edadB=new BigInteger("49");
         
         
            
          if(total>0){
          
              cont1=getTotalCons(finCons,facAct,edadA,edadB,SexF,new String[]{"890201","890301","890205","890305"});
                    DominioRipsUs auxDomi = new DominioRipsUs();
                   auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("PlanificacionControlMujer");
                 
                 auxDomi.setSexo(String.valueOf(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                 if(cont1<total){
                     
                  total=total-cont1;
                 try{
                     entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInprocControl(finCons,listaFactContr,Eps,edadA,edadB,total,SexF);
                       
                       
                         if(entityRipsUs.size()>0){
                         
                         
                              
                       
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           RipsAc ripsAc = new RipsAc();
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890305","Z308",obj1,fec,finCons,ripsAf);
                   
                   
                   
                   RipsAt ripsAt = new RipsAt();
                  ripsAt= com.sistema.rips.pyp.utils.Utils.getAT("PRESER001","PRESERVATIVO",obj1,ripsAf);
                   
                  /*
                   ripsAp.setCodproc("902213");
                   ripsAp.setDiagpp("Z017");
                   ripsAp.setDocumento(obj1);
                   ripsAp.setFeccons(fec);
                   ripsAp.setNumfac(ripsAf);
                   ripsAp.setTipdoc(obj1.getTipdoc());*/
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("PlanFamContrMujer");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC53PlanificacionFamiliarPrimeraVez(fec);
                   frt.setC54SuministroDeMetodoAnticonceptivo(15);
                   
                   
                   
                   listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                 //  listRipsAt.add(ripsAt);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                          
                          
               
                          
                }    
                     
                   } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
                 }
          }  
         
         
         /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **JOVEN EDAD=10 A 13, SEX=F,  HEMOGLOBINA
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
         
         total=2;
         finCons="05";
         edadA=new BigInteger("10");
         edadB=new BigInteger("13");
         
          if(total>0){              
                 cont1=getTotalCons(finCons,facAct,edadA,edadB,SexF,new String[]{"890201","890301","890205","890305"});
                 
                 if(cont1<total){
                     
                  total=total-cont1;
                   try{
                       
        
                  entityRipsUs=getUsInproc(finCons,listaFactura,Eps,edadA,edadB,total,SexF);
                       
                
                
                
                
                
            if(entityRipsUs.size()>0){
                
                
                
                 
                
                 DominioRipsUs auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(entityRipsUs.size()));
                 auxDomi.setDocumento("JovenHemogl");
                 
                 auxDomi.setSexo(Long.toString(id));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
        
                for(RipsUs obj1: entityRipsUs) {
                   
                  
                   String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                   RipsAc ripsAc = new RipsAc();
                   ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890201","Z003",obj1,fec,finCons,ripsAf);
                   
                   
                   RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP("902213","Z017",obj1,fec,"4",ripsAf);
                   
                  
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   
                   
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("JovHem");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC72ConsultaDeJovenPrimeraVez(fec);
                   frt.setC103FechaTomaDeHemoglobina(fec);
                   frt.setC104Hemoglobina("10.5");
                   
                   
                   
                   listFrt4505.add(frt);
                   //listRipsAc.add(ripsAc);
                   listRipsAp.add(ripsAp);
                   
                   
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
               
            }
                
            } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
                 
                 }
         
       
        
    }
        
        
       /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **JOVEN EDAD=14 A 16, SEX=F,M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
        
        
             total=19;
         finCons="05";
         edadA=new BigInteger("12");
         edadB=new BigInteger("17");
            
             
             if(total>0){
                 
                 cont1=getTotalCons(finCons,facAct,edadA,edadB,SexAmb, new String[]{"890201","890301","890205","890305"});
                 
                 
                 if(cont1<total){
                 
                 total=total-cont1;
                 
              
                    
             try{
                 entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInproc(finCons,listaFactura,Eps,edadA,edadB,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                             
                             
                              DominioRipsUs auxDomi = new DominioRipsUs();
                         auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(entityRipsUs.size()));
                 auxDomi.setDocumento("Joven1");
                 
                 auxDomi.setSexo(Long.toString(id));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                    
                    
                    
                    
                          for(RipsUs obj1: entityRipsUs) {
                              
                              
                         String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                           RipsAc ripsAc = new RipsAc();
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890201","Z003",obj1,fec,finCons,ripsAf);
                   
                   
                   /*
                    RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP("902213","Z017",obj1,fec,"4",ripsAf);*/
                   
                   
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("Jov1");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC72ConsultaDeJovenPrimeraVez(fec);
                  /* frt.setC103FechaTomaDeHemoglobina(fec);
                   frt.setC104Hemoglobina("10.5");*/
                   
                   
                   
                   listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                 //  listRipsAp.add(ripsAp);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                          
                          
                
                          
                }    
            } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Q2 : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
             }
    }
             
          
             
             
       /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **JOVEN EDAD=17 A 21, SEX=F,M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
             
             
          total=7;
         finCons="05";
         edadA=new BigInteger("18");
         edadB=new BigInteger("23");
            
             
             if(total>0){
                 
              cont1=getTotalCons(finCons,facAct,edadA,edadB,SexAmb,new String[]{"890201","890301","890205","890305"});
                 
                 
                 if(cont1<total){
                 
                 total=total-cont1;
                 
                 
                    
             try{
                  entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInproc(finCons,listaFactura,Eps,edadA,edadB,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                         
                         
                              DominioRipsUs auxDomi = new DominioRipsUs();
                         auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(entityRipsUs.size()));
                 auxDomi.setDocumento("Joven2");
                 
                 auxDomi.setSexo(Long.toString(id));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           RipsAc ripsAc = new RipsAc();
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890201","Z000",obj1,fec,finCons,ripsAf);
                   
                   
                   /*
                   RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP();
                   
                  
                   ripsAp.setCodproc("902213");
                   ripsAp.setDiagpp("Z017");
                   ripsAp.setDocumento(obj1);
                   ripsAp.setFeccons(fec);
                   ripsAp.setNumfac(ripsAf);
                   ripsAp.setTipdoc(obj1.getTipdoc());*/
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("Jov2");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC72ConsultaDeJovenPrimeraVez(fec);
                  /* frt.setC103FechaTomaDeHemoglobina(fec);
                   frt.setC104Hemoglobina("10.5");*/
                   
                   
                   
                   listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                 //  listRipsAp.add(ripsAp);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                          
                          
               
                          
                }    
            } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Q2 : "+e.getMessage());
            listaDominio.add(dominio);
            
        }  
                 
      }
    }
          
             
         /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **JOVEN EDAD=22 A 24, SEX=F,M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
             
             
          total=14;
         finCons="05";
         edadA=new BigInteger("24");
         edadB=new BigInteger("28");
            
             
             if(total>0){
             
             cont1=getTotalCons(finCons,facAct,edadA,edadB,SexAmb,new String[]{"890201","890301","890205","890305"});
             
              if(cont1<total){
              
                   total=total-cont1;
                   try{
                   entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInproc(finCons,listaFactura,Eps,edadA,edadB,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                         
                         
                DominioRipsUs auxDomi = new DominioRipsUs();
                 auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(entityRipsUs.size()));
                 auxDomi.setDocumento("Joven3");
                 
                 auxDomi.setSexo(Long.toString(id));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           RipsAc ripsAc = new RipsAc();
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890201","Z000",obj1,fec,finCons,ripsAf);
                   
                   
                   /*
                   RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP();
                   
                  
                   ripsAp.setCodproc("902213");
                   ripsAp.setDiagpp("Z017");
                   ripsAp.setDocumento(obj1);
                   ripsAp.setFeccons(fec);
                   ripsAp.setNumfac(ripsAf);
                   ripsAp.setTipdoc(obj1.getTipdoc());*/
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("Jov3");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC72ConsultaDeJovenPrimeraVez(fec);
                  /* frt.setC103FechaTomaDeHemoglobina(fec);
                   frt.setC104Hemoglobina("10.5");*/
                   
                   
                   
                   listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                 //  listRipsAp.add(ripsAp);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                          
                          
               
                          
                }    
                   
                   } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Error : "+e.getMessage());
                    DominioRipsUs dominio = new DominioRipsUs();
                    dominio.setStatus(false);
                    dominio.setMsg("Error en Q2 : "+e.getMessage());
                    listaDominio.add(dominio);

                }  
                  
              }
             }
             
             
             
             
         /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **JOVEN EDAD=25 A 29, SEX=F,M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
             
             
          total=0;
         finCons="05";
         edadA=new BigInteger("25");
         edadB=new BigInteger("29");
            
             
             if(total>0){
             
             cont1=getTotalCons(finCons,facAct,edadA,edadB,SexAmb,new String[]{"890201","890301","890205","890305"});
             
              if(cont1<total){
              
                   total=total-cont1;
                   try{
                   entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInproc(finCons,listaFactura,Eps,edadA,edadB,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                         
                         
                DominioRipsUs auxDomi = new DominioRipsUs();
                 auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(entityRipsUs.size()));
                 auxDomi.setDocumento("Joven4");
                 
                 auxDomi.setSexo(Long.toString(id));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           RipsAc ripsAc = new RipsAc();
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890201","Z000",obj1,fec,finCons,ripsAf);
                   
                   
                   /*
                   RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP();
                   
                  
                   ripsAp.setCodproc("902213");
                   ripsAp.setDiagpp("Z017");
                   ripsAp.setDocumento(obj1);
                   ripsAp.setFeccons(fec);
                   ripsAp.setNumfac(ripsAf);
                   ripsAp.setTipdoc(obj1.getTipdoc());*/
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("Jov4");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC72ConsultaDeJovenPrimeraVez(fec);
                  /* frt.setC103FechaTomaDeHemoglobina(fec);
                   frt.setC104Hemoglobina("10.5");*/
                   
                   
                   
                   listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                 //  listRipsAp.add(ripsAp);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                          
                          
               
                          
                }    
                   
                   } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Error : "+e.getMessage());
                    DominioRipsUs dominio = new DominioRipsUs();
                    dominio.setStatus(false);
                    dominio.setMsg("Error en Q2 : "+e.getMessage());
                    listaDominio.add(dominio);

                }  
                  
              }
             }
             
             
             
         /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         *****laboratorios ControlPrenatal
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
           
           finCons="06";
           
           String[] listaLabPrent= {"906916","903841","902212","902210","907106","881431"};
                   
                   
            Boolean t2 = true;
            if(t2){
             try{ 
           Session session = em.unwrap(Session.class);
           
           entityRipsUs= new ArrayList<>();
           
                 entityRipsUs=getTotalCons4(finCons, facAct,listaLabPrent);
                 
                  DominioRipsUs auxDomi = new DominioRipsUs();
                
                 auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total encontrados: ");
                 auxDomi.setApellido2("0");
                 auxDomi.setDocumento("labControlPrent");
                 
                 auxDomi.setSexo(Integer.toString(entityRipsUs.size()));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                    
                 if(entityRipsUs.size()>0){
                     for(RipsUs obj1: entityRipsUs) {
                        
                         String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                   for(String obj2: listaLabPrent) {
                       
                        RipsAp ripsAp = new RipsAp();
                       ripsAp= com.sistema.rips.pyp.utils.Utils.getAP(obj2,"Z017",obj1,fec,"4",ripsAf);
                       listRipsAp.add(ripsAp);
                   }
                  
                   
                    
                     }
                     
                 }
                 
          } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Error : "+e.getMessage());
                    DominioRipsUs dominio = new DominioRipsUs();
                    dominio.setStatus(false);
                    dominio.setMsg("Error en Q5 : "+e.getMessage());
                    listaDominio.add(dominio);

                } 
            }
             
             
             
             
         /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **adultez EDAD=29 A 100, SEX=F,M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
             
             
          total=10;
         finCons="07";
         edadA=new BigInteger("29");
         edadB=new BigInteger("44");
            
             
             if(total>0){
            
             cont1=getTotalCons(finCons,facAct,edadA,edadB,SexAmb,new String[]{"890201","890301","890205","890305"});
               DominioRipsUs auxDomi = new DominioRipsUs();
                
                 auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total encontrados: ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("Adultez");
                 
                 auxDomi.setSexo(Long.toString(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
              if(cont1<total){
              
                   total=total-cont1;
                   
                   try{
                       
                   entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInproc(finCons,listaFactura,Eps,edadA,edadB,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                         
                         
                
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           RipsAc ripsAc = new RipsAc();
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890201","Z000",obj1,fec,finCons,ripsAf);
                   
                  
                   
                   /*
                   List<String> listaLab = new ArrayList<>();
                   listaLab.add("907106");
                   listaLab.add("903825");
                   listaLab.add("903841");
                   listaLab.add("903815");
                   listaLab.add("903816");
                   listaLab.add("903818");
                   listaLab.add("903868");
                   
                   listaLab.forEach((String obj1Str) -> {
                       RipsAp ripsAp = new RipsAp();
                       ripsAp= com.sistema.rips.pyp.utils.Utils.getAP(obj1Str,"Z017",obj1,fec,"4",ripsAf);
                       listRipsAp.add(ripsAp);
                    });
                   */
                   
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("Adultez29-45");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC73ConsultaDeAdultoPrimeraVez(fec);
                   frt.setC103FechaTomaDeHemoglobina(fec);
                   frt.setC104Hemoglobina("10.5");
                    frt.setC105FechaDeLaTomaDeGlicemiaBasal(fec);
                     frt.setC106FechaCreatinina(fec);
                      frt.setC107Creatinina("0.78");
                   
                   
                   listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                 //  listRipsAp.add(ripsAp);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                          
                          
               
                          
                }    
                   
                   } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Error : "+e.getMessage());
                    DominioRipsUs dominio = new DominioRipsUs();
                    dominio.setStatus(false);
                    dominio.setMsg("Error en Q5 : "+e.getMessage());
                    listaDominio.add(dominio);

                }  
             
             }
             
             } 
             
             
         /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **adultez EDAD=45 50 55 60 65 ....., SEX=F,M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=10;
         finCons="07";
         
          List<BigInteger> listaQuin =new ArrayList<>();
            listaQuin.add(new BigInteger("45"));
            listaQuin.add(new BigInteger("50"));
            listaQuin.add(new BigInteger("55"));       
            listaQuin.add(new BigInteger("60"));
            listaQuin.add(new BigInteger("65"));
            listaQuin.add(new BigInteger("70"));
            listaQuin.add(new BigInteger("75"));
            listaQuin.add(new BigInteger("80"));
            listaQuin.add(new BigInteger("85"));
            listaQuin.add(new BigInteger("90"));
            listaQuin.add(new BigInteger("95"));
            listaQuin.add(new BigInteger("100"));
            
          
         
          if(total>0){
            
             cont1=getTotalCons3(finCons,facAct,listaQuin);
             
               DominioRipsUs auxDomi = new DominioRipsUs();
                
                 auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total encontrados: ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("AdultezQuin");
                 
                 auxDomi.setSexo(Long.toString(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                    
                if(cont1<total){
              
                   total=total-cont1;
                   
                   try{
                       
                   entityRipsUs= new ArrayList<>();
                   
                 entityRipsUs=getUsInproc2(finCons,listaFactura,Eps,listaQuin,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                         
                         
                
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           RipsAc ripsAc = new RipsAc();
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890201","Z000",obj1,fec,finCons,ripsAf);
                   
                  
                   
                  
                   
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("AdultezQuin");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC73ConsultaDeAdultoPrimeraVez(fec);
                   frt.setC103FechaTomaDeHemoglobina(fec);
                   frt.setC104Hemoglobina("10.5");
                   frt.setC105FechaDeLaTomaDeGlicemiaBasal(fec);
                   frt.setC106FechaCreatinina(fec);
                   frt.setC107Creatinina("0.78");
                   
                   
                   listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                 //  listRipsAp.add(ripsAp);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                          
                          
               
                          
                }    
                   
                   } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Error : "+e.getMessage());
                    DominioRipsUs dominio = new DominioRipsUs();
                    dominio.setStatus(false);
                    dominio.setMsg("Error en Q5 : "+e.getMessage());
                    listaDominio.add(dominio);

                }  
             
             }    
          }
          
          
           /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         *****laboratorios AdultoMayor
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
           
           finCons="07";
           
                   
            String[] listaLab= {"907106","903825","903841","903815","903816","903818","903868"};
           
            Boolean t1 = true;
            if(t1){
             try{ 
           Session session = em.unwrap(Session.class);
           
           entityRipsUs= new ArrayList<>();
                 entityRipsUs=getTotalCons4(finCons, facAct,listaLab);
                  DominioRipsUs auxDomi = new DominioRipsUs();
                
                 auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total encontrados: ");
                 auxDomi.setApellido2("0");
                 auxDomi.setDocumento("labAdultez");
                 
                 auxDomi.setSexo(Integer.toString(entityRipsUs.size()));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                    
                 if(entityRipsUs.size()>0){
                     for(RipsUs obj1: entityRipsUs) {
                        
                         String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                   for(String obj2: listaLab) {
                        RipsAp ripsAp = new RipsAp();
                       ripsAp= com.sistema.rips.pyp.utils.Utils.getAP(obj2,"Z017",obj1,fec,"4",ripsAf);
                       listRipsAp.add(ripsAp);
                       }
                  
                   
                    
                     }
                     
                 }
                 
          } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Error : "+e.getMessage());
                    DominioRipsUs dominio = new DominioRipsUs();
                    dominio.setStatus(false);
                    dominio.setMsg("Error en Q5 : "+e.getMessage());
                    listaDominio.add(dominio);

                } 
            }
          
         
             
                  /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **AgudezaVisual EDAD=4 11 16 45  SEX=F,M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=10;
         finCons="08";
         List<BigInteger> listaAg =new ArrayList<>();
            listaAg.add(new BigInteger("4"));
            listaAg.add(new BigInteger("11"));
            listaAg.add(new BigInteger("16"));       
            listaAg.add(new BigInteger("45"));
         
         
            
          if(total>0){
            
             cont1=getTotalCons3(finCons,facAct,listaAg);
             
               DominioRipsUs auxDomi = new DominioRipsUs();
                
                 auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total encontrados: ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("AgudezaVis");
                 
                 auxDomi.setSexo(Long.toString(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                    
                if(cont1<total){
              
                   total=total-cont1;
                   
                   try{
                       
                   entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInproc2(finCons,listaFactura,Eps,listaAg,total,SexAmb);
                       
                        
                         if(entityRipsUs.size()>0){
                         
                         
                
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           RipsAc ripsAc = new RipsAc();
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890201","Z010",obj1,fec,finCons,ripsAf);
                   
                  
                    
                     RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP("950601","Z010",obj1,fec,"4",ripsAf);
                   
                   
                   Frt4505 frt = new Frt4505();
                   frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("AgusezaVis");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC29FechaDelPeso(fec);
                   frt.setC31FechaDeLaTalla(fec);
                   frt.setC62ValoracionDeLaAgudezaVisual(fec);
                   
                   
                   
                   listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                   listRipsAp.add(ripsAp);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                          
                          
               
                          
                }    
                   
                   } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Error : "+e.getMessage());
                    DominioRipsUs dominio = new DominioRipsUs();
                    dominio.setStatus(false);
                    dominio.setMsg("Error en Q5 : "+e.getMessage());
                    listaDominio.add(dominio);

                }  
             
             }    
          }
        
          
       /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **Citologia EDAD=15  40  SEX=F 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=27;
         finCons="4";
        edadA=new BigInteger("15");
         edadB=new BigInteger("49");
         
           if(total>0){
          
              cont1=getTotalProc(finCons,facAct,edadA,edadB,SexF,new String[]{"898001"});
               DominioRipsUs auxDomi = new DominioRipsUs();
                         auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("Citologia");
                 
                 auxDomi.setSexo(String.valueOf(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                    
              if(cont1<total){
                   total=total-cont1;
                  
                    try{  
                    entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInprocProcdmt("898001",listaFactura,Eps,edadA,edadB,total,SexF);
                       
                       
                         if(entityRipsUs.size()>0){
                        
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           
                   
                
            RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP("898001","",obj1,fec,"4",ripsAf);
                   listRipsAp.add(ripsAp);
                   ripsAp= com.sistema.rips.pyp.utils.Utils.getAP("892901","",obj1,fec,"4",ripsAf);
                   listRipsAp.add(ripsAp);
        
                  
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                         }
                    
                    } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
              
              }
           }         
         
          
            /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **ControlPlacaBacteriana EDAD=2  17  SEX=M,F 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=109;
         finCons="3";
        edadA=new BigInteger("2");
         edadB=new BigInteger("17");
         
           if(total>0){
          
              cont1=getTotalProc(finCons,facAct,edadA,edadB,SexAmb,new String[]{"997310"});
              
               DominioRipsUs auxDomi = new DominioRipsUs();
                         auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("ControlPlaca");
                 
                 auxDomi.setSexo(String.valueOf(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
              if(cont1<total){
                  
                  total=total-cont1;
                  
                    try{  
                    entityRipsUs= new ArrayList<>();
                    
                 entityRipsUs=getUsInprocProcdmt("997310",listaFactOdon,Eps,edadA,edadB,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                        
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           RipsAc ripsAc = new RipsAc();
                           if(obj1.getEdad().intValue()<=10){
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890303","K050",obj1,fec,"04",ripsAf);
                           }
                           if(obj1.getEdad().intValue()>10){
                           ripsAc=com.sistema.rips.pyp.utils.Utils.getAc("890303","K050",obj1,fec,"05",ripsAf);
                           }
                   
                    RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP("997310","",obj1,fec,"3",ripsAf);
                   
                 /*  RipsAt ripsAt = new RipsAt();
                  ripsAt= com.sistema.rips.pyp.utils.Utils.getAT("PRESER001","PRESERVATIVO",obj1,ripsAf);*/
                   
                  
                  
                   
                   Frt4505 frt = new Frt4505();
                   
                   Session session = em.unwrap(Session.class);
                 Criteria criteriaFrt = session.createCriteria(com.sistema.rips.pyp.entities.Frt4505.class);
                 criteriaFrt.add(Restrictions.eq("c4NumeroDeIdentificacionDelUsuario", obj1.getDocumento()))
                         .createAlias("cFact", "cF")
                .setFetchMode("cF", FetchMode.JOIN)
	    	.add(Restrictions.eq("cF.numFact", facAct))
                         .add(Restrictions.eq("cCodEps",Eps))
                         .setMaxResults(1);
                         
                      ;
                     if(criteriaFrt.list().size()>0)
                     {
                         frt=(Frt4505) criteriaFrt.uniqueResult();
                     frt.setC48ControlDePlacaBacteriana(1);
                     try{
                   em.merge(frt);
                    } catch(Exception e) {
                        DominioRipsUs dominio = new DominioRipsUs();
                        dominio.setStatus(false);
                        dominio.setMsg("Error en frt4505 : "+e.getMessage());
                        listaDominio.add(dominio);
                    }   
                     
                     }else{
                     frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("ControlPlaca1");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC48ControlDePlacaBacteriana(1);
                   
                    try{
                   em.persist(frt);
                    } catch(Exception e) {
                        DominioRipsUs dominio = new DominioRipsUs();
                        dominio.setStatus(false);
                        dominio.setMsg("Error en frt4505 : "+e.getMessage());
                        listaDominio.add(dominio);
                    } 
                   
                     }
                   
                   
                   
                   
                   
                   //listFrt4505.add(frt);
                   listRipsAc.add(ripsAc);
                   listRipsAp.add(ripsAp);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                         }
                    
                    } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
              
              }
           }
           
           
            /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **ControlPlacaBacteriana EDAD=18  100  SEX=M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=60;
         finCons="3";
        edadA=new BigInteger("20");
         edadB=new BigInteger("100");
         
           if(total>0){
          
              cont1=getTotalProc(finCons,facAct,edadA,edadB,SexAmb,new String[]{"997310"});
               DominioRipsUs auxDomi = new DominioRipsUs();
                         auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("ControlPlaca2");
                 
                 auxDomi.setSexo(String.valueOf(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
              if(cont1<total){
                  total=total-cont1;
                  
                    try{  
                    entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInprocProcdmt("997310",listaFactOdon,Eps,edadA,edadB,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                        
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           
                   
                    RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP("997310","",obj1,fec,"3",ripsAf);
                   
                 /*  RipsAt ripsAt = new RipsAt();
                  ripsAt= com.sistema.rips.pyp.utils.Utils.getAT("PRESER001","PRESERVATIVO",obj1,ripsAf);*/
                   
                  
                  
                   
                   Frt4505 frt = new Frt4505();
                   
                   Session session = em.unwrap(Session.class);
                 Criteria criteriaFrt = session.createCriteria(com.sistema.rips.pyp.entities.Frt4505.class);
                 criteriaFrt.add(Restrictions.eq("c4NumeroDeIdentificacionDelUsuario", obj1.getDocumento()))
                         .createAlias("cFact", "cF")
                .setFetchMode("cF", FetchMode.JOIN)
	    	.add(Restrictions.eq("cF.numFact", facAct))
                         .add(Restrictions.eq("cCodEps",Eps))
                         .setMaxResults(1);
                         
                      ;
                     if(criteriaFrt.list().size()>0)
                     {
                     frt=(Frt4505) criteriaFrt.uniqueResult();
                     frt.setC48ControlDePlacaBacteriana(1);frt.setC48ControlDePlacaBacteriana(1);
                     try{
                   em.merge(frt);
                    } catch(Exception e) {
                        DominioRipsUs dominio = new DominioRipsUs();
                        dominio.setStatus(false);
                        dominio.setMsg("Error en frt4505 : "+e.getMessage());
                        listaDominio.add(dominio);
                    }   
                     
                     }else{
                     frt= com.sistema.rips.pyp.utils.Utils.get4505();
                   frt.setCFact(ripsAf);
                   frt.setCCodEps(Eps);
                   frt.setCProgramaPyp("ControlPlaca1");
                   frt.setC3TipoDeIdentificacionDelUsuario(obj1.getTipdoc());
                   frt.setC4NumeroDeIdentificacionDelUsuario(obj1.getDocumento());
                   frt.setC5PrimerApellidoDelUsuario(obj1.getApellido1());
                   frt.setC6SegundoApellidoDelUsuario(obj1.getApellido2());
                   frt.setC7PrimerNombreDelUsuario(obj1.getNombre1());
                   frt.setC8SegundoNombreDelUsuario(obj1.getNombre2());
                   frt.setC9FechaDeNacimiento(obj1.getFecnac());
                   frt.setC10Sexo(obj1.getSexo());
                   frt.setC48ControlDePlacaBacteriana(1);
                   
                    try{
                   em.persist(frt);
                    } catch(Exception e) {
                        DominioRipsUs dominio = new DominioRipsUs();
                        dominio.setStatus(false);
                        dominio.setMsg("Error en frt4505 : "+e.getMessage());
                        listaDominio.add(dominio);
                    } 
                   
                     }
                   
                   
                   
                   
                   
                   //listFrt4505.add(frt);
                  // listRipsAc.add(ripsAc);
                   listRipsAp.add(ripsAp);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                         }
                    
                    } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
              
              }
           }
           
          
           
           
            /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **Fluor EDAD=3  17  SEX=M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=110;
         finCons="4";
        edadA=new BigInteger("1");
         edadB=new BigInteger("17");
         
           if(total>0){
          
              cont1=getTotalProc(finCons,facAct,edadA,edadB,SexAmb,new String[]{"997106"});
               DominioRipsUs auxDomi = new DominioRipsUs();
                         auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("Fluor");
                 
                 auxDomi.setSexo(String.valueOf(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                    
              if(cont1<total){
                  
                  total=total-cont1;

                    try{  
                    entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInprocProcdmt("997106",listaFactOdon,Eps,edadA,edadB,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                        
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                          
                   
                    RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP("997106","",obj1,fec,"3",ripsAf);
                   
                
                   
                   
                   
                   
                   //listFrt4505.add(frt);
                  // listRipsAc.add(ripsAc);
                   listRipsAp.add(ripsAp);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                         }
                    
                    } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
              
              }
           }
           
           
           
           
            /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **Fluor EDAD=18  19  SEX=M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=0;
         finCons="4";
        edadA=new BigInteger("18");
         edadB=new BigInteger("19");
         
           if(total>0){
          
              cont1=getTotalProc(finCons,facAct,edadA,edadB,SexAmb,new String[]{"997106"});
               DominioRipsUs auxDomi = new DominioRipsUs();
                         auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("Fluor");
                 
                 auxDomi.setSexo(String.valueOf(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                    
              if(cont1<total){
                  
                  total=total-cont1;

                    try{  
                    entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInprocProcdmt("997106",listaFactOdon,Eps,edadA,edadB,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                        
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                          
                   
                    RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP("997106","",obj1,fec,"3",ripsAf);
                   
                
                   
                   
                   
                   
                   //listFrt4505.add(frt);
                  // listRipsAc.add(ripsAc);
                   listRipsAp.add(ripsAp);
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                         }
                    
                    } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
              
              }
           }
           
           
           
            /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **Sellantes EDAD=3  15  SEX=M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=14;
         finCons="4";
        edadA=new BigInteger("3");
         edadB=new BigInteger("15");
         
           if(total>0){
          
              cont1=getTotalProc(finCons,facAct,edadA,edadB,SexAmb,new String[]{"997102"});
               DominioRipsUs auxDomi = new DominioRipsUs();
                         auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("Sellantes");
                 
                 auxDomi.setSexo(String.valueOf(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                    cont1=1;
              if(cont1<total){
                    try{  
                    entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInprocProcdmt("997102",listaFactOdon,Eps,edadA,edadB,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                        
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                     for (int i = 0; i < 4; i++) {
            RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP("997102","",obj1,fec,"3",ripsAf);
                   listRipsAp.add(ripsAp);
        }
                    
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                         }
                    
                    } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
              
              }
           }
           
       
           
             
            /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **Detartraje EDAD=15  40  SEX=M 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
         
                
         total=15;
         finCons="4";
        edadA=new BigInteger("12");
         edadB=new BigInteger("80");
         
           if(total>0){
          
              cont1=getTotalProc(finCons,facAct,edadA,edadB,SexAmb,new String[]{"997301"});
               DominioRipsUs auxDomi = new DominioRipsUs();
                         auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("");
                 auxDomi.setApellido2("");
                 auxDomi.setDocumento("");
                 
                 auxDomi.setSexo("");
                 auxDomi.setNombre1("");
                 auxDomi.setNombre2("");
                 auxDomi.setCodeps("");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                         
                    
                     auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1("Total : ");
                 auxDomi.setApellido2(String.valueOf(total));
                 auxDomi.setDocumento("Sellantes");
                 
                 auxDomi.setSexo(String.valueOf(cont1));
                 auxDomi.setNombre1(String.valueOf(edadA));
                 auxDomi.setNombre2(String.valueOf(edadB));
                 auxDomi.setCodeps("Programa");
                // auxDomi.setEdad(ripsAf.size());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                    cont1=1;
              if(cont1<total){
                    try{  
                    entityRipsUs= new ArrayList<>();
                 entityRipsUs=getUsInprocProcdmt("997301",listaFactOdon,Eps,edadA,edadB,total,SexAmb);
                       
                       
                         if(entityRipsUs.size()>0){
                        
                             
                          for(RipsUs obj1: entityRipsUs) {
                         
                              
                              String query = "SELECT e.feccons FROM RipsAc e WHERE e.feccons BETWEEN '"+ripsAf.getFecIni()+"' AND '"+ripsAf.getFecFin()+"' ORDER BY RAND()";
                    Query q = em.createQuery(query,Date.class);
                    fec =  (Date) q.setMaxResults(1).getSingleResult(); 
                    
                    
                           
                   
                   for (int i = 0; i < 4; i++) {
            RipsAp ripsAp = new RipsAp();
                  ripsAp= com.sistema.rips.pyp.utils.Utils.getAP("997301","",obj1,fec,"3",ripsAf);
                   listRipsAp.add(ripsAp);
        }
                  
                   
                  auxDomi = new DominioRipsUs();
                 auxDomi.setApellido1(obj1.getApellido1());
                 auxDomi.setApellido2(obj1.getApellido2());
                 auxDomi.setDocumento(obj1.getDocumento());
                 auxDomi.setNombre1(obj1.getNombre1());
                 auxDomi.setNombre2(obj1.getNombre2());
                 auxDomi.setEdad(obj1.getEdad());
                 auxDomi.setSexo(obj1.getSexo());
                 auxDomi.setCodeps(obj1.getCodeps());
                 auxDomi.setCont(cont++);
                    auxDomi.setPosicion(pos++);
                    auxDomi.setStatus(true);
                    listaDominio.add(auxDomi);
                }
                         }
                    
                    } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Query : "+e.getMessage());
            listaDominio.add(dominio);
            
        }
              
              }
           }
           
              /*********************************************************************************
         **********************************************************************************
         **********************************************************************************
         **EMPIEZAN LOS persist() 
         **********************************************************************************
         **********************************************************************************
         * ********************************************************************************
         **/
             
             
        
                try{
                if(listRipsAc.size()>0){
                    //ripsAf.setRipsAcList(listRipsAc);
                    //em.merge(ripsAf);
                   for(RipsAc obj1: listRipsAc) {
                   em.persist(obj1);
                   }  
        }
        
        } catch(Exception e) {
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en listRipsAc : "+e.getMessage());
            listaDominio.add(dominio);
        } 
                
             try{
                if(listRipsAp.size()>0){
                    //ripsAf.setRipsAcList(listRipsAc);
                    //em.merge(ripsAf);
                   for(RipsAp obj1: listRipsAp) {
                   em.persist(obj1);
                   }  
        }
        
        } catch(Exception e) {
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en listRipsAp : "+e.getMessage());
            listaDominio.add(dominio);
        }    
             
             try{
                if(listFrt4505.size()>0){
                    //ripsAf.setRipsAcList(listRipsAc);
                    //em.merge(ripsAf);
                   for(Frt4505 obj1: listFrt4505) {
                      
                    em.persist(obj1);
                   
                   
                   
                   
                   } 
        }
        
        } catch(Exception e) {
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en frt4505 : "+e.getMessage());
            listaDominio.add(dominio);
        }   
             
              try{
                if(listRipsAt.size()>0){
                    
                   for(RipsAt obj1: listRipsAt) {
                   em.persist(obj1);
                   }  
        }
        
        } catch(Exception e) {
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en listRipsAp : "+e.getMessage());
            listaDominio.add(dominio);
        }    
               
        return listaDominio;    
    }
    
    private List<RipsUs> getUsInproc2(String finCons1, List<String> lisFac2, String Epsi, List<BigInteger> listaQuin, int total, List<String> sexLis) {
        try{
            
             String s = "SELECT us FROM RipsUs us WHERE us.codeps = :codeps1 AND us.estd='ACTIVO' AND us.edad IN(:edadA) AND us.sexo IN(:sex1) AND us.documento NOT IN(SELECT ac.documento FROM RipsAc ac WHERE ac.numfac.numFact IN(:numFact1) AND ac.fincons = :finconsl ) ORDER BY RAND()" ;
                 

            Query q = em.createQuery(s);
            q.setParameter("numFact1", lisFac2)
            .setParameter("finconsl", finCons1)
            .setParameter("codeps1", Epsi)
            .setParameter("sex1", sexLis)
            .setParameter("edadA", listaQuin)
            
            .setMaxResults(total);
            
            
            /*
            
    Session session = em.unwrap(Session.class);
                Criteria criteria = session.createCriteria(com.sistema.rips.pyp.entities.RipsUs.class);
         
                
                
             /*   criteria.setFetchMode("ripsAcList", FetchMode.JOIN);
            criteria.createAlias("ripsAcList", "cAc");
            criteria.setFetchMode("cAc", FetchMode.JOIN);
            criteria.createAlias("cAc.numfac", "cF");
            criteria.setFetchMode("cF", FetchMode.JOIN);
            criteria.add(Restrictions.not(Restrictions.in("cF.numFact",
                    new String[]{"EZEQ-0118",
                        "EZEQ-7069",
                        "EZEQ7072",
                        "EZEQ7084",
                        "EZEQ7096",
                        "EZEQ-0264"})));
            criteria.add(Restrictions.not(Restrictions.eq("cAc.fincons", "05"))); CIERRA COMENTARIO ACA*/
             
             /*
             DetachedCriteria criteriaAluguel = DetachedCriteria.forClass(RipsAc.class)
	    	.setProjection(Projections.property("documento"))
                .add(Restrictions.eq("fincons", finCons1))
                  .createAlias("numfac", "cF")
                  .setFetchMode("cF", FetchMode.JOIN)
	    	.add(Restrictions.in("cF.numFact", lisFac2));
             
                  criteria.add(Property.forName("documento").notIn(criteriaAluguel));
                    criteria .add(Restrictions.eq("codeps", Epsi))
                     .add(Restrictions.in("sexo", sexLis))
                     .add(Restrictions.eq("estd", "ACTIVO"))
                     .add(Restrictions.in("edad", listaQuin))
                     .add(Restrictions.sqlRestriction("1=1 order by rand()"))
                     .setMaxResults(total);*/
                    
                       return q.getResultList();
                       
                 } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Q2 : "+e.getMessage().toString());
            listaDominio.add(dominio);
            return  new ArrayList<RipsUs>();
            
        }
    }
    
    
    
    
     public List<RipsUs> getUsInprocControl(String finConsl,List<String> lisFact,String Epsi,BigInteger edad1,BigInteger edad2, int total1,List<String>sexLis){
        try{
            
             String s = "SELECT us FROM RipsUs us WHERE us.codeps = :codeps1 AND us.estd='ACTIVO' AND us.edad BETWEEN(:edadA) AND (:edadB) AND us.sexo IN(:sex1) AND us.documento IN(SELECT ac.documento FROM RipsAc ac WHERE ac.numfac.numFact IN(:numFact1) AND ac.fincons = :finconsl ) ORDER BY RAND()" ;
                 

            Query q = em.createQuery(s);
            q.setParameter("numFact1", lisFact)
            .setParameter("finconsl", finConsl)
            .setParameter("codeps1", Epsi)
            .setParameter("sex1", sexLis)
            .setParameter("edadA", edad1)
            .setParameter("edadB", edad2)
            .setMaxResults(total1);
           
            
            
   /*   Session session = em.unwrap(Session.class);
                  
                
                Criteria criteria = (Criteria) session.createQuery("com.sistema.rips.pyp.entities.RipsUs.class");
         
                
                
              criteria.setFetchMode("ripsAcList", FetchMode.JOIN);
            criteria.createAlias("ripsAcList", "cAc");
            criteria.setFetchMode("cAc", FetchMode.JOIN);
            criteria.createAlias("cAc.numfac", "cF");
            criteria.setFetchMode("cF", FetchMode.JOIN);
            criteria.add(Restrictions.not(Restrictions.in("cF.numFact",
                    new String[]{"EZEQ-0118",
                        "EZEQ-7069",
                        "EZEQ7072",
                        "EZEQ7084",
                        "EZEQ7096",
                        "EZEQ-0264"})));
            criteria.add(Restrictions.not(Restrictions.eq("cAc.fincons", "05"))); CIERRA COMENTARIO ACA*/
             
             /*
             DetachedCriteria criteriaAluguel = DetachedCriteria.forClass(RipsAc.class)
	    	.setProjection(Projections.property("documento"))
                .add(Restrictions.eq("fincons", finConsl))
                  .createAlias("numfac", "cF")
                  .setFetchMode("cF", FetchMode.JOIN)
	    	.add(Restrictions.in("cF.numFact", lisFact));
             
                  criteria.add(Property.forName("documento").notIn(criteriaAluguel));
                    criteria .add(Restrictions.eq("codeps", Epsi))
                     .add(Restrictions.in("sexo", sexLis))
                     .add(Restrictions.eq("estd", "ACTIVO"))
                     .add(Restrictions.between("edad", edad1, edad2))
                     //.add(Restrictions.sqlRestriction("1=1 order by rand()"))
                     .setMaxResults(total1);*/
                    
                       return q.getResultList();
                       
                 } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Q2 : "+e.getMessage());
            listaDominio.add(dominio);
            return  new ArrayList<RipsUs>();
        }       
    }
     
     
     private List<RipsUs> getUsInprocProcdmt(String codproc, List<String> lisFact, String Epsi, BigInteger edad1, BigInteger edad2, int total1, List<String> sexLis) {
     try{      
       String s = "SELECT us FROM RipsUs us WHERE us.codeps = :codeps1 AND us.estd='ACTIVO' AND us.edad BETWEEN(:edadA) AND (:edadB) AND us.sexo IN(:sex1) AND us.documento NOT IN(SELECT ap.documento FROM RipsAp ap WHERE ap.numfac.numFact IN(:numFact1) AND ap.codproc = :codprocl ) ORDER BY RAND()" ;
                 

            Query q = em.createQuery(s);
            q.setParameter("numFact1", lisFact)
            .setParameter("codprocl", codproc)
            .setParameter("codeps1", Epsi)
            .setParameter("sex1", sexLis)
            .setParameter("edadA", edad1)
            .setParameter("edadB", edad2)
            .setMaxResults(total1);
         return q.getResultList();
         
     } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Q2 : "+e.getMessage());
            listaDominio.add(dominio);
            return  new ArrayList<RipsUs>();
        }      
    }

    
    public List<RipsUs> getUsInproc(String finConsl,List<String> lisFact,String Epsi,BigInteger edad1,BigInteger edad2, int total1,List<String>sexLis){
        try{
            
             String s = "SELECT us FROM RipsUs us WHERE us.codeps = :codeps1 AND us.estd='ACTIVO' AND us.edad BETWEEN(:edadA) AND (:edadB) AND us.sexo IN(:sex1) AND us.documento NOT IN(SELECT ac.documento FROM RipsAc ac WHERE ac.numfac.numFact IN(:numFact1) AND ac.fincons = :finconsl )) ORDER BY RAND()" ;
                 

            Query q = em.createQuery(s);
            q.setParameter("numFact1", lisFact)
            .setParameter("finconsl", finConsl)
            .setParameter("codeps1", Epsi)
            .setParameter("sex1", sexLis)
            .setParameter("edadA", edad1)
            .setParameter("edadB", edad2)
            .setMaxResults(total1);
           
            
            
   /*   Session session = em.unwrap(Session.class);
                  
                
                Criteria criteria = (Criteria) session.createQuery("com.sistema.rips.pyp.entities.RipsUs.class");
         
                
                
              criteria.setFetchMode("ripsAcList", FetchMode.JOIN);
            criteria.createAlias("ripsAcList", "cAc");
            criteria.setFetchMode("cAc", FetchMode.JOIN);
            criteria.createAlias("cAc.numfac", "cF");
            criteria.setFetchMode("cF", FetchMode.JOIN);
            criteria.add(Restrictions.not(Restrictions.in("cF.numFact",
                    new String[]{"EZEQ-0118",
                        "EZEQ-7069",
                        "EZEQ7072",
                        "EZEQ7084",
                        "EZEQ7096",
                        "EZEQ-0264"})));
            criteria.add(Restrictions.not(Restrictions.eq("cAc.fincons", "05"))); CIERRA COMENTARIO ACA*/
             
             /*
             DetachedCriteria criteriaAluguel = DetachedCriteria.forClass(RipsAc.class)
	    	.setProjection(Projections.property("documento"))
                .add(Restrictions.eq("fincons", finConsl))
                  .createAlias("numfac", "cF")
                  .setFetchMode("cF", FetchMode.JOIN)
	    	.add(Restrictions.in("cF.numFact", lisFact));
             
                  criteria.add(Property.forName("documento").notIn(criteriaAluguel));
                    criteria .add(Restrictions.eq("codeps", Epsi))
                     .add(Restrictions.in("sexo", sexLis))
                     .add(Restrictions.eq("estd", "ACTIVO"))
                     .add(Restrictions.between("edad", edad1, edad2))
                     //.add(Restrictions.sqlRestriction("1=1 order by rand()"))
                     .setMaxResults(total1);*/
                    
                       return q.getResultList();
                       
                 } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error : "+e.getMessage());
            DominioRipsUs dominio = new DominioRipsUs();
            dominio.setStatus(false);
            dominio.setMsg("Error en Q2 : "+e.getMessage());
            listaDominio.add(dominio);
            return  new ArrayList<RipsUs>();
        }       
    }
    
    public int getTotalCons(String finConsl,String facActl,BigInteger edad1,BigInteger edad2,List<String> sex,String[] listaCups){
    
          try{
                   
                    
                 Session session = em.unwrap(Session.class);
                 Criteria criteria = session.createCriteria(com.sistema.rips.pyp.entities.RipsUs.class);
                 
                 DetachedCriteria criteriaAluguel = DetachedCriteria.forClass(RipsAc.class)
	    	.setProjection(Projections.property("documento"))
                .createAlias("numfac", "cF")
                .setFetchMode("cF", FetchMode.JOIN)
	    	.add(Restrictions.eq("cF.numFact", facActl))
                .add(Restrictions.in("codcons",listaCups))
                .add(Restrictions.eq("fincons", finConsl));
                 
                 
                 criteria.add(Property.forName("documento").in(criteriaAluguel))
                 .add(Restrictions.between("edad", edad1, edad2))
                 .add(Restrictions.in("sexo", sex))
                         ;
                          return  criteria.list().size();
                          
                 }catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Error : "+e.getMessage());
                   
                    return 0;
                      }
                 
    
    }
    
    
    
     private int getTotalCons3(String finCons1, String facAct1, List<BigInteger> listaQuin) {
        try{
                   String[] listaCups= {"890201","890301","890205","890305"};
                    
                 Session session = em.unwrap(Session.class);
                 Criteria criteria = session.createCriteria(com.sistema.rips.pyp.entities.RipsUs.class);
                 
                 DetachedCriteria criteriaAluguel = DetachedCriteria.forClass(RipsAc.class)
	    	.setProjection(Projections.property("documento"))
                .createAlias("numfac", "cF")
                .setFetchMode("cF", FetchMode.JOIN)
	    	.add(Restrictions.eq("cF.numFact", facAct1))
                .add(Restrictions.in("codcons",listaCups))
                .add(Restrictions.eq("fincons", finCons1));
                 
                 
                 criteria.add(Property.forName("documento").in(criteriaAluguel))
                 .add(Restrictions.in("edad",listaQuin))
                         ;
                          return  criteria.list().size();
                          
                 }catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Error : "+e.getMessage());
                   
                    return 0;
                      }
    }
     
     private List<RipsUs>  getTotalCons4(String finCons1, String facAct1,String[] cupsAp) {
        try{
                   String[] listaCups= {"890201","890301","890205","890305"};
                    
                 Session session = em.unwrap(Session.class);
                 Criteria criteria = session.createCriteria(com.sistema.rips.pyp.entities.RipsUs.class);
                 
                 DetachedCriteria criteriaAc = DetachedCriteria.forClass(RipsAc.class)
	    	.setProjection(Projections.property("documento"))
                .createAlias("numfac", "cF")
                .setFetchMode("cF", FetchMode.JOIN)
	    	.add(Restrictions.eq("cF.numFact", facAct1))
                .add(Restrictions.in("codcons",listaCups))
                .add(Restrictions.eq("fincons", finCons1));
                 
                 
                 DetachedCriteria criteriaAp = DetachedCriteria.forClass(RipsAp.class)
                 .setProjection(Projections.property("documento"))
                 .createAlias("numfac", "cF")
                 .setFetchMode("cF", FetchMode.JOIN)
	    	.add(Restrictions.eq("cF.numFact", facAct1))
                .add(Restrictions.in("codproc",cupsAp));
                         
                         
                 criteria.add(Property.forName("documento").in(criteriaAc));
                 criteria.add(Property.forName("documento").notIn(criteriaAp));
                          return  criteria.list();
                          
                 }catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Error : "+e.getMessage());
                   List<RipsUs>ripsPUs = new ArrayList<>();
                    return ripsPUs;
                      }
    }
     
     private int getTotalProc(String finProc, String facAct, BigInteger edadA, BigInteger edadB, List<String> SexAmb, String[] Cups) {
         try{
                   
                    
                 Session session = em.unwrap(Session.class);
                 Criteria criteria = session.createCriteria(com.sistema.rips.pyp.entities.RipsUs.class);
                 
                 DetachedCriteria criteriaAluguel = DetachedCriteria.forClass(RipsAp.class)
	    	.setProjection(Projections.property("documento"))
                .createAlias("numfac", "cF")
                .setFetchMode("cF", FetchMode.JOIN)
	    	.add(Restrictions.eq("cF.numFact", facAct))
                .add(Restrictions.in("codproc",Cups));
                 
                 
                 criteria.add(Property.forName("documento").in(criteriaAluguel))
                 .add(Restrictions.between("edad", edadA, edadB))
                 .add(Restrictions.in("sexo", SexAmb))
                         ;
                          return  criteria.list().size();
                          
                 }catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Error : "+e.getMessage());
                   
                    return 0;
                      }
    }
     
     
    @Override
    public DominioRipsUs getTotalCons2() throws Exception{
        total=19;
        List<String> lisFac7= new ArrayList<>();
        lisFac7.add("EZEQ-6972");
        lisFac7.add("EZEQ-6982");
lisFac7.add("EZEQ-7006");
lisFac7.add("EZEQ-7017");
lisFac7.add("EZEQ-7024");
lisFac7.add("EZEQ-7038");
lisFac7.add("EZEQ-7057");
lisFac7.add("EZEQ-7067");
lisFac7.add("EZEQ-7076");
lisFac7.add("EZEQ-0192");
lisFac7.add("EZEQ-7098");
lisFac7.add("EZEQ-7108");        
     
List<BigInteger> listaQuin7 =new ArrayList<>();
listaQuin7.add(new BigInteger("4"));
listaQuin7.add(new BigInteger("11"));
listaQuin7.add(new BigInteger("16"));       
listaQuin7.add(new BigInteger("45"));

List<String> sexLis7=new ArrayList<>();
sexLis7.add("M");
sexLis7.add("F");

   String Epsi7= "CCF055";
  
  
                    String finCons7="08";
                   
                    
                    
                   
        try{
            
             String s = "SELECT us FROM RipsUs us WHERE us.codeps = :codeps1 AND us.estd='ACTIVO' AND us.edad IN(:edadA) AND us.sexo IN(:sex1) AND us.documento NOT IN(SELECT ac.documento FROM RipsAc ac WHERE ac.numfac.numFact IN(:numFact1) AND ac.fincons = :finconsl )) ORDER BY RAND()" ;
                 

            Query q = em.createQuery(s);
            q.setParameter("numFact1", lisFac7)
            .setParameter("finconsl", finCons7)
            .setParameter("codeps1", Epsi7)
            .setParameter("sex1", sexLis7)
            .setParameter("edadA", listaQuin7)
            
            .setMaxResults(total);
            
            
                   
                    
              
                         // return (int) criteria.list().size();
                          
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
    
    private Date generaDataInicial() {
                Calendar dataIni = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fecIni = "2019-06-01";
               
         try {
             Date FecIni = sdf.parse(fecIni);
             dataIni.setTime(FecIni);
		dataIni.set(Calendar.HOUR_OF_DAY, 0);
		dataIni.set(Calendar.MINUTE, 0);
		dataIni.set(Calendar.SECOND, 0);
         } catch (ParseException ex) {
             Logger.getLogger(SessionBeanOdontlg412.class.getName()).log(Level.SEVERE, null, ex);
         }
                
                
		
		
		
		return dataIni.getTime();
	}
	
	private Date generaDataFinal() {
		Calendar dataFinal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fecFin = "2019-06-30";
                
                try {
             Date FecFin = sdf.parse(fecFin);
             dataFinal.setTime(FecFin);
		dataFinal.set(Calendar.HOUR_OF_DAY, 23);
		dataFinal.set(Calendar.MINUTE, 59);
		dataFinal.set(Calendar.SECOND, 59);
         } catch (ParseException ex) {
             Logger.getLogger(SessionBeanOdontlg412.class.getName()).log(Level.SEVERE, null, ex);
         }
                
		
		
		return dataFinal.getTime();
	}
        

    @Override
    public int getCount() throws Exception {
        return 40;
    }

    
    

    

   
    
}
