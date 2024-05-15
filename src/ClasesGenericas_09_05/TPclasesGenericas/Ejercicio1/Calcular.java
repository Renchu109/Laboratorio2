package ClasesGenericas_09_05.TPclasesGenericas.Ejercicio1;

public class Calcular<T extends Number> implements Operable{
    private T var1;
    private T var2;

    public Calcular(T var1, T var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public T getVar2() {
        return var2;
    }

    public void setVar2(T var2) {
        this.var2 = var2;
    }

    @Override
    public Number sumar(Number var1, Number var2) {
        if(var1 instanceof Double || var2 instanceof Double){
            return (T) Double.valueOf(var1.doubleValue()+ var2.doubleValue());
        } else if (var1 instanceof Integer && var2 instanceof Integer) {
            return (T) Integer.valueOf(var1.intValue()+var2.intValue());
        } else {
            throw new IllegalArgumentException("No se pudo leer el tipo de dato");
        }
    }

    @Override
    public Number restar(Number var1, Number var2) {
        if(var1 instanceof Double || var2 instanceof Double){
            return (T) Double.valueOf(var1.doubleValue()-var2.doubleValue());
        } else if (var1 instanceof Integer && var2 instanceof Integer) {
            return (T) Integer.valueOf(var1.intValue()-var2.intValue());
        } else {
            throw new IllegalArgumentException("No se pudo leer el tipo de dato");
        }
    }

    @Override
    public Number multiplicar(Number var1, Number var2) {
        if(var1 instanceof Double || var2 instanceof Double){
            return (T) Double.valueOf(var1.doubleValue()*var2.doubleValue());
        } else if (var1 instanceof Integer && var2 instanceof Integer) {
            return (T) Integer.valueOf(var1.intValue()*var2.intValue());
        } else {
            throw new IllegalArgumentException("No se pudo leer el tipo de dato");
        }
    }

    @Override
    public Number dividir(Number var1, Number var2) {
        if(var2.doubleValue() == 0.00){
            throw new ArithmeticException("ERROR: División por cero");
        }
        else if(var1 instanceof Integer || var1 instanceof Double){
            return (T) Double.valueOf(var1.doubleValue()/var2.doubleValue());
        } else {
            throw new IllegalArgumentException("Tipo de dato no soportado");
        }
    }

    @Override
    public String toString() {
        return "\nCalcular{" +
                "var1=" + var1 +
                ", var2=" + var2 +
                '}';
    }
}
