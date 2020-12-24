/**
 * Todos los Derechos Reservados © 2019 WAYUU - SOFT.
 * Sistema de Control y verificacion de RIPS.
 * Este software contiene información propiedad exclusiva de WAYUU - SOFT considerada Confidencial.
 * Queda totalmente prohibido su uso o divulgación en forma parcial o total.
 * ----------------------------------------------------------------------------
 * Nombre de Aplicacion: Sistema Rips
 * Nombre de archivo: RipsAcIface.java
 * Fecha de creacion : Junio, 2019
 * @author : Heidelber Gonzalez Iguaran
 * @version 1.0
 *
 * Bitácora de modificaciones:
 * CR/Defecto 		Fecha 			Autor 			Descripción del cambio
 * ----------------------------------------------------------------------------
**/

package com.sistema.rips.pyp.negocio;

import com.sistema.rips.pyp.dominio.DominioRipsAf;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author HeidelberNiwmanGonzalezIguaran
 */

@Remote
public interface RipsAfIface {
    List<DominioRipsAf> getAll() throws Exception;
    public List<DominioRipsAf> getListaPagination(int first, int pageSize, Map<String, Object> filters) ;
    public int rowCount(Map<String, Object> filters) ;
    public DominioRipsAf getById(DominioRipsAf obj) throws Exception;
    public DominioRipsAf guardar(DominioRipsAf obj) throws Exception;
    public DominioRipsAf actualizar(DominioRipsAf obj) throws Exception;
    public DominioRipsAf borrar(DominioRipsAf obj) throws Exception;
    
}
