/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.service;

/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 */

import com.sistema.rips.pyp.dominio.DominioRipsAf;
import com.sistema.rips.pyp.utils.Utilidades;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;
import com.sistema.rips.pyp.negocio.RipsAfIface;

@Service
public class ServiceRipsAf implements RipsAfIface{

    RipsAfIface ejb;
    
    @Override
    public List<DominioRipsAf> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DominioRipsAf> getListaPagination(int first, int pageSize, Map<String, Object> filters) {
         try {
            ejb = (RipsAfIface)Utilidades.getEJBRemote("ejbRipsAf", RipsAfIface.class.getName());
        } catch (Exception ex) {
            Logger.getLogger(ServiceRipsAf.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ejb.getListaPagination(first,pageSize, filters );
    }

    @Override
    public int rowCount(Map<String, Object> filters) {
        try {
            ejb = (RipsAfIface)Utilidades.getEJBRemote("ejbRipsAf", RipsAfIface.class.getName());
        } catch (Exception ex) {
            Logger.getLogger(ServiceRipsAf.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ejb.rowCount(filters);
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
    
}
