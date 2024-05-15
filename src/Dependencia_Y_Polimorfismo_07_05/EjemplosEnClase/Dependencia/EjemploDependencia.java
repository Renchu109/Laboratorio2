package Dependencia_Y_Polimorfismo_07_05.EjemplosEnClase.Dependencia;

public class EjemploDependencia {
    public static void main(String[] args) {
        Papel papel1 = new Papel("A4");
        Papel papel2 = new Papel("A3");
        Papel papel3 = new Papel("A2");

        Impresora impresora = new Impresora("HP",papel1);

        impresora.encender();
        impresora.imprimir(papel1.getMedida());
        impresora.imprimir(papel2.getMedida());
        impresora.imprimir(papel3.getMedida());
        impresora.apagar();
    }
}
