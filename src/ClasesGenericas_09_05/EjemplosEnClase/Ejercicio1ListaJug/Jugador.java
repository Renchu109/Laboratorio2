package ClasesGenericas_09_05.EjemplosEnClase.Ejercicio1ListaJug;

public class Jugador {
    private String nombreJugador;
    private int edad;
    private double altura;

    public Jugador(String nombreJugador, int edad, double altura) {
        this.nombreJugador = nombreJugador;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}