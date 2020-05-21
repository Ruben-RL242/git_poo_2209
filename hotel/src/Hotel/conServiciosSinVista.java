/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;
import Hotel.habitaciones;
/**
 *
 * @author crist
 */
public class conServiciosSinVista extends habitaciones{
    String datos;

    public conServiciosSinVista() {
    }

    public conServiciosSinVista(String datos, String horaDeEntrada, String horaDeSalida, int numeroDeReservacionesSencilla, int numeroDeReservacionesDoble, int numeroDeReservacionesSuite, int numeroDeReservacionesKing, int numeroDeReservacionesPresidencial) {
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
        return "\nHabitaciones con servicios incluidos\n" + 
                "Numero De Reservaciones de habitaciones sencillas(cama matrimonial) con un costo de $2200.00= " + this.numeroDeReservacionesSencilla +
                "\nNumero de reservaciones de habitaciones dobles(dos camas matrimoniales) con un costo de $3650.00= "+ this.numeroDeReservacionesDoble +
                "\nNumero de reservaciones de habitaciones suites(mini bar, jacuzzi cama King size) con un costo de $5950.00= "+ this.numeroDeReservacionesSuite +
                "\nNumero de reservaciones de habitaciones kings(sala, mini bar, alberca, cama King size) con un costo de $7850.00= " + this.numeroDeReservacionesKing + 
                "\nNumero de reservaciones de habitaciones presidenciales(recibidor, sala, bar, alberca, dos camas King size) con un costo de $9950.00= " + this.numeroDeReservacionesPresidencial;
    }
}
