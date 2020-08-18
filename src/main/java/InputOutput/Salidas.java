/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.*;
/**
 *
 * @author pc
 */
public class Salidas {
    public static void main(String[] args) {
        //La siguiente clase vamos a generar un objeto de tipo string
        //de tipo serializado para saber como hace esta relizacion en 
        //automatico el navegador web con los string
        //Primero un onjeto a guardar
        String objeto="Mi primer objeto serializado con java";
        
        //Primero generamos el archivo
        
        File file=new File("archivaldo");
    try{
        //segundo paso muy importante: vamos a indicar el sentido de la informacion
        //si saldra informacion o entrara informacion a nuestra clase
        //En este sale informacion hacia tu PC laptop salida==escritura
        FileOutputStream fos=new FileOutputStream(file);
       
           //El tercer paso es escribir el objeto ya
        
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    
    //Escribimos el objeto que en este caso el String que se llama objeto
    oos.writeObject(objeto);
    //cerramos los archivos
    oos.close();
    fos.close();
        System.out.println("Archivo generado con exito");
    
    
    }catch(FileNotFoundException e){
    
        System.out.println("Algo malo ocurrio"+e.getMessage());
        
    
    }catch(IOException e){
        System.out.println("Algo malo ocurrio"+e.getMessage());//mama del sistema
    }
        
    }
         
    
}
