package Dependencia_Y_Polimorfismo_07_05.Practica.PolimorfismoHerencia;

public class Main {
    public static void main(String[] args) {
        Operario operario = new Operario("Ricardo", 1.80, 55, "Herrero");
        Gerente gerente = new Gerente("Gerardo",1.75,50,"Fundiciones");

        operario.mostrar();
        gerente.mostrar();
    }
}