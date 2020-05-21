package Hotel;
import Hotel.habitaciones;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class sinServiciosSinVistas extends habitaciones {
    String datos;

    public sinServiciosSinVistas() {
    }

    public sinServiciosSinVistas(String datos, String horaDeEntrada, String horaDeSalida, int numeroDeReservacionesSencilla, int numeroDeReservacionesDoble, int numeroDeReservacionesSuite, int numeroDeReservacionesKing, int numeroDeReservacionesPresidencial) {
        super(horaDeEntrada, horaDeSalida, numeroDeReservacionesSencilla, numeroDeReservacionesDoble, numeroDeReservacionesSuite, numeroDeReservacionesKing, numeroDeReservacionesPresidencial);
        this.datos = datos;
    }
    
    
    
    public int hacerReservacionSencilla(){
        numeroDeReservacionesSencilla++;
        return numeroDeReservacionesSencilla;
    }
    public int eliminarReservacionSencilla(){
        numeroDeReservacionesSencilla--;
        return numeroDeReservacionesSencilla;
    }
    
    public int hacerReservacionDoble(){
        numeroDeReservacionesDoble++;
        return numeroDeReservacionesDoble;
    }
    
    public int eliminarReservacionDoble(){
        numeroDeReservacionesDoble--;
        return numeroDeReservacionesDoble;
    }
        public int hacerReservacionSuite(){
        numeroDeReservacionesSuite++;
        return numeroDeReservacionesSuite;
    }
    
    public int eliminarReservacionSuite(){
        numeroDeReservacionesSuite--;
        return numeroDeReservacionesSuite;
    }
        public int hacerReservacionKing(){
        numeroDeReservacionesKing++;
        return numeroDeReservacionesKing;
    }
    
    public int eliminarReservacionKing(){
        numeroDeReservacionesKing--;
        return numeroDeReservacionesKing;
    }
        public int hacerReservacionPresidencial(){
        numeroDeReservacionesPresidencial++;
        return numeroDeReservacionesPresidencial;
    }
    
    public int eliminarReservacionPresidencial(){
        numeroDeReservacionesPresidencial--;
        return numeroDeReservacionesPresidencial;
    }

    @Override
    public String toString() {
        return "Habitaciones sin servicios incluidos\n" + 
                "Numero De Reservaciones de habitaciones sencillas(cama matrimonial) con un costo de $1600.00= " + this.numeroDeReservacionesSencilla +
                "\nNumero de reservaciones de habitaciones dobles(dos camas matrimoniales) con un costo de $2650.00= "+ this.numeroDeReservacionesDoble +
                "\nNumero de reservaciones de habitaciones suites(mini bar, jacuzzi cama King size) con un costo de $4890.00= "+ this.numeroDeReservacionesSuite +
                "\nNumero de reservaciones de habitaciones kings(sala, mini bar, alberca, cama King size) con un costo de $6250.00= " + this.numeroDeReservacionesKing + 
                "\nNumero de reservaciones de habitaciones presidenciales(recibidor, sala, bar, alberca, dos camas King size) con un costo de $8100.00= " + this.numeroDeReservacionesPresidencial;
    }
    
}
