package TP1_UML;

public class Avion {
    private int pasajeros;

    public Avion() {
    }

    public Avion(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void viajar(){
        System.out.println("El viaje está por empezar");
    }
}
