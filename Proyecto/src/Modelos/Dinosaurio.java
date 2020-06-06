/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author crist
 */
public class Dinosaurio {
    private String nombre;
    private String especie;
    private float peso;
    private String tamaño;
    private String alimentacion;
    private String color;
    private int numeroDePatas;

    public Dinosaurio() {
    }

    public Dinosaurio(String nombre, String especie, float peso, String tamaño, String alimentacion, String color, int numeroDePatas) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.tamaño = tamaño;
        this.alimentacion = alimentacion;
        this.color = color;
        this.numeroDePatas = numeroDePatas;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dinosaurio{" + "nombre=" + nombre + ", especie=" + especie + ", peso=" + peso + ", tama\u00f1o=" + tamaño + ", alimentacion=" + alimentacion + ", color=" + color + ", numeroDePatas=" + numeroDePatas + '}';
    }
    
    
}
