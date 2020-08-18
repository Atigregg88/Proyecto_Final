/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;
 import java.util.*;

public class ArreglosOrdenados {
    public static void main(String[] args) {
    
    //los arreglos mutables se dividen en los grandes grupos
    //mutables u ordenados: List y la clase ArrayList
    //mutables y desordenados : set y hashset
    //primero veremos arreglos ordenados
    //estos arreglos ademas de tener cierto orden aceptan repeticion 
    
    List<Integer> elementos=new ArrayList<>(); //mutable
    //lo llenamos 
    elementos.add(5);
    elementos.add(-6);
    elementos.add(24);
    elementos.add(5);
    //para recorrer el arreglo usamos el ciclo FOR mejorado 
    for(Integer x: elementos){
         System.out.println(x); 
             
    }
    //ahora vamos a ver los de la familia set y hashset
    //esta desordenado y no acepta repeticion
    Set<Integer> otros=new HashSet<>();
    otros.add(8);
    otros.add(5);
    otros.add(-6);
    otros.add(24);
    for(Integer x: otros){
        System.out.println(x);
              
    }
    //para ver el tamaño de estos arreglos existe el metodo size()
        System.out.println("El tamaño del primer arreglo es:"+elementos.size());
      
    //para buscar un alemento en los List y ListArray usamos el metodo
    //get(indice)
    //vamos a obtener el elemento -6 del primer arreglo 
        System.out.println("Obtenemos el -6: "+elementos.get(1));
    //el siguiente metodo es para remover un elemento
        System.out.println("Quitamos el -6 "+elementos.remove(1));
    //para darnos cuenta que lo removio volvemos a alterar el arreglo 
    
    for(Integer x:elementos){
         System.out.println(x);    
    }
    //si quieres sustituir un indice en particular un elemento  usas el metodo 
    //como ejemplo: en esta arreglo vamos a susituir el 24 por el numero 0
    //este metodo en sisteas reales  se usa para actualizar
        System.out.println("---------------------------------------------------");
    elementos.set(1,0);
    //lo mostramos 
    for(Integer x: elementos) {
        System.out.println(x);
    }
    
    }
    
    
}
