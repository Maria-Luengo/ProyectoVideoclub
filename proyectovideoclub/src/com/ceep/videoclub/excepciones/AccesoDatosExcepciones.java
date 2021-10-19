
package com.ceep.videoclub.excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class AccesoDatosExcepciones extends Exception{

    public AccesoDatosExcepciones(String mensaje) {
        super(mensaje);
    }
    
    
}
