package Herencia;

public class Main {
    public static void main(String[] args) {

        Pajaro p1 = new Pajaro("fino",3,"Canario");
        Perro per1 = new Perro("Ovejero alemán",5,"Corto");

        p1.mostrarDatosPajaro();
        p1.comer();
        p1.cantar();
        p1.volar();

        per1.mostrarDatosPerro();
        per1.comer();

    }
}
