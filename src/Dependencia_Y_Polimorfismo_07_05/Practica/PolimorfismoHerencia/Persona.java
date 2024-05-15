package Dependencia_Y_Polimorfismo_07_05.Practica.PolimorfismoHerencia;

public abstract class Persona {
    private String nombre;
    private double altura;
    private int edad;

    public Persona(String nombre, double altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void mostrar();
}
