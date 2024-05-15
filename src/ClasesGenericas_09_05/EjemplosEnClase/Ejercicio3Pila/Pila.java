package ClasesGenericas_09_05.EjemplosEnClase.Ejercicio3Pila;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pila<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public boolean estaVacia(){//Verificar si la lista está vacía
        return elementos.isEmpty();
    }
    public int tamanio(){//Ver tamaño de la pila
        return elementos.size();
    }
    public void push(T dato){//Empujar (agregar) dato a la pila
        elementos.add(dato);
    }
    public T pop(){//Remover un elemento de la pila
        if(estaVacia()){
            throw new EmptyStackException();
        }
        return elementos.remove(elementos.size()-1);
    }
    public T peek(){//Obtener el último elemento de la pila
        if(estaVacia()){
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size()-1);
    }
}
