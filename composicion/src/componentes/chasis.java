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
public class chasis {
    private String marca;
    private float peso;
    private float precio;

    public chasis() {
    }

    public chasis(String marca, float peso, float precio) {
        this.marca = marca;
        this.peso = peso;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void sostener(){
        System.out.println("sostiene el auto");
}
}


