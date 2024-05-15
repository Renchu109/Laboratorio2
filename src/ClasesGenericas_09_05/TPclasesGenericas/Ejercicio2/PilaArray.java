package ClasesGenericas_09_05.TPclasesGenericas.Ejercicio2;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class PilaArray<E> {
    private E[] array;
    private int contador = 0;

    public PilaArray(int tamanio) {
        array = (E[]) new Object[tamanio];
    }

    public boolean estaVacia(){
        return contador == 0;
    }

    public int tamanio(){
        return array.length;
    }

    public void push(E dato){
        if(contador <= (array.length-1)){
            System.out.println("Dato agregado: "+dato);
            array[contador] = dato;
            contador ++;
        }else {
            System.out.println("Arreglo lleno. No se agregó el dato: "+dato);
        }
    }

    public E pop(int indice){
        if(estaVacia()){
           throw new NoSuchElementException("El arreglo está vacío");
        }else {
            return array[indice] = null;
        }
    }

    public E peek(){
        if(estaVacia()){
            throw new NoSuchElementException("El arreglo está vacío");
        }else {
            return array[array.length-1];
        }
    }

    @Override
    public String toString() {
        return "PilaArray{" +
                "array=" + Arrays.toString(array) +
                ", contador=" + contador +
                '}';
    }
}
