package ClasesGenericas_09_05.TPclasesGenericas.Ejercicio3;

import java.util.List;

public class Almacen {
    public void agregarProductos(List<Producto> productosAlmacen){
        System.out.println("---------------------------------------");
        System.out.println("Agregando productos al almacén...");
    }
    public void imprimirProductos(List<? extends Producto> listaProductos){
        for (Producto prod:listaProductos){
            System.out.println("*Producto: "+prod.getNombre());
            System.out.println("*Precio: $"+prod.getPrecio());
            System.out.println("---------------------------");
        }
    }
}
