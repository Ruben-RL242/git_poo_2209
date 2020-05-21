/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

/**
 *
 * @author crist
 */
public class llanta {
    private String marca;
    private int diametro;
    private float presionMaxima;

    public llanta() {
    }

    public llanta(String marca, int diametro, float presionMaxima) {
        this.marca = marca;
        this.diametro = diametro;
        this.presionMaxima = presionMaxima;
    }

    public float getPresionMaxima() {
        return presionMaxima;
    }

    public void setPresionMaxima(float presionMaxima) {
        this.presionMaxima = presionMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }
    
    public void rodar(){
        System.out.println("rodando");
    }
}
