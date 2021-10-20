
package com.ceep.videoclub.test;

import java.util.Scanner;


public class Test {
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner sn = new Scanner (System.in);
        System.out.println("MENU");
        System.out.println(" 1.- Catalogo peliculas");
        System.out.println(" 2.- Agregar pelicula");
        System.out.println(" 3.- Listar peliculas");
        System.out.println(" 4.- Buscra pelicula");
        System.out.println(" 0.- Salir");
        System.out.print("Indica la opción deseada: ");
        int opcion = sn.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Hola");
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 0:
                System.out.println("Gracias!, hasta la proxima");
                break;
        
    }
        
    }
    /*ELIGE UNA OPCIÓN
        
        1. Iniciar catalogo peliculas
        2. Agregar una peli
        3. listar peliculas
        4. Buscar peliculas  ( tu peli no esta en el catalogo, la pelicula introducida se encuentra la linea X del catalogo).
        0. Salir
        
        2. Agregar pelicula
        Intorduce el nombre de la pelicula:
        
        pelicula ... agregada con exito
        listar peliculas*/
}
