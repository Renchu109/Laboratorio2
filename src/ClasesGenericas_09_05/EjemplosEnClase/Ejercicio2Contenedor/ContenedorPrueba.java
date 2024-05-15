package ClasesGenericas_09_05.EjemplosEnClase.Ejercicio2Contenedor;

public class ContenedorPrueba {
    public static void main(String[] args) {
        //Creando instancia de Contenedor con String
        Contenedor<String> contenedorString = new Contenedor<>("Hola Mundo");
        System.out.println("Contenido del contenedor String: "+contenedorString.getElemento());

        //Creando instancia de Contenedor con Integer
        Contenedor<Integer> contenedorInteger = new Contenedor<>(1);
        System.out.println("Contenido del contenedor Integer: "+contenedorInteger.getElemento());

        //Creando instancia de Contenedor con objeto de cualquier tipo
        Contenedor<?> contenedorDesconocido = new Contenedor<>(true);
        System.out.println("Contenido del contenedor desconocido: "+contenedorDesconocido.getElemento());
    }
}
