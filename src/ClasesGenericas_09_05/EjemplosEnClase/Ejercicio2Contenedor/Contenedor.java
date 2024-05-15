package ClasesGenericas_09_05.EjemplosEnClase.Ejercicio2Contenedor;

public class Contenedor<T> {
    private T elemento;

    public Contenedor(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
}
