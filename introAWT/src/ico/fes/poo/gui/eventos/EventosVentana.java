/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.gui.eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author crist
 */
public class EventosVentana implements WindowListener {

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Evento opened");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Evento closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Evento closed");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Evento iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("evento deiconified");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Evento activated");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Evento Deactivated");
    }
    
}
