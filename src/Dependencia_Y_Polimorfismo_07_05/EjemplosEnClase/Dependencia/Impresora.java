package Dependencia_Y_Polimorfismo_07_05.EjemplosEnClase.Dependencia;

public class Impresora {
    private String modelo;
    private Papel papel;

    public Impresora(String modelo, Papel papel) {
        this.modelo = modelo;
        this.papel = papel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }
    public void encender(){
        System.out.println("\nEncenciendo impresora...\n");
    }

    public void imprimir(String informacion){
        System.out.println("Imprimiendo en papel "+informacion);
    }

    public void apagar(){
        System.out.println("\nApagando impresora...");
    }
}
