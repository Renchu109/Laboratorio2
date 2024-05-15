package Dependencia_Y_Polimorfismo_07_05.Practica.Dependencia;

public class PracticaDependencia {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Renzo","Di Laudo",20);
        Escuela escuela = new Escuela("UTN",alumno1);

        System.out.println("\nEl alumno "+escuela.getAlumno().getNombreAlumno()+" "+escuela.getAlumno().getApellidoAlumno()+" de "+escuela.getAlumno().getEdad()+" años va a la "+escuela.getNombre());
    }
}
