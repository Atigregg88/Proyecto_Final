/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author pc
 */
public class Primarios {
    public static void main(String[]args){
        
        //los primarios:integrales:
        //byte,short, int, long
    byte b=2;
    //2 a la 8va =256
    // el siguiente es el short 
   //2 a la 16=65536/2=32768
    short s=2;
    // el siguiente es el int
    //2 a la 32
    
    int i=2;
    // el mas grnade de los integrales long
    //2 a la 64
    long l=2;
    //en programacion de sistemas SIEMPRE SE DEBEN CAMBIAR DATOS DE UN TIPO A OTRO:
   // i=b;
    i=b;
    l=s;
    s=b;
    i=s;
    //l=b;
    l=i;
   // i=s;
    /*Nota importante: cuando asignan datos de un tipo a otro se le denominan CASTING
    en español se conoce como PROMOCION, cuando no podemos promover de un tipo de dato 
   a otro por CUESTION DE TAMAÑO A ESTO SE LE DENOMINA ERROR DE CASTING*/ 
    
    
    //Hasta aqui los integrales 
    // continuamos con los flotantes (decimales)
    // el float es de 2 a la 32
    float f=2.0f;
    
    //El mas grande de esta pequeña familia double
    //El double es de 2 a la 64
    //Nota: El doble es el defecto cando tu escribes un decimal en el codigo
    double d=2.0;
     
    
    
    
    
    
    
    } 
}
