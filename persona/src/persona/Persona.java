/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author crist
 */
public class Persona {
    private String nombre;
    private String fechaDeNacimiento;
    private String sexo;
    private String curp;

    public Persona() {
    }
    
    public Persona(String nombre, String fechaDeNacimiento, String sexo, String curp) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sexo = sexo;
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void caminar(){
        System.out.println(this.nombre+" esta Caminando");
    }
    
    public void respirar(){
        System.out.println(this.nombre+" esta respirando");
    }
    
    public void mostrarDatos(){
        System.out.println("nombre:"+nombre
                + "\nfecha de nacimiento:"+this.fechaDeNacimiento
                + "\nsexo:"+this.sexo
                +"\ncurp:"+this.curp);
    }

    
}
