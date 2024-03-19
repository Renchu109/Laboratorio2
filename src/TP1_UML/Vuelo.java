package TP1_UML;

public class Vuelo {
    private int numeroVuelo;

    public Vuelo() {
    }

    private Reserva reserva;  //agregacion

    public Vuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Reserva getReserva() {
        return reserva;
    }

    //setter de reserva innecesario

    public void agregarReserva(Reserva reserva1){
        this.reserva = reserva1;
    }
}
