/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JRadioButton;



public class Cuestionario_2 extends javax.swing.JFrame {
//vamos a generar un list de radio buttons 
    List<JRadioButton> radios=new ArrayList<>();
    List<Pregunta> preguntas = new ArrayList<>();
       int preguntaActual=0;
    
    public Cuestionario_2() {
        initComponents();
        
        radios.add(radioTituloOpcion1);
        radios.add(radioTituloOpcion2);
        radios.add(radioTituloOpcion3);
        radios.add(radioTituloOpcion4);
        
        generarCuestionario();
    }
    public void generarCuestionario(){
       //Primero se crean las opciones
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
       
       //sigue el arreglo de opcion
       
       Opcion[] opciones={op1, op2, op3, op4};
       Pregunta p1 = new Pregunta();
       p1.setTitulo("¿Cuál es la capítal de Francia?");
       p1.setOpciones(opciones);
       
       //Opciones de la pregunta numero 2
       
       Opcion op21=new Opcion();
       op21.setTitulo("Atlantico");
       op21.setCorrecta(false);
       
       Opcion op22=new Opcion();
       op22.setTitulo("Indico");
       op22.setCorrecta(false);
       
       Opcion op23=new Opcion();
       op23.setTitulo("Artico");
       op23.setCorrecta(false);
       
       Opcion op24=new Opcion();
       op24.setTitulo("Pacifico");
       op24.setCorrecta(true);
       
       //arreglo de opcion 2
        Opcion[] opciones2={op21, op22, op23, op24};
       Pregunta p2 = new Pregunta();
       p2.setTitulo("¿Cúal es el océano mas grande del Mundo?");
       p2.setOpciones(opciones2);
       
       //siguiente pregunta no.3
       
       Opcion op31=new Opcion();
       op31.setTitulo("Diocleciano");
       op31.setCorrecta(true);
        
       Opcion op32=new Opcion();
       op32.setTitulo("Remo");
       op32.setCorrecta(false);
        
       Opcion op33=new Opcion();
       op33.setTitulo("Rómulo");
       op33.setCorrecta(false);
        
       Opcion op34=new Opcion();
       op34.setTitulo("Cadno");
       op34.setCorrecta(false);
        
        //arreglo de opcion 3
       Opcion[] opciones3={op31, op32, op33, op34};
       Pregunta p3 = new Pregunta();
       p3.setTitulo("¿Qué emperador dividió al imperio romano en Oriente y Occidente");
       p3.setOpciones(opciones3);
        
       //siguiente pregunta no.4
       Opcion op41=new Opcion();
       op41.setTitulo("Ratón");
       op41.setCorrecta(false);
       
       Opcion op42=new Opcion();
       op42.setTitulo("Cucaracha");
       op42.setCorrecta(true);
       
       Opcion op43=new Opcion();
       op43.setTitulo("Escorpion");
       op43.setCorrecta(false);
       
       Opcion op44=new Opcion();
       op44.setTitulo("Vibora");
       op44.setCorrecta(false);
       
       // Arreglos no.4
       Opcion[] opciones4={op41, op42, op43, op44};
       Pregunta p4 = new Pregunta();
       p4.setTitulo("¿Cué animal prdia sobrevivir a una explosion nuclear?");
       p4.setOpciones(opciones4);
       
       //siguiente pregunta no.5
       Opcion op51=new Opcion();
       op51.setTitulo("Vatayón");
       op51.setCorrecta(false);
       
       Opcion op52=new Opcion();
       op52.setTitulo("Batallon");
       op52.setCorrecta(false);
       
       Opcion op53=new Opcion();
       op53.setTitulo("Batayón");
       op53.setCorrecta(false);
       
       Opcion op54=new Opcion();
       op54.setTitulo("Batallón");
       op54.setCorrecta(true);
       
       //arreglo opcion5
        Opcion[] opciones5={op51, op52, op53, op54};
       Pregunta p5 = new Pregunta();
       p5.setTitulo("De las siguientes palabras señala Cuál de ellas está escrtita correctamente:");
       p5.setOpciones(opciones5);
       
       //siguiente pregunta no.6
       
       Opcion op61=new Opcion();
       op61.setTitulo("Chicago");
       op61.setCorrecta(false);
       
       Opcion op62=new Opcion();
       op62.setTitulo("Manhatan");
       op62.setCorrecta(false);
       
       Opcion op63=new Opcion();
       op63.setTitulo("Nueva York");
       op63.setCorrecta(true);
      
       Opcion op64=new Opcion();
       op64.setTitulo("Orleans");
       op64.setCorrecta(false);

       //Arreglo opcion 6
        Opcion[] opciones6={op61, op62, op63, op64};
       Pregunta p6 = new Pregunta();
       p6.setTitulo("¿Doónde se encuentra la Estatua de la Libertad?");
       p6.setOpciones(opciones6);
       
       //Siguiente pregunta no.7
       Opcion op71=new Opcion();
       op71.setTitulo("Bell");
       op71.setCorrecta(false);
       
       Opcion op72=new Opcion();
       op72.setTitulo("Morse");
       op72.setCorrecta(true);
       
       Opcion op73=new Opcion();
       op73.setTitulo("Roentgen");
       op73.setCorrecta(false);
       
       Opcion op74=new Opcion();
       op74.setTitulo("Edison");
       op74.setCorrecta(false);
       
       //arreglo opcion 7
        Opcion[] opciones7={op71, op72, op73, op74};
       Pregunta p7 = new Pregunta();
       p7.setTitulo("El telégrafo eléctrico fue descubierto por:");
       p7.setOpciones(opciones7);
   
       //siguiente pregunta no. 8
       
       Opcion op81=new Opcion();
       op81.setTitulo("Dos puntos");
       op81.setCorrecta(false);
       
       Opcion op82=new Opcion();
       op82.setTitulo("Puntos suspensivos");
       op82.setCorrecta(false);
       
       Opcion op83=new Opcion();
       op83.setTitulo("Punto y seguido");
       op83.setCorrecta(true);
       
       Opcion op84=new Opcion();
       op84.setTitulo("Punto y final");
       op84.setCorrecta(false);
       
       //Arreglo opcion                
        Opcion[] opciones8={op81, op82, op83, op84};
       Pregunta p8 = new Pregunta();
       p8.setTitulo("¿Qué signo ortográfico se utiliza pàra marcar la pausa entre dos oraciones de un mismo parrafo con un significado relacionado?");
       p8.setOpciones(opciones8);
      
       //siguiente pregunta no.9
       Opcion op91=new Opcion();
       op91.setTitulo("Dinder");
       op91.setCorrecta(false);
       
       Opcion op92=new Opcion();
       op92.setTitulo("Akobo");
       op92.setCorrecta(false);
       
       Opcion op93=new Opcion();
       op93.setTitulo("Nilo");
       op93.setCorrecta(true);
       
       Opcion op94=new Opcion();
       op94.setTitulo("Rahad");
       op94.setCorrecta(false);
       
       //Arreglo apcion 9
        Opcion[] opciones9={op91, op92, op93, op94};
       Pregunta p9 = new Pregunta();
       p9.setTitulo("El río más largo de África es:");
       p9.setOpciones(opciones9);
       
       //siguiente pregunta no 10
           Opcion op101=new Opcion();
       op101.setTitulo("Pekin");
       op101.setCorrecta(false);
       
       Opcion op102=new Opcion();
       op102.setTitulo("Pyongyang");
       op102.setCorrecta(true);
       
       Opcion op103=new Opcion();
       op103.setTitulo("Tokio");
       op103.setCorrecta(false);
       
       Opcion op104=new Opcion();
       op104.setTitulo("Seul");
       op104.setCorrecta(false);
       
       //Arreglo apcion 10
        Opcion[] opciones10={op101, op102, op103, op104};
       Pregunta p10 = new Pregunta();
       p9.setTitulo("La capítal de Corea del Norte es:");
       p9.setOpciones(opciones10);
       
       Cuestionario c = new Cuestionario();
       
       //se crea el list de preguntas
       //se agregan a este list las unicas preguntas que tenemos
       
       preguntas.add(p1);
       preguntas.add(p2);
       preguntas.add(p3);
       preguntas.add(p4);
       preguntas.add(p5);
       preguntas.add(p6);
       preguntas.add(p7);
       preguntas.add(p8);
       preguntas.add(p9);
       preguntas.add(p10);
       
       //A este list le vamos a proporcionar el valor del correspondiente
        //cuestioanrio
        c.setPreguntas(preguntas);
//Primero ajustamos el titulo de la primer pregunta en la etiqueta de la preunta
        mostrarPregunta(preguntaActual);
       
       
      
}
    public void mostrarPregunta(int indicePregunta){
    //Checar si el indice de pregunta no rebaso el numero de preguntas
    //dentro del arraylist preguntas.
    etiquetaTituloPregunta.setText(preguntas.get(indicePregunta).getTitulo());

        //Llenamos con el modelo los radio buttons
        for (int i = 0; i < radios.size(); i++) {
            radios.get(i).setText(preguntas.get(indicePregunta).getOpciones()[i].getTitulo());
        }

       }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTituloPregunta = new javax.swing.JLabel();
        radioTituloOpcion1 = new javax.swing.JRadioButton();
        radioTituloOpcion2 = new javax.swing.JRadioButton();
        radioTituloOpcion3 = new javax.swing.JRadioButton();
        radioTituloOpcion4 = new javax.swing.JRadioButton();
        etiquetaMensaje = new javax.swing.JLabel();
        checkButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTituloPregunta.setText("jLabel1");

