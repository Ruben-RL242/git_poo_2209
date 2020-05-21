/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.clase.abstractas;

/**
 *
 * @author crist
 */
public class Piano extends Instrumento {
    private int numeroDeTeclas;

    public Piano() {
    }

    public Piano(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public Piano(int numeroDeTeclas, int anioConstruccion, String marca) {
        super(anioConstruccion, marca);
        this.numeroDeTeclas = numeroDeTeclas;
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }
    
    @Override
    public void afinar() {
        System.out.println("Se toca una tecla se afina de ser necesario");
        System.out.println("esto se repite hasta la ultima tecla");
    }

    @Override
    public void tocar() {
        System.out.println("tin... tin.... el piano");
    }
}