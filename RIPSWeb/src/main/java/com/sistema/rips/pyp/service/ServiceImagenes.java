/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistema.rips.pyp.service;

import com.sistema.rips.pyp.negocio.ImagenesIface;
import com.sistema.rips.pyp.dominio.Imagenes;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
/**
 *
 * @author SergioRios
 */
public class ServiceImagenes implements ImagenesIface {
    private ClientConfig clientConfig = new DefaultClientConfig();
    private Client client;
    private final String urlRestServiceImages = "";
    
    public ServiceImagenes() {
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        client = Client.create(clientConfig);
    }

    /*public List<Imagenes> getAllImages() {
        RequestImages request = new RequestImages();
        request.setTipoImagen("all");
        WebResource webResource = client.resource(urlRestServiceImages);
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, request);
        List<Imagenes> images  = response.getEntity(List.class);
        return images;
    }*/
    
    private Object getEJBRemote(String beanName, String viewClassName) throws Exception {
        final Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        final String appName = "ripsProcesos-ear-1.0-SNAPSHOT";
        final String moduleName = "ripsProcesos-ejb-1.0-SNAPSHOT";
        final String distinctName = "";
        final Context context = new InitialContext(jndiProperties);
        String lookup = "ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + viewClassName;
        Object obj = context.lookup(lookup);
        return obj;
    }
    
    @Override
    public List<Imagenes> getAllImages() {
        try {
            final String beanName = "ejbSessionBeanImages";
            final String viewClassName = ImagenesIface.class.getName();
            Object obj = getEJBRemote(beanName, viewClassName);
            ImagenesIface iface = (ImagenesIface)obj;
            return iface.getAllImages();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public void addImage(Imagenes imagen) {
        try {
            final String beanName = "ejbSessionBeanImages";
            final String viewClassName = ImagenesIface.class.getName();
            Object obj = getEJBRemote(beanName, viewClassName);
            ImagenesIface iface = (ImagenesIface)obj;
            iface.addImage(imagen);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteImage(Imagenes imagen) {
        try {
            final String beanName = "ejbSessionBeanImages";
            final String viewClassName = ImagenesIface.class.getName();
            Object obj = getEJBRemote(beanName, viewClassName);
            ImagenesIface iface = (ImagenesIface)obj;
            iface.deleteImage(imagen);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
