/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

import componentes.motor;
import vehiculo.vehiculo;

/**
 *
 * @author crist
 */
public class testvehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        vehiculo vehiculo1=new vehiculo();
        vehiculo1.setColor("rojo");
        vehiculo1.setNumeroDeMotor(new motor(123312.12F,1233441,3000.50F));
        
        //cambiar el peso del motor
        vehiculo1.getNumeroDeMotor().setPeso(0);
        System.out.println("peso del motor:"+vehiculo1.getNumeroDeMotor().getPeso());
    }
    
}
