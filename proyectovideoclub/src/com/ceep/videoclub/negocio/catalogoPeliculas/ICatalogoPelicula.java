
package com.ceep.videoclub.negocio.catalogoPeliculas;

public interface ICatalogoPelicula {
    
    public void agregarPelícula (String nombrePelicula,String nombreArchivo);
    public void listarPelículas (String nombreArchivo);
    public void buscarPelicula (String nombreArchivo, String buscar);
    public void iniciarArchivo (String nombreArchivo);
    
    
}
