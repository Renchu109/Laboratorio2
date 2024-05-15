package Dependencia_Y_Polimorfismo_07_05.Practica.PolimorfismoSobrecarga;

public class MainSobrecarga {
    public static void main(String[] args) {
        Sobrecarga sobrecarga = new Sobrecarga();

        System.out.println("Sobrecarga vacía: "+sobrecarga.prueba());
        System.out.println("Un número (retorna su potencia): "+sobrecarga.prueba(7));
        System.out.println("Dos números (retorna su suma): "+sobrecarga.prueba(7,23));
        System.out.println("Un double (retorna su parte entera): "+sobrecarga.prueba(5.34));
    }
}
