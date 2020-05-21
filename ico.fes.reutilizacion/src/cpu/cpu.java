/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpu;

/**
 *
 * @author crist
 */
public class cpu {
    private float velocidad;
    private String marca;
    private String modelo;
    
    public cpu(){
        
    }

    public cpu(float velocidad, String marca, String modelo) {
        this.velocidad = velocidad;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void encender(){
        System.out.println("encendiendo cpu");
    }
    
}
