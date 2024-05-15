package ClasesGenericas_09_05.TPclasesGenericas.Ejercicio1;

public class MainEj1 {
    public static void main(String[] args) {
        Calcular<Integer> primerCalculo = new Calcular<>(21,7);
        Calcular<Double> segundoCalculo = new Calcular<>(4.5,8.5);

        System.out.println(primerCalculo);
        System.out.println("Suma: "+primerCalculo.getVar1()+" + "+primerCalculo.getVar2()+" = "+primerCalculo.sumar(primerCalculo.getVar1(),primerCalculo.getVar2()));
        System.out.println("Resta: "+primerCalculo.getVar1()+" - "+primerCalculo.getVar2()+" = "+primerCalculo.restar(primerCalculo.getVar1(),primerCalculo.getVar2()));
        System.out.println("Multiplicación: "+primerCalculo.getVar1()+" x "+primerCalculo.getVar2()+" = "+primerCalculo.multiplicar(primerCalculo.getVar1(),primerCalculo.getVar2()));
        System.out.println("División: "+primerCalculo.getVar1()+" / "+primerCalculo.getVar2()+" = "+primerCalculo.dividir(primerCalculo.getVar1(),primerCalculo.getVar2()));

        System.out.println(segundoCalculo);
        System.out.println("Suma: "+segundoCalculo.getVar1()+" + "+segundoCalculo.getVar2()+" = "+segundoCalculo.sumar(segundoCalculo.getVar1(),segundoCalculo.getVar2()));
        System.out.println("Resta: "+segundoCalculo.getVar1()+" - "+segundoCalculo.getVar2()+" = "+segundoCalculo.restar(segundoCalculo.getVar1(),segundoCalculo.getVar2()));
        System.out.println("Multiplicación: "+segundoCalculo.getVar1()+" x "+segundoCalculo.getVar2()+" = "+segundoCalculo.multiplicar(segundoCalculo.getVar1(),segundoCalculo.getVar2()));
        System.out.println("División: "+segundoCalculo.getVar1()+" / "+segundoCalculo.getVar2()+" = "+segundoCalculo.dividir(segundoCalculo.getVar1(),segundoCalculo.getVar2()));

    }
}
