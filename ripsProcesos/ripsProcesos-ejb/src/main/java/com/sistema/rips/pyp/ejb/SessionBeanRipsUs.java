/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.ejb;


import com.sistema.rips.pyp.dominio.DominioRipsAf;
import com.sistema.rips.pyp.dominio.DominioRipsUs;
import com.sistema.rips.pyp.dominio.DominioRuta;
import com.sistema.rips.pyp.entities.RipsUs;
import com.sistema.rips.pyp.entities.Ruta;
import com.sistema.rips.pyp.negocio.RipsUsIface;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 * 
 */


@Stateless(name = "ejbRipsUs")
public class SessionBeanRipsUs implements RipsUsIface{
    @PersistenceContext(unitName = "persistenceRIPS")
    EntityManager em;

    @Override
    public List<DominioRipsUs> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DominioRipsUs> getListaPaginationByParam(int first, int pageSize, Map<String, Object> filters, DominioRipsAf ripsAf, List<String> sexLis, int edad1, int edad2, String finConsl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int rowCountByParam(Map<String, Object> filters, DominioRipsAf ripsAf, List<String> sexLis, int edad1, int edad2, String finConsl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int rowCountByRuta(DominioRuta obj) throws Exception {
         BigInteger edad1=new BigInteger(Short.toString(obj.getEdadini()));
         BigInteger edad2=new BigInteger(Short.toString(obj.getEdadfin()));
         
        
        try{
            
            String ac ="select  count(us) FROM RipsUs us  WHERE us.codeps =:codeps1 AND EXTRACT(YEAR FROM age(date('2019-03-30'),date(us.fecnac) )) BETWEEN(:edadA) AND (:edadB) AND us.sexo =:sex1 GROUP BY us";
            
            Session session = em.unwrap(Session.class);
                return (Integer) session.createQuery(ac)
		.setParameter("codeps1", obj.getCodeps())
                .setParameter("sex1", obj.getSexo())
            .setParameter("edadA", edad1)
            .setParameter("edadB", edad2)
		 .uniqueResult();
                
            
        } catch (Exception e) {
            e.printStackTrace();
            
            return 0;
        }
    }

    @Override
    public String getPrueva(DominioRuta obj) throws Exception {
        List<DominioRipsUs> p1 =new ArrayList<>();
        List<RipsUs> entityRipsUs= new ArrayList<>();
         int edad1= obj.getEdadini();
         int edad2= obj.getEdadfin();
         
        
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateInString = "2019-03-31";
        Date fecha = sdf.parse(dateInString);
        
        Calendar dataIni = Calendar.getInstance();
                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
                String fecIni = "2019-06-01";
               
         try {
             Date FecIni = sdf2.parse(fecIni);
             dataIni.setTime(FecIni);
		dataIni.set(Calendar.HOUR_OF_DAY, 0);
		dataIni.set(Calendar.MINUTE, 0);
		dataIni.set(Calendar.SECOND, 0);
         } catch (ParseException ex) {
             Logger.getLogger(SessionBeanRipsUs.class.getName()).log(Level.SEVERE, null, ex);
         }
        
          //  String ac ="select  us FROM RipsUs us  WHERE us.codeps =:codeps1 ";
        
        String ac ="select  us FROM RipsUs us  WHERE us.codeps =:codeps1 AND us.edad BETWEEN(:edadA) AND (:edadB)" ;
       //  
            //Session session = em.unwrap(Session.class);
          // Query q= session.createQuery(ac);
            
            Query q = em.createQuery(ac);
            q.setParameter("codeps1", obj.getCodeps())
                        .setParameter("edadA", edad1)
                        .setParameter("edadB", edad2);
                entityRipsUs= q.getResultList();
          
                String enteroString = "Holaa BBB Te amo Eps= "+obj.getCodeps()+" Sexo="+obj.getSexo()+" Consulta="+ac+"\n totalP1="+entityRipsUs.size();

                return enteroString;
            
        } catch (Exception e) {
           // e.printStackTrace();
            
            return e.getMessage();
        }
    }

    @Override
    public DominioRipsUs getById(DominioRipsUs obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRipsUs guardar(DominioRipsUs obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRipsUs actualizar(DominioRipsUs obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRipsUs borrar(DominioRipsUs obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
