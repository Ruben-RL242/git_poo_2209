/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import smarthphone.Smarthphone;

/**
 *
 * @author crist
 */
public class test {
    
    public static void main(String[] args) {
        Smarthphone smart1=new Smarthphone();
        Smarthphone smart2=new Smarthphone(5999.99F,3,12);
            System.out.println("precio smart 1: "+smart1.getPrecio());
            System.out.println("precio smart 2"+smart2.getPrecio());
            System.out.println("ram smart 1: "+smart1.getRam());
            System.out.println("ram smart 2"+smart2.getRam());
    }
    
}
