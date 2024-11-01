public class Calculadora {
    Operacion operacion;

    public Calculadora(Operacion operacion) {
        this.operacion = operacion;
    }

    public double calcular(double num1, double num2) {
        return operacion.operacion(num1,num2);
    }
}
