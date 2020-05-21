/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui;

import ico.fes.poo.model.ModeloCombo;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author crist
 */
public class VentanaSwing extends JFrame {
    private JLabel etiqueta;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JTextArea area;
    private JComboBox combo;
    private JButton boton5;
    
    public VentanaSwing() throws HeadlessException {
    super("Muestrario de componentes Swing");
    super.setSize(600,600);
    super.getContentPane().setLayout(new FlowLayout());
    etiqueta=new JLabel("Hola Swing");
    boton1=new JButton("Show Message");
    boton2=new JButton("Show Input");
    boton3=new JButton("Show Confirm");
    boton4= new JButton("Abrir archivo");
    area=new JTextArea(4,15);
    combo=new JComboBox();
    boton5= new JButton("Cargar datos");
    
    etiqueta.setForeground(new Color(123,12,32));
    super.getContentPane().add(etiqueta);
    super.getContentPane().add(boton1);
    super.getContentPane().add(boton2);
    super.getContentPane().add(boton3);
    super.getContentPane().add(boton4);
    super.getContentPane().add(area);
    super.getContentPane().add(boton5);
    super.getContentPane().add(combo);
    
    boton5.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent me) {
                ArrayList<String> frutas = new ArrayList();
                frutas.add("Piña");
                frutas.add("Sandia");
                frutas.add("Naranja");
                frutas.add("Melon");
                frutas.add("Kiwi");
                frutas.add("Aguacate");
                ModeloCombo model = new ModeloCombo(frutas, "");
                combo.setModel(model);
        }
        
    });
    
    boton4.addMouseListener((new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent me) {
            JFileChooser archivo=new JFileChooser();
            archivo.showOpenDialog(null);
            File arch=archivo.getSelectedFile();
            System.out.println("Ruta: "+arch.getAbsolutePath());
            try {
                FileReader fr=new FileReader(arch);
                BufferedReader bf=new BufferedReader(fr);
                String linea="";
                do{
                    linea=bf.readLine();
                    if(linea!=null)
                    area.setText(area.getText()+linea+"\n");
                }while(linea!=null);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch(IOException ioe){
                ioe.printStackTrace();
            }
            
        }
    }));
    
    boton3.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent me) {
            int respuesta=JOptionPane.showConfirmDialog(null, "¿le vas al America?","pregunta del millon",JOptionPane.YES_NO_CANCEL_OPTION);
            System.out.println("seleccionaste "+respuesta);
            if(respuesta== JOptionPane.CANCEL_OPTION){
                System.out.println("cancelaste");
            }
            if(respuesta== JOptionPane.YES_OPTION){
                System.out.println("puedes cambiarte de carrera");
            }
            if(respuesta== JOptionPane.NO_OPTION){
                System.out.println("qudate");
            }
        }
        
    });
    
    boton2.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent me) {
            String respuesta=JOptionPane.showInputDialog("Ingresa tu nombre:");
            System.out.println("Escribiste"+respuesta.toUpperCase());
        }
        
    });
    
    boton1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent me) {
            JOptionPane.showMessageDialog(boton1, "Este es un mensaje","Aviso importante",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(System.getProperty("user.dir")+"/src/hulk.png"));
        }
        
    });
    
    this.setLocationRelativeTo(null);
    etiqueta.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent me) {
            System.out.println("Clic en etiqueta");
            etiqueta.setText("");
            System.out.println(System.getProperty("user.dir"));
            ImageIcon icon=new ImageIcon(System.getProperty("user.dir")+"/src/hulk.png");
            etiqueta.setIcon(icon);
        }    
    });
    
    super.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
        
    });
    
    }
    
    
}
