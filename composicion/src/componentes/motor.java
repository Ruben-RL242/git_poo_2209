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
public class motor {
    private float peso;
    private int marca;
    private float precio;

    public motor() {
    }

    public motor(float peso, int numeroDeMotor, float precio) {
        this.peso = peso;
        this.marca = numeroDeMotor;
        this.precio = precio;
    }  
    
    public void encender(){
        System.out.println("encendido");
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getNumeroDeMotor() {
        return marca;
    }

    public void setNumeroDeMotor(int numeroDeMotor) {
        this.marca = numeroDeMotor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
