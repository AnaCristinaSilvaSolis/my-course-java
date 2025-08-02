package Temario.POO.Herencia.Bank;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros bancolombia = new CuentaAhorros();

        bancolombia.getSaldo();
        bancolombia.getNroCuenta();
        bancolombia.setNroCuenta(123456);
        bancolombia.depositar(2000);
        bancolombia.aplicarInteres();
        bancolombia.depositar(50000);
        bancolombia.depositar(150000);
        bancolombia.aplicarInteres();

        System.out.println(bancolombia);
    }
}
