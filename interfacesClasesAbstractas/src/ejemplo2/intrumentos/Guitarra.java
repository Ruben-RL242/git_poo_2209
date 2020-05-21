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
public class Guitarra implements Instrumento {
    private int tipoIntrumento;

    public Guitarra() {
    }

    public Guitarra(int tipoIntrumento) {
        this.tipoIntrumento = tipoIntrumento;
    }

    public int getTipoIntrumento() {
        return tipoIntrumento;
    }
    
    //este sera ignorado
    public void setTipoIntrumento(int tipoIntrumento) {
        this.tipoIntrumento = tipoIntrumento;
    }    
    
    @Override
    public boolean afinar(){
        boolean afinado=false;
        System.out.println("presionando traste 3 cuerda 5 y comparar sonido");
        System.out.println("detener hasta que el sonido sea igual");
        System.out.println("hacer el mismo procedimiento hasta llegar a cuerda 1");
        return afinado;
    }

    @Override
    public String emitirSonido() {
        String sonido="";
        sonido="Tara.....Tara..la guitarra";
        return sonido;
    }

    @Override
    public void limpiar() {
        System.out.println("limpiandi el brazo");
        System.out.println("limpiando el cuerpo...");
        System.out.println("limpiando la maquinaria de la guitarra");
        
    }       
}
