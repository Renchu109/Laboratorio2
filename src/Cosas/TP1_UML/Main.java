package Cosas.TP1_UML;

public class Main {
    public static void main(String[] args) {

        Avion a1 = new Avion(50,1);
        Piloto p1 = new Piloto("Renzo","Di Laudo",20,15);
        Vuelo v1 = new Vuelo(765);
        Reserva r1 = new Reserva(456);

        a1.mostrarDatosAvion();
        a1.viajar();

        a1.setVuelo(v1);    //asociacion
        System.out.println("Número de vuelo: "+v1.getNumeroVuelo());

        r1.agregarVuelo(v1);
        System.out.println("Número de vuelo de la reserva "+r1.getNumReserva()+": "+v1.getNumeroVuelo());

        p1.mostrarDatosPiloto();
        p1.comer();
        p1.volar();
    }
}
