/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author crist
 */
public class Datos {
    private String nombre;
    private String departamento;
    private int sueldoDiario;
    private int diasTrabajados;
    private int horasExtras;

    public Datos() {
    }

    public Datos(String nombre, String departamento, int sueldoDiario, int diasTrabajados, int horasExtras) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldoDiario = sueldoDiario;
        this.diasTrabajados = diasTrabajados;
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(int sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
    
    public void calcularSalario(){
        int pagaDeExtras=horasExtras*85;
        int salarioMensual=sueldoDiario*diasTrabajados;
        int salarioIndividual=pagaDeExtras+salarioMensual;
        System.out.println(salarioIndividual);
    }
    
    @Override
    public String toString() {
        return "Nombre= " + nombre + "\nDepartamento= " 
                + departamento + "\nSueldo Diario= $" + sueldoDiario 
                + "\nDias Trabajados= " + diasTrabajados 
                + "\nHoras Extras= " + horasExtras;
    }
    
    
}
