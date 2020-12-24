/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.negocio;
import com.sistema.rips.pyp.dominio.DominioRuta;

import java.util.List;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author Heidelber
 */
@Remote
public interface RutaIface {
    List<DominioRuta> getAll() throws Exception;
    List<DominioRuta> getByPrograma(DominioRuta obj) throws Exception;
    public int getUs(DominioRuta obj) throws Exception;
    public List<DominioRuta> getListaPagination(int first, int pageSize, Map<String, Object> filters)throws Exception ;
    public int rowCount(Map<String, Object> filters) ;
    public DominioRuta getById(DominioRuta obj) throws Exception;
    public DominioRuta guardar(DominioRuta obj) throws Exception;
    public DominioRuta actualizar(DominioRuta obj) throws Exception;
    public DominioRuta borrar(DominioRuta obj) throws Exception;
}
