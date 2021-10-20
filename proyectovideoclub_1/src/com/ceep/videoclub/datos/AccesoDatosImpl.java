
package com.ceep.videoclub.datos;

import com.ceep.videoclub.dominio.Pelicula;
import java.util.*;


public class AccesoDatosImpl implements IAccesoDatos{

    @Override
    public boolean existe(String nombreArchivo) {
        return true; 
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) {
        List<Pelicula> peliculas = new ArrayList<>();
        return peliculas;
    }

    @Override
    public void escribir(boolean anexar) {

    }

    @Override
    public String crear(String nombreArchivo) {
        return "";
    }

    @Override
    public String buscar(String nombreArchivo) {
        return "";
    }
    
   
}
