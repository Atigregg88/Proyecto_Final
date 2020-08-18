/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;

/**
 *
 * @author pc
 */
//cuando una clase se compone de otra clase
// a eto se le conoce como patroes de diseño
//creacionales, a este creacional se le llama COMPOSICION AGREGACION 

public class Pregunta {
    private String titulo;
    private Opcion opciones[];

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Opcion[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Opcion[] opciones) {
        this.opciones = opciones;
    }

    void setOpciones(Iterable<Opcion> opciones) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
