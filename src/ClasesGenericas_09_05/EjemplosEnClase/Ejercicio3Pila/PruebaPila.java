package ClasesGenericas_09_05.EjemplosEnClase.Ejercicio3Pila;

public class PruebaPila {
    public static void main(String[] args) {
        //Creando pila de enteros
        Pila<Integer> pila1 = new Pila<>();
        //Agregando elementos a la pila
        pila1.push(1);
        pila1.push(2);
        pila1.push(3);

        System.out.println("Elemento en la cima: " + pila1.peek());
        System.out.println("Tamaño de la pila: " + pila1.tamanio());

        System.out.println("Vaciando pila...");
        //Vaciar pila
        while (!pila1.estaVacia()) {
            pila1.pop();
        }
    }
}
