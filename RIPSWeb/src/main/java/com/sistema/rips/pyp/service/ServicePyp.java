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

import com.sistema.rips.pyp.dominio.DominioRipsAf;
import com.sistema.rips.pyp.dominio.DominioRipsUs;
import com.sistema.rips.pyp.utils.Utilidades;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;
import com.sistema.rips.pyp.negocio.pypOdontlgIface;

@Service
public class ServicePyp implements pypOdontlgIface{
pypOdontlgIface ejb;
    @Override
    public List<DominioRipsUs> getListaOdont(int first, int pageSize) throws Exception {
        try {
            ejb = (pypOdontlgIface)Utilidades.getEJBRemote("ejbOdont", pypOdontlgIface.class.getName());
        } catch (Exception ex) {
            Logger.getLogger(ServicePyp.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println("Mensaje en service = "+ejb.getListaOdont(first, pageSize).get(0).getMsg());
        return ejb.getListaOdont(first, pageSize);
    }

    @Override
    public int getCount() throws Exception {
        return ejb.getCount();
    }

    @Override
    public DominioRipsUs getTotalCons2() throws Exception {
       try {
            ejb = (pypOdontlgIface)Utilidades.getEJBRemote("ejbOdont", pypOdontlgIface.class.getName());
        } catch (Exception ex) {
            Logger.getLogger(ServicePyp.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println("Mensaje en service = "+ejb.getListaOdont(first, pageSize).get(0).getMsg());
        System.out.println("mensaje que llega a ServicePyp : "+ejb.getTotalCons2().getMsg());
        return ejb.getTotalCons2();
    }
    
    
}
