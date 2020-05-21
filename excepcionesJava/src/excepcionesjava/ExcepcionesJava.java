/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionesjava;

import ico.fes.poo.Calculadora;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class ExcepcionesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 10;
        System.out.print("Ingresa un entero");
        int y = teclado.nextInt();
        int z = 0;
        System.out.println("Dividir Enteros");
        
        try {
            z=x/y;
            int w=10/Integer.parseInt("2");
        }
        catch( ArithmeticException e ) {
            JOptionPane.showMessageDialog(null, "No se permite introducir el numero 0");
            System.out.println("Info del error:" + e.toString());
            e.printStackTrace();
        }
        catch(NumberFormatException e){
            System.out.println("no es un string valido para un numero");
        }
        catch(Exception e){
            System.out.println("Todos los demas errores no identificados");
        }
        finally{
            //tarea de limpieza
            //z=-1
            //desconexion a 
            y=0;
        }
        
        System.out.println("El resultado es "+z);
        System.out.println("W= "  );
        System.out.println("Fin del programa");
        System.out.println("Sise imprime esta linea quiere decir que todo salio bien");
        
        System.out.println("ejemplo de calculadora");
        Calculadora calc=new Calculadora();
        calc.setOperando1(10.0f);
        calc.setOperando2(3.0f);
        try {
            calc.setOperador(5);
        } catch (Exception ex) {
            System.out.println("error;" + ex.getMessage());
            ex.printStackTrace();
        }
        calc.calcular();
        //hacer el calculo
    }
}
    

