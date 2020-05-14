/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author crist
 */
public class TareaFrame extends JFrame{
    public JPanel panel;
    public JLabel saludo;
    public JButton boton1;
    public JTextField cajaTexto;
    
    public TareaFrame(){
        this.setSize(500, 500);//tamaño de ventana
        this.setTitle("Introduce tu nombre");//titulo de la ventana
        //this.setLocation(500, 150);//posicion inicial de la ventana
        //this.setBounds(500, 150, 500, 500);//posicion y tamaño de ventana
        this.setLocationRelativeTo(null);//pantalla en el centro
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    private void colocarEtiqueta(){
        JLabel etiqueta=new JLabel();
        //etiqueta.setOpaque(true);// para darle color a etiqueta
        etiqueta.setText("Ingresa tu nombre: ");
        etiqueta.setBounds(10, 200, 170, 30);
        etiqueta.setForeground(Color.GREEN);
        etiqueta.setFont(new Font("Times New Roman",Font.PLAIN,20));
        //etiqueta.setBackground(Color.MAGENTA); //el color de la etiqueta
        panel.add(etiqueta);
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);

    }
    
    private void colocarCajaTexto(){
        cajaTexto=new JTextField();
        panel.add(cajaTexto);
        cajaTexto.setBounds(160, 200, 300, 30);
    }
    private void colocarBoton(){
        boton1=new JButton("Saludo");
        boton1.setBounds(150, 240, 100, 20);
        boton1.setBackground(Color.GREEN);
        boton1.setForeground(Color.BLACK);
        boton1.setFont(new Font("Times New Roman",Font.PLAIN,20));
        panel.add(boton1);
        
        saludo=new JLabel();
        saludo.setBounds(150, 300, 300, 20);
        
        ActionListener oyenteDeAccion=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Bienvenido "+cajaTexto.getText() );
            }
        };
        boton1.addActionListener(oyenteDeAccion);

    }
    

    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarBoton();
        colocarCajaTexto();
    }
}
