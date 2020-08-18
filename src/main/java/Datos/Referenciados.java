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
public class Referenciados {
   
    public static void main(String[]args){
 
    //vamos a ver aqui en esta clase al referenciado mas importante
    //TODOS LOS TIPOS DE DATOS REFERENCIADO SON LOS QUE SE CONTRUYEN POR MEDIO DE UNA CLASE
    //EL REFERENCIADO MAS IMPORTANTE ES EL STRING    
      String mensaje="Hola mundo";
      String falsoNumero="5";
      int verdaderoNumero=5;
      int suma=10+verdaderoNumero;
//el siguiente es incorrecto porque no se puede asignar un string a un primario
      
         String malo=10+falsoNumero;//no marca error porque podemos concatenarlos 
   //generalmente un texto siempre seciber un string aun cuando tu escribas un numero
//siempre tienes que convertir a el numerico primario 
int numeroPromovido=Integer.parseInt(falsoNumero);
        String falsoFlotante="23.5f";
        float flotanteReal=Float.parseFloat(falsoFlotante);
    }
    
    
}
