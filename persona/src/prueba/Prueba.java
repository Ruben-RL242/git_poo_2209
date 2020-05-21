/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import alumno.Alumno;
import trabajador.Trabajador;
import persona.Persona;
/**
 *
 * @author crist
 */
public class Prueba {
     public static void main(String[] args){
         //ATRIBUTOS DE UN OBJETO PERSONA//
         Persona juan=new Persona("juan","10 de abril","masculino","ROLC992810HFDBNR83");
         System.out.println("                        PERSONA");
         juan.mostrarDatos();
         //METODOS DE CLASE PERSONA//
         juan.caminar();
         juan.respirar();
         
         //ATRIBUTOS DE UN OBEJTO DE LA CLASE TRABAJADOR//
         Trabajador empleado1=new Trabajador(1000F, "ROLC990321", "CAJERO", 1999, "FERNANDO", "20 DE MARZO", "MASCULINO", "ROLC990321HDFBNR02");
         System.out.println("\n \n                   TRABAJADOR");
         empleado1.mostrarDatos();
         //METODOS DE CLASE TRABAJADOR//
         empleado1.trabajar();
         empleado1.comer();
         System.out.println(empleado1.cobrar(1000));
         System.out.println(empleado1.gastar(1200));
         
         //ATRIBUTOS DE UN OBJETO DE LA CLASE ALUMNO//
         Alumno al1=new Alumno(420123093, "ICO", 9.8F, "ruben", "21 de marzo", "masculino", "ROLC990321hdfbnr02");
         System.out.println("\n \n                   ALUMNO");
         al1.mostrarDatos();
         //METODOS DE LA CLASE ALUMNO//
         al1.estudiar();
         al1.reprobar();
         System.out.println(al1.aprobar(3));
         System.out.println(al1.escribir("historia"));
     }
}
