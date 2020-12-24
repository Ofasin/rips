/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.negocio;

import javax.ejb.Remote;

import com.sistema.rips.pyp.dominio.DominioRipsAc;
import com.sistema.rips.pyp.dominio.DominioRipsAf;
import com.sistema.rips.pyp.dominio.DominioRipsUs;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 */


@Remote
public interface pypOdontlgIface {
    public List<DominioRipsUs> getListaOdont(int first, int pageSize)throws Exception;
    public int getCount()throws Exception;
    public DominioRipsUs getTotalCons2() throws Exception;
    
    
    
}
