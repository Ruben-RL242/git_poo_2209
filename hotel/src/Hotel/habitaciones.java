package Hotel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class habitaciones {
    private String horaDeEntrada;
    private String horaDeSalida;
    int numeroDeReservacionesSencilla;
    int numeroDeReservacionesDoble;
    int numeroDeReservacionesSuite;
    int numeroDeReservacionesKing;
    int numeroDeReservacionesPresidencial; 

    public habitaciones() {
    }

    public habitaciones(String horaDeEntrada, String horaDeSalida, int numeroDeReservacionesSencilla, int numeroDeReservacionesDoble, int numeroDeReservacionesSuite, int numeroDeReservacionesKing, int numeroDeReservacionesPresidencial) {
        this.horaDeEntrada = horaDeEntrada;
        this.horaDeSalida = horaDeSalida;
        this.numeroDeReservacionesSencilla = numeroDeReservacionesSencilla;
        this.numeroDeReservacionesDoble = numeroDeReservacionesDoble;
        this.numeroDeReservacionesSuite = numeroDeReservacionesSuite;
        this.numeroDeReservacionesKing = numeroDeReservacionesKing;
        this.numeroDeReservacionesPresidencial = numeroDeReservacionesPresidencial;
    }

    public String getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(String horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public int getNumeroDeReservacionesSencilla() {
        return numeroDeReservacionesSencilla;
    }

    public void setNumeroDeReservacionesSencilla(int numeroDeReservacionesSencilla) {
        this.numeroDeReservacionesSencilla = numeroDeReservacionesSencilla;
    }

    public int getNumeroDeReservacionesDoble() {
        return numeroDeReservacionesDoble;
    }

    public void setNumeroDeReservacionesDoble(int numeroDeReservacionesDoble) {
        this.numeroDeReservacionesDoble = numeroDeReservacionesDoble;
    }

    public int getNumeroDeReservacionesSuite() {
        return numeroDeReservacionesSuite;
    }

    public void setNumeroDeReservacionesSuite(int numeroDeReservacionesSuite) {
        this.numeroDeReservacionesSuite = numeroDeReservacionesSuite;
    }

    public int getNumeroDeReservacionesKing() {
        return numeroDeReservacionesKing;
    }

    public void setNumeroDeReservacionesKing(int numeroDeReservacionesKing) {
        this.numeroDeReservacionesKing = numeroDeReservacionesKing;
    }

    public int getNumeroDeReservacionesPresidencial() {
        return numeroDeReservacionesPresidencial;
    }

    public void setNumeroDeReservacionesPresidencial(int numeroDeReservacionesPresidencial) {
        this.numeroDeReservacionesPresidencial = numeroDeReservacionesPresidencial;
    }


    
}
