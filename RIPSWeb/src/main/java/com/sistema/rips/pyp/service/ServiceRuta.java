/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.service;

import com.sistema.rips.pyp.dominio.DominioRuta;
import org.springframework.stereotype.Service;
import com.sistema.rips.pyp.negocio.RutaIface;
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
public class ServiceRuta implements RutaIface{
RutaIface ejb;
    @Override
    public List<DominioRuta> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DominioRuta> getByPrograma(DominioRuta obj) throws Exception {
        try {
            ejb = (RutaIface)Utilidades.getEJBRemote("ejbRuta", RutaIface.class.getName());
            
        } catch (Exception ex) {
            Logger.getLogger(ServiceRipsAf.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
        return ejb.getByPrograma(obj);
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
         try {
            ejb = (RutaIface)Utilidades.getEJBRemote("ejbRuta", RutaIface.class.getName());
            
        } catch (Exception ex) {
            Logger.getLogger(ServiceRipsAf.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return ejb.getUs(obj);
    }
    
}
