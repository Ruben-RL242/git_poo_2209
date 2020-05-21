/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajador;

import persona.Persona;

/**
 *
 * @author crist
 */
public class Trabajador extends Persona {
    private float salario;
    private String rfc;
    private String puesto;
    private int añoDeIngreso;

    public Trabajador() {
    }
    
    public Trabajador(float salario, String rfc, String puesto, int añoDeIngreso, String nombre, String fechaDeNacimiento, String sexo, String curp) {
        super(nombre, fechaDeNacimiento, sexo, curp);
        this.salario = salario;
        this.rfc = rfc;
        this.puesto = puesto;
        this.añoDeIngreso = añoDeIngreso;
    }

    public int getAñoDeIngreso() {
        return añoDeIngreso;
    }

    public void setAñoDeIngreso(int añoDeIngreso) {
        this.añoDeIngreso = añoDeIngreso;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void trabajar(){
        System.out.println(this.getNombre()+" esta trabajando");
    }
    
    public void comer(){
        System.out.println(this.getNombre()+" esta comiendo");
    }
    
    public int cobrar(int cobro){
        System.out.println("trabajador"+this.getNombre()+ " cobro:");
        cobro=1000;
        return 1000;
    }
    
    public int gastar(int gasto){
        System.out.println("el trabajador"+this.getNombre()+ " gasto:");
        gasto=1200;
        return 1200;
    }
    
        @Override
    public void mostrarDatos(){
        System.out.println("nombre:"+getNombre()
                            +"\nfecha de nacimiento:"+getFechaDeNacimiento()
                            +"\nsexo:"+getSexo()
                            +"\ncurp:"+getCurp()
                            +"\nsalario:"+this.salario
                            +"\nRFC:"+this.rfc
                            +"\npuesto:"+this.puesto
                            +"\naño de ingreso:"+this.añoDeIngreso);
    }
}
