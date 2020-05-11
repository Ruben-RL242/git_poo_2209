/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.gui.eventos.EventosVentana;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;

/**
 *
 * @author crist
 */
public class Border extends Frame {
    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;
    private Button boton5;

    
    public Border() {
    }

    public Border(String titulo, int alto, int ancho) {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho);
        boton1= new Button("presioname1");
        boton2= new Button("presioname2");
        boton3= new Button("presioname3");
        boton4= new Button("presioname4");
        boton5=new Button("presioname 5");
        setResizable(true);
        this.setLayout(new BorderLayout());
        this.add("North",boton1);
        this.add("South",boton2);
        this.add("West",boton3);
        this.add("East",boton4);
        this.add("Center",boton5);
        
        this.addWindowListener(new EventosVentana());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    

    
}
