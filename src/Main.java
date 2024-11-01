//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Suma sumar = new Suma();
        Calculadora calculadora = new Calculadora(sumar);
        System.out.println("sumar: " + calculadora.calcular(5,2));

        Calculadora calculadoraResta = new Calculadora(new Resta());
        System.out.println("Resta: " + calculadoraResta.calcular(5,2));
    }
}