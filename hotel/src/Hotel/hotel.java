package Hotel;
import Hotel.sinServiciosSinVistas;
import Hotel.sinServiciosConVistaAlMar;
import Hotel.sinServiciosConVistaAlCampoDeGolf;
import Hotel.conServiciosSinVista;
import Hotel.conServiciosConVistaAlMar;
import Hotel.conServiciosConVistaAlCampoDeGolf;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 *//**
 *
 * @author crist
 */
public class hotel {
    public static void main(String[] args){
        //aqui se prueban las reservaciones de habitaciones sin servicios incluidos y sin ninguna vista//
        sinServiciosSinVistas registro=new sinServiciosSinVistas("asd", "3pm", "12pm", 10, 11, 7, 9, 5);
        System.out.println(registro.toString());
        registro.hacerReservacionSencilla();
        registro.hacerReservacionDoble();
        registro.hacerReservacionSuite();
        registro.hacerReservacionKing();
        registro.hacerReservacionPresidencial();
        System.out.println(registro.toString());
        registro.eliminarReservacionSencilla();
        registro.eliminarReservacionDoble();
        registro.eliminarReservacionSuite();
        registro.eliminarReservacionKing();
        registro.eliminarReservacionPresidencial();
        System.out.println(registro.toString());
        
        //Aqui se prueban las reservacions de habitaciones sin servicios con vista al mar//
        sinServiciosConVistaAlMar registro1=new sinServiciosConVistaAlMar("asd", "3pm", "12pm", 2, 7, 5, 9, 1);
        System.out.println(registro1.toString());
        registro1.hacerReservacionSencilla();
        registro1.hacerReservacionDoble();
        registro1.hacerReservacionSuite();
        registro1.hacerReservacionKing();
        registro1.hacerReservacionPresidencial();
        System.out.println(registro1.toString());
        registro1.eliminarReservacionSencilla();
        registro1.eliminarReservacionDoble();
        registro1.eliminarReservacionSuite();
        registro1.eliminarReservacionKing();
        registro1.eliminarReservacionPresidencial();
        System.out.println(registro1.toString());
        
        //Aqui se prueban las reservaciones de habitaciones sin servicios con vista al campo de golf//
        sinServiciosConVistaAlCampoDeGolf registro2=new sinServiciosConVistaAlCampoDeGolf("asd", "3pm", "12pm", 1, 2, 3, 4, 5);
        System.out.println(registro2.toString());
        registro2.hacerReservacionSencilla();
        registro2.hacerReservacionDoble();
        registro2.hacerReservacionSuite();
        registro2.hacerReservacionKing();
        registro2.hacerReservacionPresidencial();
        System.out.println(registro2.toString());
        registro2.eliminarReservacionSencilla();
        registro2.eliminarReservacionDoble();
        registro2.eliminarReservacionSuite();
        registro2.eliminarReservacionKing();
        registro2.eliminarReservacionPresidencial();
        System.out.println(registro2.toString());
        
        //Aqui se prueban las reservaciones de habitaciones con servicios//
        conServiciosSinVista registro3=new conServiciosSinVista("asd", "3pm", "12pm", 3, 1, 9, 3, 10);
        System.out.println(registro3.toString());
        registro3.hacerReservacionSencilla();
        registro3.hacerReservacionDoble();
        registro3.hacerReservacionSuite();
        registro3.hacerReservacionKing();
        registro3.hacerReservacionPresidencial();
        System.out.println(registro3.toString());
        registro3.eliminarReservacionSencilla();
        registro3.eliminarReservacionDoble();
        registro3.eliminarReservacionSuite();
        registro3.eliminarReservacionKing();
        registro3.eliminarReservacionPresidencial();
        System.out.println(registro3.toString());
        
        //Aqui se prueban las reservaciones de habitaciones con servicios con vista al mar//
        conServiciosConVistaAlMar registro4=new conServiciosConVistaAlMar("asd", "3pm", "12pm", 5,22, 1, 7, 999);
        System.out.println(registro4.toString());
        registro4.hacerReservacionSencilla();
        registro4.hacerReservacionDoble();
        registro4.hacerReservacionSuite();
        registro4.hacerReservacionKing();
        registro4.hacerReservacionPresidencial();
        System.out.println(registro4.toString());
        registro4.eliminarReservacionSencilla();
        registro4.eliminarReservacionDoble();
        registro4.eliminarReservacionSuite();
        registro4.eliminarReservacionKing();
        registro4.eliminarReservacionPresidencial();
        System.out.println(registro4.toString());
        
        //Aqui se prueban las reservaciones de habitaciones con servicios con vista al campo de golf//
        conServiciosConVistaAlCampoDeGolf registro5=new conServiciosConVistaAlCampoDeGolf("asd", "3pm", "12pm", 500, 400, 300, 200,100);
        System.out.println(registro5.toString());
        registro5.hacerReservacionSencilla();
        registro5.hacerReservacionDoble();
        registro5.hacerReservacionSuite();
        registro5.hacerReservacionKing();
        registro5.hacerReservacionPresidencial();
        System.out.println(registro5.toString());
        registro5.eliminarReservacionSencilla();
        registro5.eliminarReservacionDoble();
        registro5.eliminarReservacionSuite();
        registro5.eliminarReservacionKing();
        registro5.eliminarReservacionPresidencial();
        System.out.println(registro5.toString());
    }
}
