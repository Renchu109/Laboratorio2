package ClasesGenericas_09_05.TPclasesGenericas.Ejercicio1;

public interface Operable<E extends Number> {
    E sumar(E var1, E var2);
    E restar(E var1, E var2);
    E multiplicar(E var1, E var2);
    E dividir(E var1, E var2);
}
