package Cosas.Herencia;

public class Pajaro extends Animal implements Volador, Cantor{
    protected String plumaje;

    public Pajaro(String plumaje) {
        this.plumaje = plumaje;
    }

    public Pajaro(String raza, int edad, String plumaje) {
        super(raza, edad);
        this.plumaje = plumaje;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    public void mostrarDatosPajaro(){
        System.out.println(" ");
        System.out.println("-------------------");
        System.out.println("PAJARO");
        System.out.println("Raza: "+raza);
        System.out.println("Plumaje: "+plumaje);
        System.out.println("Edad: "+edad);
    }

    @Override
    void comer() {
        System.out.println("El pájaro come alpiste");
    }

    @Override
    public void volar() {
        System.out.println("El pájaro vuela con sus alas");
    }

    @Override
    public void cantar() {
        System.out.println("El pájaro canta con su pico");
    }
}
