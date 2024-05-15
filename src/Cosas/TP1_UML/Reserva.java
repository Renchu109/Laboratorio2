package Cosas.TP1_UML;

public class Reserva {

    private int numReserva;

    public Reserva() {
    }

    public Reserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    private Vuelo vuelo;      //agregacion

    public Vuelo getVuelo() {
        return vuelo;
    }

    //setter innecesario
    public void agregarVuelo(Vuelo vuelo1){
        this.vuelo = vuelo1;
    }
}
