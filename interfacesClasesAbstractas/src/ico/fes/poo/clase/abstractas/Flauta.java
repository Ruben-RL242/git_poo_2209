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
public class Flauta extends Instrumento{
    private int numeroDeOrificios;

    public Flauta() {
    }

    public Flauta(int numeroDeOrificios, int anioConstruccion, String marca) {
        super(anioConstruccion, marca);
        this.numeroDeOrificios = numeroDeOrificios;
    }

    public int getNumeroDeOrificios() {
        return numeroDeOrificios;
    }

    public void setNumeroDeOrificios(int numeroDeOrificios) {
        this.numeroDeOrificios = numeroDeOrificios;
    }

    @Override
    public void tocar() {
        System.out.println("fiu.. fiu... la flauta");
    }

    @Override
    public void afinar() {
        System.out.println("se toca tapando cada orificio y si suena mal se limpia");
        System.out.println("se repite hasta hacerlo con todos los orificios");
    }  
}
