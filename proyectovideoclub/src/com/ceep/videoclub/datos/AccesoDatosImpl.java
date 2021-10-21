package com.ceep.videoclub.datos;
//el buffer reader lo cambiaremos por un SELECT en SQL

import com.ceep.videoclub.dominio.Pelicula;
import com.ceep.videoclub.excepciones.*;
/*import com.ceep.videoclub.excepciones.AccesoDatosEx;
import com.ceep.videoclub.excepciones.EscrituraDatosEx;
import com.ceep.videoclub.excepciones.LecturaDatosEx;*/
import java.util.*;
import java.io.*;

//se llama -IMPL de implementación :)
public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return true;
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);
        List<Pelicula> peliculasArrayList = new ArrayList<>();//para almacenr los obejtos
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while (lectura != null) { //hasta null
                //SI ENCUATRA UNA LÍNEA LO CONVIETE A OBJETO
                peliculasArrayList.add(new Pelicula(lectura));
                //avanzamos en la lectura
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Error de lectura listando las películas (FileNoFound)");

        } catch (IOException e) { //excepciones de E/S (lectura y escritura)
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Error de lectura listando las películas (IO)");
        }
        return peliculasArrayList;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        //PEGO EL CODIGO DE AGREGAR (escribir sobreescribe)
        File archivo = new File(nombreArchivo);
        try {
            //Invocamos al FileWriter para poder anexar la información y no spobreeescribir
            var salida = new PrintWriter(new FileWriter(nombreArchivo, true));//new File para que no sobreescriba
            //true xa que anexe info
            salida.println(pelicula.getNombre());
            salida.close();
        } catch (IOException e) { //excepciones de E/S (lectura y escritura)
            e.printStackTrace(System.out);
            throw new EscrituraDatosEx("Excepción al escribir el archivo");
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        /* var archivo = new File(nombreArchivo); //instancio objeto tipo archovo
        var resultado = "";
        try {
            var entrada = new BufferedReader(new FileReader(archivo));//entrada es el descriptor de lectura
            var lectura = entrada.readLine();//nos devuelve una linea de nuestro archivo 
            int cont = 1; //xq empieza en 0
            while (!lectura.equalsIgnoreCase(buscar)) { //mientras no sean iguales
                cont++;
                lectura = entrada.readLine();// Avanzamos en la lectura
            }
            resultado = "\nLa pelicula: " + buscar + ", está en la posición " + cont;
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return resultado;*/
        var archivo = new File(nombreArchivo);
        int cont = 1;
        String mensaje = "";
        try {
            var entrada = new BufferedReader(new FileReader(archivo));//entrada es el descriptor de lectura
            var lectura = entrada.readLine();//nos devuelve una linea de nuestro archivo 
            while (lectura != null) { //mientras no sean iguales
                if (!lectura.equalsIgnoreCase(buscar)) {
                    mensaje = "La pelicula " + buscar + "Se encuantra en la linea " + cont + " del catálogo de películas";
                    break;
                }
                lectura = entrada.readLine();
                cont++;
            }
            if (lectura == null) {
                mensaje = "La pelicula " + buscar + " no está en el catálogo";
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Error en el listado de las peliculas (FNE desde biuscar de AcceoDatos Imp)");
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new LecturaDatosEx("Error en el listado de las peliculas (IO desde biuscar de AcceoDatos Imp)");
        }
        return mensaje; // retunr resultado
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            throw new AccesoDatosEx("Error al crear el archivo (desde crear AccesoDatosImp)");
        }
    }

    @Override
    public void borrar(String nombreArchivo) { //throws AccesoDatosEx NO HACE FALTA
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
        }
        System.out.println("Se ha borrado el archivo");
    }

}
