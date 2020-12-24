/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.negocio;
import com.sistema.rips.pyp.dominio.DominioRutadetll;
import java.util.List;
import java.util.Map;



/**
 *
 * @author Heidelber
 */
public interface RutadetIface {
    List<DominioRutadetll> getAll() throws Exception;
    List<DominioRutadetll> getByRuta() throws Exception;
    public List<DominioRutadetll> getListaPagination(int first, int pageSize, Map<String, Object> filters)throws Exception ;
    public int rowCount(Map<String, Object> filters) ;
    public DominioRutadetll getById(DominioRutadetll obj) throws Exception;
    public DominioRutadetll guardar(DominioRutadetll obj) throws Exception;
    public DominioRutadetll actualizar(DominioRutadetll obj) throws Exception;
    public DominioRutadetll borrar(DominioRutadetll obj) throws Exception;
}
