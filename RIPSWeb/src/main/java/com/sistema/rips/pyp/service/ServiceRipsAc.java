/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.service;

/**
 *
 * @author Heidelber
 */
import com.sistema.rips.pyp.dominio.DominioRipsAc;
import com.sistema.rips.pyp.dominio.DominioRipsAf;
import com.sistema.rips.pyp.dominio.DominioRipsUs;
import com.sistema.rips.pyp.utils.Utilidades;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;
import com.sistema.rips.pyp.negocio.RipsAcIface;
import com.sistema.rips.pyp.negocio.RipsAfIface;
import java.math.BigInteger;

@Service
public class ServiceRipsAc implements RipsAcIface{
    RipsAcIface ejb;

    @Override
    public List<DominioRipsAc> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DominioRipsAc> getListaPaginationByParam(int first, int pageSize, Map<String, Object> filters, DominioRipsAf ripsAf,List<String>sexLis,int edad1,int edad2,String finConsl) {
       try {
            ejb = (RipsAcIface)Utilidades.getEJBRemote("ejbRipsAc", RipsAcIface.class.getName());
            
        } catch (Exception ex) {
            Logger.getLogger(ServiceRipsAf.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
        return ejb.getListaPaginationByParam(first,pageSize, filters , ripsAf,sexLis,edad1,edad2,finConsl);
    }

    @Override
    public int rowCount(Map<String, Object> filters, DominioRipsAf ripsAf,List<String>sexLis,int edad1,int edad2,String finConsl) {
        try {
            ejb = (RipsAcIface)Utilidades.getEJBRemote("ejbRipsAc", RipsAcIface.class.getName());
        } catch (Exception ex) {
            Logger.getLogger(ServiceRipsAf.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return ejb.rowCount(filters,ripsAf,sexLis,edad1,edad2,finConsl);
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

    @Override
    public DominioRipsUs getPrueva(List<String>sexLis,int edad1,int edad2,String finConsl) throws Exception {
         try {
            ejb = (RipsAcIface)Utilidades.getEJBRemote("ejbRipsAc", RipsAcIface.class.getName());
            
        } catch (Exception ex) {
            Logger.getLogger(ServiceRipsAf.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       System.out.println("mensaje que llega a ServiceAc : "+ejb.getPrueva(sexLis, edad1, edad2, finConsl).getMsg());
       
        return ejb.getPrueva(sexLis,edad1,edad2,finConsl);
    }
    
}
