/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarthphone;

/**
 *
 * @author crist
 */
public class Smarthphone {
    private float precio;
    private float ram;
    private float rom;

    public Smarthphone() {
    }

    public Smarthphone(float precio, float ram, float rom) {
        this.precio = precio;
        this.ram = ram;
        this.rom = rom;
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    public float getRom() {
        return rom;
    }

    public void setRom(float rom) {
        this.rom = rom;
    }
    
}
