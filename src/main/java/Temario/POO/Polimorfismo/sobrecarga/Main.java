package Temario.POO.Polimorfismo.sobrecarga;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.sumar(2, 5));
        System.out.println(calculadora.sumar(2.1, 5.2));
        System.out.println(calculadora.sumar(2, 5, 10));
    }
}
