/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.gui.eventos.EventosVentana;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author crist
 */
public class GridBag extends Frame {
    private String titulo;
    private int alto;
    private int ancho;
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;
    private Button boton5;

    
    public GridBag() {
    }

    public GridBag(String titulo, int alto, int ancho) {
        super(titulo);
        this.titulo = titulo;
        this.alto = alto;
        this.ancho = ancho;
        this.setSize(alto, ancho);
        setResizable(true);
        boton1= new Button("presioname1");
        boton2= new Button("presioname2");
        boton3= new Button("presioname3");
        boton4= new Button("presioname4");
        boton5= new Button("presioname5");
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc= new GridBagConstraints();
        gbc.fill=GridBagConstraints.BOTH;
        gbc.weightx=1.0;
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
      
        
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
