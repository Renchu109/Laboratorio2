package Dependencia_Y_Polimorfismo_07_05.Practica.PolimorfismoHerencia;

public class Gerente extends Persona{
    private String seccion;

    public Gerente(String nombre, double altura, int edad, String seccion) {
        super(nombre, altura, edad);
        this.seccion = seccion;
    }

    @Override
    public void mostrar() {
        System.out.println("\n"+getClass().getSimpleName().toUpperCase());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Altura: "+getAltura());
        System.out.println("Sección: "+seccion);
    }
}
