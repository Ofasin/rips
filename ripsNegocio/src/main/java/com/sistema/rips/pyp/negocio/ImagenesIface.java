/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.negocio;

import com.sistema.rips.pyp.dominio.Imagenes;
import java.util.List;
import javax.ejb.Remote;
/**
 *
 * @author HeidelberGonzalezIguaran
 */
@Remote
public interface ImagenesIface {
    List<Imagenes> getAllImages();
    void addImage(Imagenes imagen);
    void deleteImage(Imagenes imagen);
}
