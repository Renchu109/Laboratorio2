package ClasesGenericas_09_05.TPclasesGenericas.Ejercicio2;

public class MainEj2 {
    public static void main(String[] args) {
        //Crear pila
        PilaArray pila = new PilaArray<>(5);

        System.out.println("----PILA ARRAY----");
        //Comprobar si está vacia
        System.out.println("\n*Pila vacía: "+pila.estaVacia());

        //Ver el tamaño de la pila
        System.out.println("\n*Tamaño de la pila: "+pila.tamanio());

        //Agregar datos a la pila
        System.out.println("\n*Agregando datos");
        pila.push("Renzo");
        pila.push(5);
        pila.push(true);
        pila.push("Ricardo");
        pila.push(6.87);
        pila.push("Gerardo");

        System.out.println(pila);
        //Remover un elemento
        System.out.println("\n*Removiendo elemento del índice 3");
        pila.pop(3);
        System.out.println(pila);

        //Ver último elemento de la pila
        System.out.println("\n*Último elemento: "+pila.peek());
    }
}
