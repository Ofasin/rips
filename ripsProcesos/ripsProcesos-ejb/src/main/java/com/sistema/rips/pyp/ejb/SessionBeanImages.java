/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.ejb;

import com.sistema.rips.pyp.negocio.ImagenesIface;
import com.sistema.rips.pyp.dominio.Imagenes;
import com.sistema.rips.pyp.dominio.Imagenes;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name = "ejbSessionBeanImages")
public class SessionBeanImages implements ImagenesIface {
    @PersistenceContext(unitName = "persistenceRIPS")
    EntityManager em;

    private void setImages() {
        int cont = 1;
        List<Imagenes> images = new ArrayList<>();
        Imagenes img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("cat.jpg");
        img.setName("CAT");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("google.jpg");
        img.setName("Google");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("logo_citi.png");
        img.setName("Citi");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("logo_imss.jpg");
        img.setName("IMSS");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("logo_sagarpa.jpg");
        img.setName("SAGARPA");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("logo_sfp.jpg");
        img.setName("SFP");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("pemex.jpg");
        img.setName("PEMEX");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("pfizer.jpg");
        img.setName("pFizer");
        images.add(img);
    }

    @Override
    public List<Imagenes> getAllImages() {
        try {
            
            int cont = 1;
        List<Imagenes> images = new ArrayList<>();
        Imagenes img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("cat.jpg");
        img.setName("CAT");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("google.jpg");
        img.setName("Google");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("logo_citi.png");
        img.setName("Citi");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("logo_imss.jpg");
        img.setName("IMSS");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("logo_sagarpa.jpg");
        img.setName("SAGARPA");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("logo_sfp.jpg");
        img.setName("SFP");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("pemex.jpg");
        img.setName("PEMEX");
        images.add(img);
        img = new Imagenes();
        img.setIdImage(cont++);
        img.setUrl("pfizer.jpg");
        img.setName("pFizer");
        images.add(img);
        return images;
            /*
            
            Query query = em.createNamedQuery("Imagenes.findAll");
            List<com.sistema.rips.pyp.entities.Imagenes> lista = query.getResultList();
            if(lista.size() > 0) {
                List<Imagenes> imagenes = new ArrayList<>();
                for(com.sistema.rips.pyp.entities.Imagenes img: lista) {
                    Imagenes imagen = new Imagenes();
                    imagen.setIdImage(img.getIdImage());
                    imagen.setName(img.getName());
                    imagen.setUrl(img.getUrl());
                    imagenes.add(imagen);
                }
                return imagenes;
            } else {
                List<Imagenes> imagenes = new ArrayList<>();
                return imagenes;
            }*/
        } catch(Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void addImage(Imagenes imagen) {
        com.sistema.rips.pyp.entities.Imagenes img = new com.sistema.rips.pyp.entities.Imagenes();
        img.setName(imagen.getName());
        img.setUrl(imagen.getUrl());
        em.persist(img);
    }

    @Override
    public void deleteImage(Imagenes imagen) {
        com.sistema.rips.pyp.entities.Imagenes img = getImageByNombre(imagen);
        if(img != null) {
            em.remove(img);
        }
    }

    private com.sistema.rips.pyp.entities.Imagenes getImageByNombre(Imagenes imagen) {
        try {
            Query query = em.createNamedQuery("Imagenes.findByName");
            query.setParameter("name", imagen.getName());
            List<com.sistema.rips.pyp.entities.Imagenes> lista = query.getResultList();
            if(lista.size() > 0) {
                com.sistema.rips.pyp.entities.Imagenes img = lista.get(0);
                return img;
            } else {
                return null;
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

   

}
