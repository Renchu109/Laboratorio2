package Dependencia_Y_Polimorfismo_07_05.Practica.PolimorfismoCohercion;

public class Division {
    private int num1;
    private int num2;

    public Division() {
    }

    public Division(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double dividir(int num1, int num2){

        return (double) num1/num2;
    }
}
