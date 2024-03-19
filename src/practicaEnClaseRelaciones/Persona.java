package practicaEnClaseRelaciones;

public class Persona {
    private String nombre;
    private int edad;

    private Curso curso; //agregación ---> opcional
    private Domicilio domicilio; //composición ---> obliga


    public Persona(String nombre, int edad, String calle, int numero) {
        this.nombre = nombre;                                             //composicion --> obliga
        this.edad = edad;
        this.domicilio = new Domicilio(calle, numero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Curso getCurso() {
        return curso;
    }

    //No se necesita set de curso porque ya esta el metodo agregarCurso

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void agregarCurso(Curso curso1){
        this.curso = curso1;                    //agregación ---> opcional
    }

    public void caminar(int km){
        System.out.println("Caminé "+km+" km");
    }

    public void mostrarDatos(){
        System.out.println("---------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Domicilio: "+domicilio.getCalle()+" "+domicilio.getNumero());

        if (this.curso != null){
            System.out.println("Curso: "+curso.getNombre());
        }

    }
}
