/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.negocio;


import com.sistema.rips.pyp.dominio.DominioRipsAc;
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
public interface RipsAcIface {
    
     List<DominioRipsAc> getAll() throws Exception;
    public List<DominioRipsAc> getListaPaginationByParam(int first, int pageSize, Map<String, Object> filters,DominioRipsAf ripsAf,List<String>sexLis,int edad1,int edad2,String finConsl) ;
    public int rowCount(Map<String, Object> filters,DominioRipsAf ripsAf,List<String>sexLis,int edad1,int edad2,String finConsl) ;
    public DominioRipsUs getPrueva(List<String>sexLis,int edad1,int edad2,String finConsl) throws Exception;
    public DominioRipsAc getById(DominioRipsAc obj) throws Exception;
    public DominioRipsAc guardar(DominioRipsAc obj) throws Exception;
    public DominioRipsAc actualizar(DominioRipsAc obj) throws Exception;
    public DominioRipsAc borrar(DominioRipsAc obj) throws Exception;
    
}
