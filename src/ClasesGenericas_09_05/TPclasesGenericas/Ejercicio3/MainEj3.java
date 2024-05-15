package ClasesGenericas_09_05.TPclasesGenericas.Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class MainEj3 {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Salsa de tomate",2000);
        Producto producto2 = new Producto("Jabón líquido",1500);
        Producto producto3 = new Producto("Detergente",900);
        Producto producto4 = new Producto("Arroz",1200);
        Producto producto5 = new Producto("Dentífrico",1800);

        List<Producto> listaAlimentos = new ArrayList<>();
        listaAlimentos.add(producto1);
        listaAlimentos.add(producto4);

        List<Producto> listaHigiene = new ArrayList<>();
        listaHigiene.add(producto2);
        listaHigiene.add(producto5);

        List<Producto> listaLimpieza = new ArrayList<>();
        listaLimpieza.add(producto3);

        Almacen almacen = new Almacen();
        almacen.agregarProductos(listaAlimentos);
        almacen.agregarProductos(listaHigiene);
        almacen.agregarProductos(listaLimpieza);

        System.out.println("\nALIMENTOS");
        almacen.imprimirProductos(listaAlimentos);
        System.out.println("HIGIENE");
        almacen.imprimirProductos(listaHigiene);
        System.out.println("LIMPIEZA");
        almacen.imprimirProductos(listaLimpieza);
    }
}
