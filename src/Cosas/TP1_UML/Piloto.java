package Cosas.TP1_UML;

public class Piloto extends Persona implements Volador{
    private int aniosExperiencia;

    public Piloto() {
    }

    public Piloto(String nombre, String apellido, int edad, int aniosExperiencia) {
        super(nombre, apellido, edad);
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void mostrarDatosPiloto(){
        System.out.println("----------------------");
        System.out.println("DATOS DEL PILOTO");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Exeriencia: "+aniosExperiencia+" años");
    }
    @Override
    void comer() {
        System.out.println("El piloto come en su descanso");
    }

    @Override
    public void volar() {
        System.out.println("El piloto vuela en su avión");
    }
}
