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
public class Flauta implements Instrumento {
    private int tipoIntrumento;

    public Flauta() {
    }

    public Flauta(int tipoIntrumento) {
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
        System.out.println("Se destapan y afinan los orificios...");
        return afinado;
    }

    @Override
    public String emitirSonido() {
        String sonido="";
        System.out.println("fiu... fiu... la flauta");
        return sonido;
    }

    @Override
    public void limpiar() {
        System.out.println("limpiando boquilla...");
        System.out.println("limpiando por dentro...");
    }
    
}
