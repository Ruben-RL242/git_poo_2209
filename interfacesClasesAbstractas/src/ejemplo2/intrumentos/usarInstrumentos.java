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
public class usarInstrumentos {
    public static void main(String[] args) {
        Guitarra g= new Guitarra(Instrumento.GUITARRA);
        Piano p= new Piano(Instrumento.PIANO);
        
        System.out.println(g.emitirSonido());
        System.out.println("**************************");
        System.out.println(p.emitirSonido());
        
        System.out.println(g.getTipoIntrumento());
        
        System.out.println(p.getTipoIntrumento());
        
        switch(g.getTipoIntrumento()){
            case Instrumento.GUITARRA:
                System.out.println("el intrumento es una guitarra");
                break;
            case Instrumento.PIANO:
                System.out.println("es un piano");
                break;
            case Instrumento.FLAUTA:
                System.out.println("es una flauta");
                break;
            default:
                throw new AssertionError();
        }
    }
}
