/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo.clase.abstractas;


public class Pruebas {
    public static void main(String[] args) {
        Guitarra g=new Guitarra(6, 1967, "Gibson");
        System.out.println(g.getAnioConstruccion());
        g.afinar();
        g.tocar();
        
        Piano p=new Piano(40, 1999, "generico");
        System.out.println(p.getMarca());
        p.afinar();
        p.tocar();
        
        Flauta f= new Flauta(5, 2019, "Zticma");
        System.out.println(f.getMarca());
        System.out.println("marca: " + f.getMarca());
        f.afinar();
        f.tocar();
    }
}