        radioTituloOpcion1.setText("jRadioButton1");
        radioTituloOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTituloOpcion1ActionPerformed(evt);
            }
        });

        radioTituloOpcion2.setText("jRadioButton2");

        radioTituloOpcion3.setText("jRadioButton3");

        radioTituloOpcion4.setText("jRadioButton4");

        checkButton.setText("Siguiente");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(etiquetaTituloPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(radioTituloOpcion2)
                                .addComponent(radioTituloOpcion1)
                                .addComponent(radioTituloOpcion3)
                                .addComponent(radioTituloOpcion4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(checkButton)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(etiquetaTituloPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(radioTituloOpcion1)
                .addGap(18, 18, 18)
                .addComponent(radioTituloOpcion2)
                .addGap(18, 18, 18)
                .addComponent(radioTituloOpcion3)
                .addGap(18, 18, 18)
                .addComponent(radioTituloOpcion4)
                .addGap(26, 26, 26)
                .addComponent(etiquetaMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(checkButton)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioTituloOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTituloOpcion1ActionPerformed
        // TODO add your handling code here:
        //aqui se invocar el algoritmo 
        //vamos a ver si funciona el isSelected()
        //para ello probamos con el primero radiotitulo0
        //boolean r0=radioTituloOpcion0.isSelected();
        //ahora ese booleano lo imprimimos en la etiqueta respuesta
        // etiqueta.setText("Tu respuesta es: "+r0);
        //vamos primero a iterar el arreglo de radios
        //primero obtenemos la primer pregunta de nuestro listado de preguntas
        if(preguntaActual<preguntas.size()){
        Opcion[] opciones = preguntas.get(preguntaActual).getOpciones();
       boolean acierto=false;
        for (int i = 0; i < radios.size(); i++) {
            if (radios.get(i).isSelected() && opciones[i].isCorrecta()) {   
                acierto=true;
                break;
            }
        } //Aqui termina el for
       etiquetaMensaje.setText("Tu respuesta es  "+acierto);
       //Este incremento hace que la siguiente pregunta sea incrementada en 1
          preguntaActual++;
        //Para  que no se lance la expcion hacer que el metodo mostrar pregunta
        //no muestre la preguta si el tamaño de ArrayList ue se llama preguntas
        // ya no tiene mas preguntas, debes de apoyarte del metodo size()
      mostrarPregunta(preguntaActual);
      
      
          } 
        
        
        
        
        
        
        
    }//GEN-LAST:event_radioTituloOpcion1ActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cuestionario_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuestionario_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuestionario_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuestionario_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
            try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuestionario_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkButton;
    private javax.swing.JLabel etiquetaMensaje;
    private javax.swing.JLabel etiquetaTituloPregunta;
    private javax.swing.JRadioButton radioTituloOpcion1;
    private javax.swing.JRadioButton radioTituloOpcion2;
    private javax.swing.JRadioButton radioTituloOpcion3;
    private javax.swing.JRadioButton radioTituloOpcion4;
    // End of variables declaration//GEN-END:variables
 public boolean checarRespuesta(Opcion[] opciones) {
        boolean correcta = false;

        for (int i = 0; i < radios.size(); i++) {
            if (radios.get(i).isSelected() && opciones[i].isCorrecta()) {
                System.out.println("Ya le atinaste");
                correcta = true;
                break;
            }
        }

        return correcta;
  }



}
