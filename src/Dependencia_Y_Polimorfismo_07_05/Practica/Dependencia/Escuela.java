package Dependencia_Y_Polimorfismo_07_05.Practica.Dependencia;

public class Escuela {
    private String nombre;
    private Alumno alumno;

    public Escuela(String nombre, Alumno alumno) {
        this.nombre = nombre;
        this.alumno = alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
