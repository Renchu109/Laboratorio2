package Dependencia_Y_Polimorfismo_07_05.Practica.PolimorfismoParametrico;

import java.util.ArrayList;
import java.util.List;

public class MainParametrico {
    public static void main(String[] args) {
        List<Papel> papeles = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();

        Papel papel1 = new Papel("A4");
        Integer num1 = 4;

        papeles.add(papel1);
        numeros.add(num1);
    }
}
