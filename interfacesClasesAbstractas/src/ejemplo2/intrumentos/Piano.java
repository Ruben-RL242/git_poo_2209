/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2.intrumentos;

/**
 *
 * @author crist
 */
public class Piano implements Instrumento {
    private int tipoIntrumento;

    public Piano() {
    }

    public Piano(int tipoIntrumento) {
        this.tipoIntrumento = tipoIntrumento;
    }

    public int getTipoIntrumento() {
        return tipoIntrumento;
    }

    public void setTipoIntrumento(int tipoIntrumento) {
        this.tipoIntrumento = tipoIntrumento;
    }

    @Override
    public boolean afinar() {
        boolean afinado=false;
        System.out.println("Se tocan las teclas y se afinan las necesarias");
        return afinado;
    }

    @Override
    public String emitirSonido() {
        String sonido="";
        System.out.println("tin... tin... el piano");
        return sonido;
    }

    @Override
    public void limpiar() {
        System.out.println("limpiando teclas...");
        System.out.println("limpiando por dentro...");
    }
    
    
    
}
