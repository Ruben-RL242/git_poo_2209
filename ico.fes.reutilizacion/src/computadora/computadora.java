/*
 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import cpu.cpu;
import ram.ram;



/**
 *
 * @author crist
 */
public class computadora {
    private String marca;
    private String modelo;
    private String color;
    private ram capacidad;
    private cpu procesador;

    public computadora() {
    }

    public computadora(String marca, String modelo, String color, ram ram, cpu cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.capacidad = ram;
        this.procesador = cpu;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ram getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(ram capacidad) {
        this.capacidad = capacidad;
    }

    public cpu getProcesador() {
        return this.procesador;
    }

    public void setProcesador(cpu procesador) {
        this.procesador = procesador;
    }
    
    
    public void encender(){
        System.out.println("encendiendo...");
    }
    
    public void apagar(){
        System.out.println("apagando...");
    }
    
        
}
