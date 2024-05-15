package Dependencia_Y_Polimorfismo_07_05.EjemplosEnClase.PolimorfismoHerencia;

public class MainHerencia {
    public static void main(String[] args) {
        Leon leon = new Leon("Felino","Macho");
        Vaca vaca = new Vaca("Vacuno","Marrón");

        vaca.comer();
        leon.comer();
    }
}
