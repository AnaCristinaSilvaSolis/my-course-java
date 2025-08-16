package Temario.POO.Polimorfismo.sobrecarga;

public class Calculadora {
    //métodos suma de enteros
    private int sumar(int num1, int num2){
        return num1 + num2;
    }

    //métodos suma de decimales
    protected double sumar(double num1, double num2){
        return num1 + num2;
    }

    //suma de enteros
    public int sumar(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}
