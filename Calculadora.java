public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }
    public int resta(int a, int b) {
        return a - b;
    }
    public int multiplicar(int a, int b) {
        return a * b;
    }
    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("División por cero no permitida");
        }
    }

}
