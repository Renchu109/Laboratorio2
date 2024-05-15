package Dependencia_Y_Polimorfismo_07_05.Practica.PolimorfismoCohercion;

public class CohercionMain {
    public static void main(String[] args) {
        Division division = new Division(9,6);
        System.out.println("División: "+division.getNum1()+" / "+division.getNum2()+" = "+division.dividir(division.getNum1(), division.getNum2()));
    }
}
