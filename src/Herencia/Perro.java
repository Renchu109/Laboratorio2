package Herencia;

public class Perro extends Animal{
    private String pelaje;

    public Perro(String pelaje) {
        this.pelaje = pelaje;
    }

    public Perro(String raza, int edad, String pelaje) {
        super(raza, edad);
        this.pelaje = pelaje;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void mostrarDatosPerro(){
        System.out.println(" ");
        System.out.println("-------------------");
        System.out.println("PERRO");
        System.out.println("Raza: "+raza);
        System.out.println("Pelaje: "+pelaje);
        System.out.println("Edad: "+edad);
    }

    @Override
    void comer() {
        System.out.println("El perro come carne");
    }
}
