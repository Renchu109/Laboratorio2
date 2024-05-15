package Dependencia_Y_Polimorfismo_07_05.EjemplosEnClase.PolimorfismoSobrecarga;

public class Sobrecarga {
    private String nombre;

    public Sobrecarga(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void test(){
        System.out.println("Prueba vacía");
    }
    public void test(int variable){
        System.out.println("Hay 1 entero: "+variable);
    }
    public void test(int variable1,int variable2){
        System.out.println("Hay 2 enteros: "+variable1+" y "+variable2);
    }
    public void test(double varDouble){
        System.out.println("Hay un double: "+varDouble);
    }
}
