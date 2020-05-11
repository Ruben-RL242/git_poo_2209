/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introawt;

import ico.fes.poo.gui.Border;
import ico.fes.poo.gui.Grid;
import ico.fes.poo.gui.GridBag;
import ico.fes.poo.gui.Ventana;

/**
 *
 * @author crist
 */
public class IntroAWT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana ven1= new Ventana("hola mundo GUI Java", 600, 600);
        ven1.setVisible(true);
        Border ven2= new Border("hola mundo GUI Java", 550, 550);
        ven2.setVisible(true);
        Grid ven3= new Grid("hola mundo GUI Java", 500, 500);
        ven3.setVisible(true);
        GridBag ven4= new GridBag("hola mundo GUI Java", 450, 450);
        ven4.setVisible(true);
    }
    
}
