/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;

import java.util.*;
public class Aplicacion {
    public static void main(String[] args) {
    //con el modelo contruido podemos representar nuestra pregunta y mostrarla
   //primero creamos las opciones
   Opcion op1=new Opcion();
   op1.setTitulo("Londres");
   op1.setCorrecta(false);
   
     Opcion op2=new Opcion();
   op2.setTitulo("Roma");
   op2.setCorrecta(false);
 
     Opcion op3=new Opcion();
   op3.setTitulo("Paris");
   op3.setCorrecta(true); 
    
      Opcion op4=new Opcion();
   op4.setTitulo("Orlando");
   op4.setCorrecta(false);
   
   
   //sigue el arreglo de opciones
   Opcion []opcion={op1,op2,op3,op4};
   Pregunta p1=new Pregunta();
   p1.setTitulo("¿Cual es la capital de Francia?");
   p1.setOpciones(opcion);
   
   //para saber que es correcto, 
   //vamos a adaptar el cuestionario a lo que ya teniamos
   Cuestionario c=new Cuestionario();
   //crear el listado de preguntas
   List<Pregunta> preguntas=new ArrayList<>();
   //se agrega a esta lista la pregunta que tenemos
   preguntas.add(p1);
   //a este listado le vamos a proporcionar el valor del correspondiente
   //cuestionario
   c.setPreguntas(preguntas);
   
   for(Pregunta p: preguntas){
        System.out.println(p.getTitulo());
       
        for(Opcion o : opcion){
            System.out.println(o.getTitulo()+""+o.isCorrecta());
      
        
        }
   }
   
}
    public void generarCuestionario(){
        //con el modelo contruido podemos representar nuestra pregunta y mostrarla
   //primero creamos las opciones
   Opcion op1=new Opcion();
   op1.setTitulo("Londres");
   op1.setCorrecta(false);
   
     Opcion op2=new Opcion();
   op2.setTitulo("Roma");
   op2.setCorrecta(false);
 
     Opcion op3=new Opcion();
   op3.setTitulo("Paris");
   op3.setCorrecta(true); 
    
      Opcion op4=new Opcion();
   op4.setTitulo("Orlando");
   op4.setCorrecta(false);
   
   
   //sigue el arreglo de opciones
   Opcion []opcion={op1,op2,op3,op4};
   Pregunta p1=new Pregunta();
   p1.setTitulo("¿Cual es la capital de Francia?");
   p1.setOpciones(opcion);
   
   //para saber que es correcto, 
   //vamos a adaptar el cuestionario a lo que ya teniamos
   Cuestionario c=new Cuestionario();
   //crear el listado de preguntas
   List<Pregunta> preguntas=new ArrayList<>();
   //se agrega a esta lista la pregunta que tenemos
   preguntas.add(p1);
   //a este listado le vamos a proporcionar el valor del correspondiente
   //cuestionario
   c.setPreguntas(preguntas);
   
   for(Pregunta p: preguntas){
        System.out.println(p.getTitulo());
       
        for(Opcion o : opcion){
            System.out.println(o.getTitulo()+""+o.isCorrecta());
      
        
        }
   }

    }
}
    
    
    



    
    

