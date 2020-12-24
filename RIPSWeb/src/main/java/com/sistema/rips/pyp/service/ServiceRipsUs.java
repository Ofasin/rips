/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.service;
import com.sistema.rips.pyp.dominio.DominioRipsAf;
import com.sistema.rips.pyp.dominio.DominioRipsUs;
import com.sistema.rips.pyp.dominio.DominioRuta;
import org.springframework.stereotype.Service;
import com.sistema.rips.pyp.negocio.RipsUsIface;
import com.sistema.rips.pyp.utils.Utilidades;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 */

@Service
public class ServiceRipsUs implements RipsUsIface{
    RipsUsIface ejb;
    
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
        try {
            ejb = (RipsUsIface)Utilidades.getEJBRemote("ejbRipsUs", RipsUsIface.class.getName());
            
        } catch (Exception ex) {
            Logger.getLogger(ServiceRipsAf.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return ejb.rowCountByRuta(obj);
    }

    @Override
    public String getPrueva(DominioRuta obj) throws Exception {
        try {
            ejb = (RipsUsIface)Utilidades.getEJBRemote("ejbRipsUs", RipsUsIface.class.getName());
            
        } catch (Exception ex) {
            Logger.getLogger(ServiceRipsAf.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return ejb.getPrueva(obj);
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
