/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;
import persona.Persona;
/**
 *
 * @author crist
 */
public class Alumno extends Persona{
    private int numeroDeCuenta;
    private String carrera;
    private float promedio;

    public Alumno() {
    }
    
    
    public Alumno(int numeroDeCuenta, String carrera, float promedio, String nombre, String fechaDeNacimiento, String sexo, String curp) {
        super(nombre, fechaDeNacimiento, sexo, curp);
        this.numeroDeCuenta = numeroDeCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public void estudiar(){
        System.out.println(this.getNombre()+" esta estudiando");
    }
    
    public void reprobar(){
        System.out.println(this.getNombre()+" esta reprobando");
    }
    
    public int aprobar(int aprobadas){
        System.out.println("el alumno con numero de cuenta "+this.numeroDeCuenta+" aprobo este numero de materias");
        aprobadas=3;
        return 3;
    }
    
    public String escribir(String tema){
        System.out.println("el alumno "+this.getNombre()+" esta escribiendo sobre");
        tema="histora";
        return "historia";
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("nombre:"+getNombre()
                            +"\nfecha de nacimiento:"+getFechaDeNacimiento()
                            +"\nsexo:"+getSexo()
                            +"\ncurp:"+getCurp()
                            +"\nnumero de cuenta:"+this.numeroDeCuenta
                            +"\ncarrera:"+this.carrera
                            +"\npromedio:"+this.promedio);
    }

}
