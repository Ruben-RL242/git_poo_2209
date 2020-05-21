/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;
import componentes.llanta;
import componentes.chasis;
import componentes.motor;
/**
 *
 * @author crist
 */
public class vehiculo {
    private String marca;
    private int modelo;
    private String color;
    private llanta diametro;
    private motor numeroDeMotor;
    private chasis peso;

    public vehiculo() {
    }

    public vehiculo(String marca, int modelo, String color, llanta diametro, motor numeroDeMotor, chasis peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.diametro = diametro;
        this.numeroDeMotor = numeroDeMotor;
        this.peso = peso;
    }

    public chasis getPeso() {
        return peso;
    }

    public void setPeso(chasis peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public llanta getDiametro() {
        return diametro;
    }

    public void setDiametro(llanta diametro) {
        this.diametro = diametro;
    }

    public motor getNumeroDeMotor() {
        return numeroDeMotor;
    }

    public void setNumeroDeMotor(motor numeroDeMotor) {
        this.numeroDeMotor = numeroDeMotor;
    }
    
    public void encender(){
        System.out.println("encendiendo vehiculo con el motor numero"+ this.numeroDeMotor);
    }
    
    public void apagar(){
        System.out.println("apagando el vehiculo con el motor numero"+this.numeroDeMotor);
    }
    
    
    
}
