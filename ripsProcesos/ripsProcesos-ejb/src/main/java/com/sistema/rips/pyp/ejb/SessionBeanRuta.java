/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.ejb;
import com.sistema.rips.pyp.dominio.DominioRuta;
import com.sistema.rips.pyp.entities.RipsUs;
import com.sistema.rips.pyp.entities.Ruta;
import com.sistema.rips.pyp.negocio.RutaIface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Heidelber
 */

@Stateless(name = "ejbRuta")
public class SessionBeanRuta implements RutaIface{
    
    @PersistenceContext(unitName = "persistenceRIPS")
    EntityManager em;
    
    
    @Override
    public List<DominioRuta> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DominioRuta> getByPrograma(DominioRuta obj) throws Exception {
        List<DominioRuta> listaDominio = new ArrayList<>();
        List<Ruta> entityRuta=new ArrayList<>();
        
        try{
            Session session = em.unwrap(Session.class);
                entityRuta= session.createCriteria(com.sistema.rips.pyp.entities.Ruta.class)
                        .add(Restrictions.eq("programa", obj.getPrograma()))
                        .add(Restrictions.eq("codeps", obj.getCodeps()))
                        .list();
                        
                       if(entityRuta.size()>0){
                       
                           for(Ruta objAux: entityRuta) {
                           DominioRuta dominio = new DominioRuta();
                           
                           dominio.setCodRuta(objAux.getCodRuta());
                           dominio.setCodeps(objAux.getCodeps());
                           dominio.setDescrpRuta(objAux.getDescrpRuta());
                           dominio.setEdadfin(objAux.getEdadfin());
                           dominio.setEdadini(objAux.getEdadini());
                           dominio.setIdRuta(objAux.getIdRuta());
                           dominio.setPrograma(objAux.getPrograma());
                           dominio.setSexo(objAux.getSexo());
                           
                           listaDominio.add(dominio);
                           }
                           
                           
                       }
                return listaDominio;
            
        } catch (Exception e) {
            e.printStackTrace();
            DominioRuta dominio = new DominioRuta();
            dominio.setCont(1);
            dominio.setStatus(false);
            dominio.setMsg("Error de Transaccion : "+e.getMessage().toString());
            listaDominio.add(dominio);
            return listaDominio;
        }
        
    }

    @Override
    public List<DominioRuta> getListaPagination(int first, int pageSize, Map<String, Object> filters) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int rowCount(Map<String, Object> filters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRuta getById(DominioRuta obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRuta guardar(DominioRuta obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRuta actualizar(DominioRuta obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DominioRuta borrar(DominioRuta obj) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getUs(DominioRuta obj) throws Exception {
        
         List<DominioRuta> listaDominio = new ArrayList<>();
        
        
        try{
            Session session = em.unwrap(Session.class);
            List<Ruta> entityRut=new ArrayList<>();
                
            entityRut= session.createCriteria(com.sistema.rips.pyp.entities.RipsUs.class)
                        .add(Restrictions.between("edad", obj.getEdadini(),obj.getEdadfin()))
                        .add(Restrictions.eq("codeps", obj.getCodeps()))
                        .add(Restrictions.eq("sexo", obj.getSexo()))
                        .list();
                        /*
                       if(entityRuta.size()>0){
                       
                           for(Ruta objAux: entityRuta) {
                           DominioRuta dominio = new DominioRuta();
                           
                           dominio.setCodRuta(objAux.getCodRuta());
                           dominio.setCodeps(objAux.getCodeps());
                           dominio.setDescrpRuta(objAux.getDescrpRuta());
                           dominio.setEdadfin(objAux.getEdadfin());
                           dominio.setEdadini(objAux.getEdadini());
                           dominio.setIdRuta(objAux.getIdRuta());
                           dominio.setPrograma(objAux.getPrograma());
                           dominio.setSexo(objAux.getSexo());
                           
                           listaDominio.add(dominio);
                           }
                           
                           
                       }
                        
                        
                        DominioRuta dominio = new DominioRuta();
            dominio.setCont(1);
            dominio.setStatus(false);
            dominio.setMsg("Esoty en Transaccion : ");
            listaDominio.add(dominio);
                return session.createCriteria(com.sistema.rips.pyp.entities.RipsUs.class)
                        .add(Restrictions.between("edad", obj.getEdadini(),obj.getEdadfin()))
                        .add(Restrictions.eq("codeps", obj.getCodeps()))
                        .add(Restrictions.eq("sexo", obj.getSexo()))
                        .list().size();*/
                return (Integer) session.createCriteria(RipsUs.class)
		.setProjection(Projections.rowCount())
                .add(Restrictions.between("edad", obj.getEdadini(),obj.getEdadfin()))
                .add(Restrictions.eq("codeps", obj.getCodeps()))
                .add(Restrictions.eq("sexo", obj.getSexo()))
		.uniqueResult();
                
            
        } catch (Exception e) {
            e.printStackTrace();
            DominioRuta dominio = new DominioRuta();
            dominio.setCont(1);
            dominio.setStatus(false);
            dominio.setMsg("Error de Transaccion : "+e.getMessage().toString());
            listaDominio.add(dominio);
            return 0;
        }
        
    }
    
}
