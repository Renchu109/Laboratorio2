package Dependencia_Y_Polimorfismo_07_05.Practica.PolimorfismoSobrecarga;

public class Sobrecarga {
    public int prueba(){
        return 0;
    }
    public int prueba(int num){
        return num*num;
    }
    public int prueba(int num1, int num2){
        return num1+num2;
    }
    public double prueba(double num){
        return (int) num;
    }
}
