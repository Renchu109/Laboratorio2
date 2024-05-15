package ClasesGenericas_09_05.EjemplosEnClase.Ejercicio5ComodinExtendido;

import java.util.List;

public class ImpresoraNumerica {
    public void imprimirNumeros(List<? extends Number>listaNumeros){
        for (Number num:listaNumeros){
            System.out.println(num);
        }
    }
}
