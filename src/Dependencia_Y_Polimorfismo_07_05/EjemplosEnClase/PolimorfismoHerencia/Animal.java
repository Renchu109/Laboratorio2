package Dependencia_Y_Polimorfismo_07_05.EjemplosEnClase.PolimorfismoHerencia;

public abstract class Animal {
    private String Tipo;

    public Animal(String tipo) {
        Tipo = tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public abstract void comer();
}
