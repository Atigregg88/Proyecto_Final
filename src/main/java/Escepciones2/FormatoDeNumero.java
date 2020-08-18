/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escepciones2;


public class FormatoDeNumero {
    public static void main(String[] args) {
        //Esta excepcion es muy importante cuando alimentamos 
        //datos en un campo de texto por medio de java
String falsoNumero="cuatro";
//Lo transformamos a un numero entero usando la clase 
//Wrapper (envoltorio) integer
//integer un texto con formato de numero lo puedamos comvertir un numero que sea verdadero (real)
  int numero=         Integer.parseInt(falsoNumero);
  
  int producto=2*numero;
        System.out.println("El doble del numero es "+producto);

        
    }
        
        
        
        
        
}
