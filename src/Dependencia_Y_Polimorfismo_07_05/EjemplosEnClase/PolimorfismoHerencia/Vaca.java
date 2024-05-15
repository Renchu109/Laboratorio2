package Dependencia_Y_Polimorfismo_07_05.EjemplosEnClase.PolimorfismoHerencia;

public class Vaca extends Animal{
    private String color;

    public Vaca(String tipo, String color) {
        super(tipo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void comer() {
        System.out.println("Soy una vaca "+color+" y como pasto");
    }
}
