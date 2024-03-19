package practicaEnClaseRelaciones;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Renzo",20,"Capitán Bermúdez",5579);
        Curso c1 = new Curso("Estadística");

        p1.agregarCurso(c1);

        p1.mostrarDatos();

    }
}
