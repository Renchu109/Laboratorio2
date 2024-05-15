package Dependencia_Y_Polimorfismo_07_05.EjemplosEnClase.PolimorfismoHerencia;

public class Leon extends Animal{
    private String sexo;

    public Leon(String tipo, String sexo) {
        super(tipo);
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public void comer() {
        System.out.println("Soy un león "+sexo+" y como Carne");
    }
}
