package Dependencia_Y_Polimorfismo_07_05.EjemplosEnClase.PolimorfismoSobrecarga;

public class TestSobrecarga {
    public static void main(String[] args) {
        Sobrecarga sobrecarga = new Sobrecarga("Primera sobrecarga\n");

        System.out.println(sobrecarga.getNombre());
        sobrecarga.test();
        sobrecarga.test(1);
        sobrecarga.test(1,2);
        sobrecarga.test(4.5);
    }
}
