/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.negocio;


import com.sistema.rips.pyp.dominio.DominioRuta;
import com.sistema.rips.pyp.dominio.DominioRipsAf;
import com.sistema.rips.pyp.dominio.DominioRipsUs;
import java.math.BigInteger;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 */

@Remote
public interface RipsUsIface {
    
     List<DominioRipsUs> getAll() throws Exception;
    public List<DominioRipsUs> getListaPaginationByParam(int first, int pageSize, Map<String, Object> filters,DominioRipsAf ripsAf,List<String>sexLis,int edad1,int edad2,String finConsl) ;
    public int rowCountByParam(Map<String, Object> filters,DominioRipsAf ripsAf,List<String>sexLis,int edad1,int edad2,String finConsl) ;
    public int rowCountByRuta(DominioRuta obj) throws Exception;
    public String getPrueva(DominioRuta obj) throws Exception;
    public DominioRipsUs getById(DominioRipsUs obj) throws Exception;
    public DominioRipsUs guardar(DominioRipsUs obj) throws Exception;
    public DominioRipsUs actualizar(DominioRipsUs obj) throws Exception;
    public DominioRipsUs borrar(DominioRipsUs obj) throws Exception;
    
}
