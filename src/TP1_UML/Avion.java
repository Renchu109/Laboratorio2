package TP1_UML;

public class Avion {
    private int pasajeros;

    public Avion() {
    }


    private Flota flota; //composicion
    private Vuelo vuelo; //agregacion

    public Avion(int pasajeros, int cantidad) {       //composicion
        this.pasajeros = pasajeros;
        this.flota = new Flota(cantidad);
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    //set de vuelo innecesario

    public void agregarVuelo(Vuelo vuelo1){
        this.vuelo = vuelo1;                         //agregación
    }

    public void mostrarDatosAvion(){
        System.out.println("---------------------");
        System.out.println("DATOS DEL AVIÓN");
        System.out.println("Cantidad de pasajeros: "+pasajeros);
        System.out.println("Cantidad de aviones de la flota: "+flota.getCantidad());
    }
    public void viajar(){
        System.out.println("El viaje está por comenzar");
    }
}
