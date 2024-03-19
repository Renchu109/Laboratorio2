package TP1_UML;

public class Main {
    public static void main(String[] args) {

        Avion a1 = new Avion(50,1);
        Piloto p1 = new Piloto("Renzo","Di Laudo",20,15);

        a1.mostrarDatosAvion();
        a1.viajar();

        p1.mostrarDatosPiloto();
        p1.comer();
        p1.volar();

    }
}
