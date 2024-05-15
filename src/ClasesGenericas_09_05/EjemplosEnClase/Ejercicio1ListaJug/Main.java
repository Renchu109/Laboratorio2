package ClasesGenericas_09_05.EjemplosEnClase.Ejercicio1ListaJug;

public class Main {
    public static void main(String[] args) {
        Equipo<String> equipoFutbol = new Equipo<>("Equipo de futbol");
        equipoFutbol.agregarJugador("Messi");
        equipoFutbol.agregarJugador("Neymar");
        equipoFutbol.agregarJugador("Suárez");
        equipoFutbol.mostrarJugadores();

        Equipo<Integer> equipoBaloncessto = new Equipo<>("Equipo de baloncesto");
        equipoBaloncessto.agregarJugador(3);
        equipoBaloncessto.agregarJugador(8);
        equipoBaloncessto.agregarJugador(14);
        equipoBaloncessto.mostrarJugadores();

        Equipo<Jugador> equipoRugby = new Equipo<>("Equipo de rugby");
        Jugador jug1 = new Jugador("Nicolás Sánchez",30,1.78);
        Jugador jug2 = new Jugador("Luciano Fernández",27,1.86);
        Jugador jug3 = new Jugador("Jorge González",23,1.82);
        equipoRugby.agregarJugador(jug1);
        equipoRugby.agregarJugador(jug2);
        equipoRugby.agregarJugador(jug3);
    }
}