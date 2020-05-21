/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.reutilizacion;
import computadora.computadora;
import cpu.cpu;
/**
 *
 * @author crist
 */
public class IcoFesReutilizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        computadora compu1=new computadora();
        compu1.setMarca("HP");
        compu1.setProcesador(new cpu(2.3f,"intel","rx21"));
        compu1.getProcesador().setVelocidad(3.1f);
        System.out.println(compu1.getProcesador().getVelocidad()+"");
    }

    
}
