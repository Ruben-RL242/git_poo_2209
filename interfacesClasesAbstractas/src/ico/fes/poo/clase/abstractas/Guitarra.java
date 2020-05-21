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
public class Guitarra extends Instrumento {
    private int numeroDeCuerdas;

    public Guitarra() {
    }

    public Guitarra(int numeroDeCuerdas) {
        this.numeroDeCuerdas = numeroDeCuerdas;
    }

    public Guitarra(int numeroDeCuerdas, int anioConstruccion, String marca) {
        super(anioConstruccion, marca);
        this.numeroDeCuerdas = numeroDeCuerdas;
    }
    
    public int getNumeroDeCuerdas() {
        return numeroDeCuerdas;
    }

    public void setNumeroDeCuerdas(int numeroDeCuerdas) {
        this.numeroDeCuerdas = numeroDeCuerdas;
    }

    @Override
    public void afinar() {
        System.out.println("Presionando el traste 2 cuerda 6");
        System.out.println("tocando cuerda 5");
        System.out.println("ajustar hasta que ambas suenen igual");
        System.out.println("Repetir operaciones hasta cuerda 1");
    }

    @Override
    public void tocar() {
        System.out.println("taraa. taraaa.. la guitarra");
    }

}
