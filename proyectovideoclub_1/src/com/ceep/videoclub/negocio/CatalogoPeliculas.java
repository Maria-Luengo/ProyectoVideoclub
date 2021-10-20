
package com.ceep.videoclub.negocio;

import com.ceep.videoclub.dominio.Pelicula;
import java.util.*;


public class CatalogoPeliculas implements ICatalogoPelicula{

    @Override
    public void agregarPelícula(String nombrePelicula, String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarPelículas(String nombreArchivo) {
        List<Pelicula> peliculas = new ArrayList<>();
       // peliculas = listar(nombreArchivo); -> falta crear el objeto
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
