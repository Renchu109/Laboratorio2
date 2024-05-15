package ClasesGenericas_09_05.TPclasesGenericas.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class MainEj4 {
    public static void main(String[] args) {
        Producto prod1 = new Producto("Salsa de tomate",2000);
        Producto prod2 = new Producto("Jabon líquido",1700);

        Almacen almacen = new Almacen();
        List<Producto> productos = new ArrayList<>();
        almacen.agregarElemento(productos, prod1);
        almacen.agregarElemento(productos, prod2);

        almacen.imprimirProductos(productos);
    }
}
