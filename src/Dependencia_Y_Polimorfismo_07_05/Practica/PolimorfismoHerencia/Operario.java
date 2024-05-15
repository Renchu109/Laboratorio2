package Dependencia_Y_Polimorfismo_07_05.Practica.PolimorfismoHerencia;

public class Operario extends Persona{
    private String trabajo;

    public Operario(String nombre, double altura, int edad, String trabajo) {
        super(nombre, altura, edad);
        this.trabajo = trabajo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public void mostrar() {
        System.out.println("\n"+getClass().getSimpleName().toUpperCase());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Altura: "+getAltura());
        System.out.println("Trabajo: "+trabajo);
    }
}
