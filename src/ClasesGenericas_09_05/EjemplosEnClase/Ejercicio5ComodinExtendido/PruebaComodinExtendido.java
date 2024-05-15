package ClasesGenericas_09_05.EjemplosEnClase.Ejercicio5ComodinExtendido;

import java.util.ArrayList;
import java.util.List;

public class PruebaComodinExtendido {
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);

        List<Double> listaDoubles = new ArrayList<>();
        listaDoubles.add(1.1);
        listaDoubles.add(2.2);
        listaDoubles.add(3.3);

        ImpresoraNumerica impresora = new ImpresoraNumerica();
        System.out.println("Imprimiendo números enteros");
        impresora.imprimirNumeros(listaEnteros);

        System.out.println("\nImprimiendo números decimales");
        impresora.imprimirNumeros(listaDoubles);
    }
}
