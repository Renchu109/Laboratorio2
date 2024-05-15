package ClasesGenericas_09_05.EjemplosEnClase.Ejercicio4Comodin;

public class PruebaComodin {
    public static void main(String[] args) {
        Producto producto = new Producto("Televisor",499.99);
        producto.agregarCaracteristica("Pantalla LED");
        producto.agregarCaracteristica(55);
        producto.agregarCaracteristica(4.5);

        System.out.println(producto);
    }
}
