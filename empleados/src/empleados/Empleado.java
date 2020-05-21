/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;
import datos.Datos;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author crist
 */
public class Empleado {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Datos> lista=new ArrayList();
        lista.add(new Datos("José García Pérez", "sistemas", 670,30 , 5));
        lista.add(new Datos("Diana Herrera Pérez", "recursos humanos", 450, 25, 0));
        lista.add(new Datos("Jessica Juarez Días", "ventas", 400, 28, 0));
        lista.add(new Datos("Pedro Paz Orozco", "ventas", 410, 30, 0));
        lista.add(new Datos("José Marcel Pérez", "sistemas", 680, 29, 6));
        lista.add(new Datos("Jesús Días García", "recursos humanos", 455, 30, 0));
        lista.add(new Datos("Pedro Xotla Ramirez", "sistemas", 675, 27, 0));
        lista.add(new Datos("Javier Medina Blanco", "ventas", 400, 30, 4));
        lista.add(new Datos("Elizabeth Villa Sosa", "sistemas", 670, 30, 3));
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        Iterator<Datos> iterador=lista.iterator();
            int j=1;
            int suma=0;
            while(iterador.hasNext()){
            Datos sueldo=iterador.next();
            System.out.println(j);
            System.out.println("El empleado: " + sueldo.getNombre());
            int x=sueldo.getDiasTrabajados()*sueldo.getSueldoDiario();
            int y=sueldo.getHorasExtras()*85;
            int z=x+y;
            System.out.println("tiene un salario mensual sin contar horas extras de: $" + x);
            System.out.println("gana de horas extras un total de: $" + y);
            System.out.println("tiene un salario mensual de: $"+  z);
            j++;
            suma=suma+z;
            }
            System.out.println("\nsueldo total pagado a los empleados: $"+suma);
            
        Iterator<Datos> iterador2=lista.iterator();
            while (iterador2.hasNext()) {
                Datos flojo=iterador2.next();
                if (flojo.getDiasTrabajados()==25) {
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    System.out.println("\nEl empleado mas flojo es:\n ");
                    System.out.println(flojo.toString());
                    break;
                    }
                }
        Iterator<Datos> iterador3=lista.iterator();    
            while (iterador3.hasNext()) {
                Datos masHoras=iterador3.next();
                if (masHoras.getHorasExtras()==6)
                {
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    System.out.println("\nel empleado con mas horas extras; \n");
                    System.out.println(masHoras.toString());
                    break;
                    }        
            }
    }
}
