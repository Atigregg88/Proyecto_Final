/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;
import javax.swing.JFrame;
/**
 *
 * @author pc
 */
public class Aplicacion {
     
     public static void main(String[] args) {
        //aqui vamos a generar muchos objetos 
        //A esto se le llama declaracion de la variable 
       //declaracion          //instanciacion 
        JFrame ventana=new JFrame("Primera app");
    //Despues se inicializa 
 //A un objeto para que podamos interactuar con el debemos mandarle mensajes por medio de metodos 
 
ventana.setSize(400,400);
//ventana.setVisible(true);
    
    //Vamos a generar un producto 
    Producto pl=new Producto();       //constructor por defecto 
    
    pl.setNombre("Magnum");
    //A proposito NO VAMOS A ASIGNAR VALORES A SUS ATRIBUTOS 
    
    System.out.println("El nombre de este producto es: "+pl.getNombre());
    System.out.println("El precio de este producto es: "+pl.getPrecio());
    
    
    
     Abarrotes nose=new Abarrotes();
     nose.setNombre("Carlos V");
     
     //demostrar que los contructores no se heredan 
     }
    
       
    
}
