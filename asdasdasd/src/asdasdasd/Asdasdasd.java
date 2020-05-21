    public void aumentarSegundo(){
        int i=1;       
        while(i==1){
            horas=0;
            while (horas<25){
                System.out.println(this.horas+":"+this.minutos+":"+this.segundos +"");
                while (minutos<60){
                    System.out.println(this.horas+":"+this.minutos+":"+this.segundos +"");
                    while (segundos<60) {     
                        segundos++;
                        System.out.println(this.horas+":"+this.minutos+":"+this.segundos +"");
                    }
                    minutos++;
                    segundos=0;
                }
                horas++;
                minutos=0;
            }
        }
    }/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdasdasd;

/**
 *
 * @author crist
 */
public class Asdasdasd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
