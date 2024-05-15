package ClasesGenericas_09_05.TPclasesGenericas.Ejercicio4;

import java.util.List;

public class Almacen {
    public <Producto> void agregarElemento(List<? super Producto> listaElementos, Producto elemento){
        listaElementos.add(elemento);
    }

    public <Producto> void imprimirProductos(List<? super Producto> listaProductos){
        System.out.println("Lista de productos");
        for (Object prod:listaProductos){
            System.out.println("*"+prod);
        }
    }
}
